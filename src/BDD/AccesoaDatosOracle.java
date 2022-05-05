/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

/**
 *
 * @author ismael
 */
import java.sql.*;
import java.util.Scanner;

//import com.mysql.jdbc.*;
//import org.sqlite.*;

/**
 * <p>JDBC allows multiple implementations to exist and be used by the same application. 
 *    The API provides a mechanism for dynamically loading the correct Java packages and 
 *    registering them with the JDBC Driver Manager.
 *    The Driver Manager is used as a connection factory for creating JDBC connections.
 *    
 * <p>JDBC connections support creating and executing statements.
 *    JDBC represents <b>statements using one of the following classes</b>:
 *
 *    <ul>
 *      <li><b><code>Statement</code></b>
 *               the statement is sent to the database server each and every time.
 *      <li><b><code>PreparedStatement</b></code> 
 *               the statement is cached and then the execution path is pre-determined on the database server allowing it to be executed multiple times in an efficient manner.
 *      <li><b><code>CallableStatement</b></code> 
 *               used for executing stored procedures on the database.
 *    </ul>
 *
 *<p> 
 *    Statements may be:
 *    <ul>
 *      <li><b><code>update statements</code></b>:  such as SQL's CREATE, INSERT, UPDATE and DELETE, 
 *      <li>or they may be <b><code>query statements</code></b> such as SELECT.
 *      <li>Additionally, <b><code>stored procedures</code></b> may be invoked through a JDBC connection.
 *    </ul>
 *    
 *<p> <b>Update statements</b> such as INSERT, UPDATE and DELETE return an update count 
 *    that indicates how many rows were affected in the database.
 *    These statements do not return any other information.
 *    
 *<p><b>Query statements</b> return a JDBC row result set. 
 *    The row result set is used to walk over the result set. 
 *    Individual columns in a row are retrieved either by name or by column number.
 *    There may be any number of rows in the result set.
 *    The row result set has metadata that describes the names of the columns and their types.
 *
 *<p>There is an extension to the basic JDBC API in the javax.sql
 *
 */

public class AccesoaDatosOracle {

	//----------Add an external JAR file or create a user library with an specific JDBC driver
	
	//-----------------------JDBC driver and URL of each DBMS-------------------------
	
	 //-----whatever DBMS
		//static String prefix="jdbc:"+"dbms";//<----change "dbms" for a real one (mysql, sqlite, ...)
		//static String hostName=""; //local host
     	//						 "//localhost//"; //Linux
	    //                       "\\localhost\\"; //Windows
		//static String urlFolder="C:\\Users\\migue\\Documents\\IES Fernando Aguilar - 2012-2013\\DAM\\AD\\tema2\\sqlite\\BD\\";
		//static String dbName="BDEmpleados.db";
	
		//static String url="jdbc:sqlite:D:/sqlite/BD/BDEmpleados";
	
	
	 //-----MySQL
		static String MySQL_jdbcDriver="com.mysql.jdbc.Driver";
		//static String prefix="jdbc:"+"mysql:";
	
		//static String MySQL_url="jdbc:mysql://localhost/sqlite/BD/BDEmpleados";	
	
	
	 //----sqlite3
		static String sqlite_jdbd_driver="org.sqlite.JDBC";
		static String prefix="jdbc:mysql:";
		static String hostName="http://www.sqlfiddle.com/#!9/ce9812/1";
		static String urlFolder="";
		static String dbName="";
		
		//static String url="jdbc:sqlite:/home/pub/miguelb/ad/tema2/dbms/sqlite3/ejemplo.db"; //Linux
	    //static String url="jdbc:sqlite:D:/sqlite/BD/ejemplo.db";                            //Windows
		                
	   // static String url="jdbc:sqlite:C:\\Users\\migue\\Bibliotecas\\Documentos\\eclipse\\workspace-AD\\tema2.conectores\\ejemploJDBCGestionEmpleados\\src\\database\\ejemplo.db";

		static String url=prefix+hostName+urlFolder+dbName;

		//----jdbcOdbc
		//static String Access_jdbcDriver="sun.jdbc.odbc.JdbcOdbcDriver";
		//static String prefix="jdbc:"+"odbc:";
		
		//static String SQLite_url="jdbc:odbc:D:/sqlite/BD/BDGestionEmpleados";
	
		
	//---------------------------Actual DB parameters-------------------------------
	static String driver=MySQL_jdbcDriver;
	//static String url=prefix+hostName+urlFolder+dbName;
	static String user=""; //"user";
	static String password=""; //"password";
	
	/**
	 * <p>The method <b><code>Class.forName(String)</b></code> is used to load the JDBC driver class. 
	 *    The line below causes the JDBC driver from some jdbc vendor to be loaded into the
	 *    application. (Some JVMs also require the class to be instantiated with .newInstance().).
	 *    In JDBC 4.0, it is no longer necessary to explicitly load JDBC drivers using Class.forName().
	 * 
	 * <p>When a Driver class is loaded, it creates an instance of itself and registers 
	 *    it with the DriverManager. This can be done by including the needed code in 
	 *    the driver class's static block. E.g., DriverManager.registerDriver(Driver driver)
	 *    
	 * <p><code>
	        Class.forName( "com.somejdbcvendor.TheirJdbcDriver" );
	      </code>   
	 *    
	 *     
	 * <p>Now when a connection is needed, one of the DriverManager.getConnection() 
	 *    methods is used to create a JDBC connection.
	 * <p>The URL used is dependent upon the particular JDBC driver.
	 *    It will always begin with the "jdbc:" protocol, but the rest is up to the particular vendor. 
	 *    
	 * <p><code>  
	 *    Connection conn = DriverManager.getConnection(
     *                      "jdbc:somejdbcvendor:other data needed by some jdbc vendor",
     *                      "myLogin",
     *                      "myPassword" );
     *    try {
     *         // you use the connection here 
     *    } finally {
     *           //It's important to close the connection when you are done with it
     *    try { conn.close(); } catch (Throwable ignore) { 
     *                          // Propagate the original exception
     *                          // instead of this one that you may want just logged  }
     *    }
     *    </code>
	 *    
	 *<p>Once a connection is established, a statement can be created.
	 *
	 *  <code>
	 *    Statement stmt = conn.createStatement();
     *    try {
     *         stmt.executeUpdate( "INSERT INTO MyTable( name ) VALUES ( 'my name' ) " );
     *    } finally {
     *    //It's important to close the statement when you are done with it
     *    try { stmt.close(); } catch (Throwable ignore) { 
     *                           // Propagate the original exception
     *                           //instead of this one that you may want just logged }
     *}
     * </code>
	 *    
	 *    
	 *    
	 *<p>Note that Connections, Statements, and ResultSets often tie up operating system 
	 *   resources such as sockets or file descriptors. 
	 *   In the case of Connections to remote database servers,
	 *   further resources are tied up on the server, e.g.,
	 *   cursors for currently open ResultSets. It is vital to close() any JDBC object as
	 *   soon as it has played its part; garbage collection should not be relied upon.
	 *   Forgetting to close() things properly results in spurious errors and misbehaviour.
	 *   The above try-finally construct is a recommended code pattern to use with JDBC objects.
	 *    
	 *<p>If a database operation fails, JDBC raises an SQLException. 
	 *   There is typically very little one can do to recover from such an error,
	 *   apart from logging it with as much detail as possible. 
	 *   It is recommended that the SQLException be translated into 
	 *   an application domain exception (an unchecked one) that eventually 
	 *   results in a transaction rollback and a notification to the user.
	 */
	
	public static void main(String[] args)
	{
	//--------------Utilizando objetos statement---------
		Scanner sc = new Scanner(System.in);
		//Consultas DQL - statement
                /*
                System.out.println("--EJERCICIO 1-- \n");
		statementQueryExample1();
                System.out.println("--EJERCICIO 2-- \n");
                statementQueryExample2();
		System.out.println("--EJERCICIO 3-- \n");
                statementQueryExample3();
                System.out.println("--EJERCICIO 4-- \n");
                statementQueryExample4();
                System.out.println("--EJERCICIO 5.1-- \n");
                statementQueryExample5();
                System.out.println("--EJERCICIO 5.2-- \n");
                statementQueryExample6();
                */
                int opcion;
                do {
                    System.out.println("1. Muestra todos los datos de la tabla EMP indicando nombre de campo para cada");
                    System.out.println("2. Muestra todos los datos de la tabla DEPT");
                    System.out.println("3. Muestra cada empleado con el nombre y localidad de su departamento");
                    System.out.println("4. Obtener el salario medio de cada departamento");
                    System.out.println("5. Por cada departamento mostrar el nombre y salario del empleado que más gane");
                    System.out.println("6. Por cada departamento mostrar el nombre y salario del empleado que menos gane");
                    System.out.println("0. SALIR");
                    System.out.println("Introduce opción:");
                    opcion = sc.nextInt();
                    
                    switch(opcion){
                        
                        case 1:
                            System.out.println("--CONSULTA 1-- \n");
                            statementQueryExample1();
                            break;
                        case 2:
                            System.out.println("--CONSULTA 2-- \n");
                            statementQueryExample2();
                            break;
                        case 3:
                            System.out.println("--CONSULTA 3-- \n");
                            statementQueryExample3();
                            break;
                        case 4:
                            System.out.println("--CONSULTA 4-- \n");
                            statementQueryExample4();
                            break;
                        case 5:
                            System.out.println("--CONSULTA 5-- \n");
                            statementQueryExample5();
                            break;
                        case 6:
                            System.out.println("--CONSULTA 6-- \n");
                            statementQueryExample6();
                            break;
                        case 0:
                            System.out.println("SALIENDO...");
                            break;
                        default:
                            System.out.println("Opción inválida(1-6)");
                            break;
                        
                    }
                
                } while (opcion != 0);

                
                
		//Consultas DML - statement
		 // statementInsertExample();
		 // statementDeleteExample();
		 // statementUpdateExample();

	}
	
	/** <p>Data is retrieved from the database using a database query mechanism. 
	 *    The example 'statementQueryExample' shows creating a statement and executing a query.
	 */
	
	
	public static void statementQueryExample1()
	{
	String query="SELECT * FROM EMP";
				
	 try{	
	 	 //Load the driver in RAM
		// Class.forName(driver);
                 
                 
                 
                 // Load the JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

// Create a connection
/*
            Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@//xxxxx.xxxxx.xxxxx.net:puerto:Servicio", "Usuario", "Password");
*/		
/*
Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@delfos:1521:SCOTT", "alumnoDAM", "uno");
*/
Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     //Connect to DB
		// Connection connection=DriverManager.getConnection(url,user,password);
		// Connection connection=DriverManager.getConnection("jdbc:sqlite:.BDGestionEmpleados.db","","");
		// Connection connection=DriverManager.getConnection(url);
		 //Create statement and execute query, to obtain a 'ResultSet'
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 //Iterate on the 'ResultSet' to process each row
		 while(result.next()){//There are still rows to get
			 //We get data of each row in the right order: getInt, getString, getString
			 System.out.println("NUM: "+result.getInt(1)+"\n"+"NOMBRE: "+result.getString(2)+" "+result.getString(3) + "\n");	 
		 }
		 
		 result.close(); //close ResultSet
		 statement.close();//close Statement
		 connection.close();//close Connection
					
	 }catch(ClassNotFoundException cnfe){  
			System.out.printf("Not found the jdbc driver %s\n", driver);
	 }catch (SQLException sqle){
			System.out.println("SQL Exception");
                        System.out.println(sqle.getMessage());
                      sqle.printStackTrace();
                        
	 }					
	}
	
        public static void statementQueryExample2()
	{
	String query="SELECT * FROM DEPT";
				
	 try{	
	 	 //Load the driver in RAM
		// Class.forName(driver);
                 
                 
                 
                 // Load the JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

// Create a connection
/*
            Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@//xxxxx.xxxxx.xxxxx.net:puerto:Servicio", "Usuario", "Password");
*/		
/*
Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@delfos:1521:SCOTT", "alumnoDAM", "uno");
*/
Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     //Connect to DB
		// Connection connection=DriverManager.getConnection(url,user,password);
		// Connection connection=DriverManager.getConnection("jdbc:sqlite:.BDGestionEmpleados.db","","");
		// Connection connection=DriverManager.getConnection(url);
		 //Create statement and execute query, to obtain a 'ResultSet'
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 //Iterate on the 'ResultSet' to process each row
		 while(result.next()){//There are still rows to get
			 //We get data of each row in the right order: getInt, getString, getString
			 System.out.println(+result.getInt(1)+" "+result.getString(2)+" "+result.getString(3) + "\n");	 
		 }
		 
		 result.close(); //close ResultSet
		 statement.close();//close Statement
		 connection.close();//close Connection
					
	 }catch(ClassNotFoundException cnfe){  
			System.out.printf("Not found the jdbc driver %s\n", driver);
	 }catch (SQLException sqle){
			System.out.println("SQL Exception");
                        System.out.println(sqle.getMessage());
                      sqle.printStackTrace();
                        
	 }					
	}
	
        public static void statementQueryExample3()
	{
	String query="SELECT ENAME, DNAME, LOC FROM EMP JOIN DEPT ON DEPT.DEPTNO = EMP.DEPTNO";
				
	 try{	
	 	 //Load the driver in RAM
		// Class.forName(driver);
                 
                 
                 
                 // Load the JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

// Create a connection
/*
            Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@//xxxxx.xxxxx.xxxxx.net:puerto:Servicio", "Usuario", "Password");
*/		
/*
Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@delfos:1521:SCOTT", "alumnoDAM", "uno");
*/
Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     //Connect to DB
		// Connection connection=DriverManager.getConnection(url,user,password);
		// Connection connection=DriverManager.getConnection("jdbc:sqlite:.BDGestionEmpleados.db","","");
		// Connection connection=DriverManager.getConnection(url);
		 //Create statement and execute query, to obtain a 'ResultSet'
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 //Iterate on the 'ResultSet' to process each row
		 while(result.next()){//There are still rows to get
			 //We get data of each row in the right order: getInt, getString, getString
			 System.out.println(result.getString(1)+" | "+result.getString(2)+" | "+result.getString(3) + "\n");	 
		 }
		 
		 result.close(); //close ResultSet
		 statement.close();//close Statement
		 connection.close();//close Connection
					
	 }catch(ClassNotFoundException cnfe){  
			System.out.printf("Not found the jdbc driver %s\n", driver);
	 }catch (SQLException sqle){
			System.out.println("SQL Exception");
                        System.out.println(sqle.getMessage());
                      sqle.printStackTrace();
                        
	 }					
	}
        
        public static void statementQueryExample4()
	{
	String query="SELECT AVG(SAL), DEPTNO FROM EMP GROUP BY DEPTNO";
				
	 try{	
	 	 //Load the driver in RAM
		// Class.forName(driver);
                 
                 
                 
                 // Load the JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

// Create a connection
/*
            Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@//xxxxx.xxxxx.xxxxx.net:puerto:Servicio", "Usuario", "Password");
*/		
/*
Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@delfos:1521:SCOTT", "alumnoDAM", "uno");
*/
Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     //Connect to DB
		// Connection connection=DriverManager.getConnection(url,user,password);
		// Connection connection=DriverManager.getConnection("jdbc:sqlite:.BDGestionEmpleados.db","","");
		// Connection connection=DriverManager.getConnection(url);
		 //Create statement and execute query, to obtain a 'ResultSet'
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 //Iterate on the 'ResultSet' to process each row
		 while(result.next()){//There are still rows to get
			 //We get data of each row in the right order: getInt, getString, getString
			 System.out.println(result.getDouble(1)+" | "+result.getInt(2) + "\n");	 
		 }
		 
		 result.close(); //close ResultSet
		 statement.close();//close Statement
		 connection.close();//close Connection
					
	 }catch(ClassNotFoundException cnfe){  
			System.out.printf("Not found the jdbc driver %s\n", driver);
	 }catch (SQLException sqle){
			System.out.println("SQL Exception");
                        System.out.println(sqle.getMessage());
                      sqle.printStackTrace();
                        
	 }					
	}
        
        public static void statementQueryExample5()
	{
	String query="SELECT DEPTNO, ENAME, SAL FROM EMP WHERE (DEPTNO,SAL) IN (SELECT DEPTNO, MAX(SAL) FROM EMP GROUP BY DEPTNO)";
				
	 try{	
	 	 //Load the driver in RAM
		// Class.forName(driver);
                 
                 
                 
                 // Load the JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

// Create a connection
/*
            Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@//xxxxx.xxxxx.xxxxx.net:puerto:Servicio", "Usuario", "Password");
*/		
/*
Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@delfos:1521:SCOTT", "alumnoDAM", "uno");
*/
Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     //Connect to DB
		// Connection connection=DriverManager.getConnection(url,user,password);
		// Connection connection=DriverManager.getConnection("jdbc:sqlite:.BDGestionEmpleados.db","","");
		// Connection connection=DriverManager.getConnection(url);
		 //Create statement and execute query, to obtain a 'ResultSet'
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 //Iterate on the 'ResultSet' to process each row
		 while(result.next()){//There are still rows to get
			 //We get data of each row in the right order: getInt, getString, getString
			 System.out.println(result.getInt(1)+" | "+result.getString(2) + " | "+result.getDouble(3) + "\n");	 
		 }
		 
		 result.close(); //close ResultSet
		 statement.close();//close Statement
		 connection.close();//close Connection
					
	 }catch(ClassNotFoundException cnfe){  
			System.out.printf("Not found the jdbc driver %s\n", driver);
	 }catch (SQLException sqle){
			System.out.println("SQL Exception");
                        System.out.println(sqle.getMessage());
                      sqle.printStackTrace();
                        
	 }					
	}
        
        public static void statementQueryExample6()
	{
	String query="SELECT DEPTNO, ENAME, SAL FROM EMP WHERE (DEPTNO,SAL) IN (SELECT DEPTNO, MIN(SAL) FROM EMP GROUP BY DEPTNO)";
				
	 try{	
	 	 //Load the driver in RAM
		// Class.forName(driver);
                 
                 
                 
                 // Load the JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

// Create a connection
/*
            Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@//xxxxx.xxxxx.xxxxx.net:puerto:Servicio", "Usuario", "Password");
*/		
/*
Connection connection = DriverManager.getConnection(
                    "jdbc.url=jdbc:oracle:thin:@delfos:1521:SCOTT", "alumnoDAM", "uno");
*/
Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     //Connect to DB
		// Connection connection=DriverManager.getConnection(url,user,password);
		// Connection connection=DriverManager.getConnection("jdbc:sqlite:.BDGestionEmpleados.db","","");
		// Connection connection=DriverManager.getConnection(url);
		 //Create statement and execute query, to obtain a 'ResultSet'
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 //Iterate on the 'ResultSet' to process each row
		 while(result.next()){//There are still rows to get
			 //We get data of each row in the right order: getInt, getString, getString
			 System.out.println(result.getInt(1)+" | "+result.getString(2) + " | "+result.getDouble(3) + "\n");	 
		 }
		 
		 result.close(); //close ResultSet
		 statement.close();//close Statement
		 connection.close();//close Connection
					
	 }catch(ClassNotFoundException cnfe){  
			System.out.printf("Not found the jdbc driver %s\n", driver);
	 }catch (SQLException sqle){
			System.out.println("SQL Exception");
                        System.out.println(sqle.getMessage());
                      sqle.printStackTrace();
                        
	 }					
	}
        
	/** <p>Inserting, deleting, Updating Data on the database using a database DML mechanism. 
	 *    The following examples 'statementInsert/Delete/UpdateExample' shows creating a statement and executing an 'Update' query.
	 */
	
	public static void statementInsertExample(){
		 String insert="INSERT INTO departamentos VALUES(60,'VENTAS','GRANADA')";
			
		 try{	
		 	 //Load the driver in RAM
			 Class.forName(driver);
						
		     //Connect to DB
			 Connection connection=DriverManager.getConnection(url,user,password);
			// Connection connection=DriverManager.getConnection(url);
			 //Create statement and execute query, to obtain a 'ResultSet'
			 Statement statement=connection.createStatement();
			 
			 
			 try{
			     statement.executeUpdate(insert);
			     System.out.println("Inserción realizada");
			 }catch(SQLException sqle){
				 System.out.println("SQL Exception: El departamento indicado ya existe");
			 }
			 
			 statement.close();//close Statement
			 connection.close();//close Connection
			 
			 
						
		 }catch(ClassNotFoundException cnfe){  
				System.out.printf("Not found the jdbc driver %s\n", driver);
		 }catch (SQLException sqle){
				System.out.println("SQL Exception");
		 }	
		
	}
	
	public static void statementDeleteExample()
	{
		 String delete="DELETE FROM departamentos WHERE dept_no =60";
			
		 try{	
		 	 //Load the driver in RAM
			 Class.forName(driver);
						
		     //Connect to DB
			 Connection connection=DriverManager.getConnection(url,user,password);
			// Connection connection=DriverManager.getConnection(url);
			 //Create statement and execute query, to obtain a 'ResultSet'
			 Statement statement=connection.createStatement();
			 
			 
			 try{
			     statement.executeUpdate(delete);
			     System.out.println("Borrado realizado");
			 }catch(SQLException sqle){
				 System.out.println("SQL Exception: El departamento indicado ya existe");
			 }
			 
			 statement.close();//close Statement
			 connection.close();//close Connection
			 
			 
						
		 }catch(ClassNotFoundException cnfe){  
				System.out.printf("Not found the jdbc driver %s\n", driver);
		 }catch (SQLException sqle){
				System.out.println("SQL Exception");
		 }
	}
	
	public static void statementUpdateExample()
	{
		 String update="UPDATE departamentos SET loc='CADIZ' WHERE trim(loc) ='BARCELONA'";
			
		 try{	
		 	 //Load the driver in RAM
			 Class.forName(driver);
						
		     //Connect to DB
			 Connection connection=DriverManager.getConnection(url,user,password);
			// Connection connection=DriverManager.getConnection(url);
			 //Create statement and execute query, to obtain a 'ResultSet'
			 Statement statement=connection.createStatement();
			 
			 
			 try{
			     statement.executeUpdate(update);
			     System.out.println("Actualización realizada");
			 }catch(SQLException sqle){
				 System.out.println("SQL Exception: El departamento indicado ya existe");
			 }
			 
			 statement.close();//close Statement
			 connection.close();//close Connection
			 
			 
						
		 }catch(ClassNotFoundException cnfe){  
				System.out.printf("Not found the jdbc driver %s\n", driver);
		 }catch (SQLException sqle){
				System.out.println("SQL Exception");
		 }
	}
	
	
}
