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



public class ejercicios {

	
	
	
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
	
	
	
	public static void main(String[] args)
	{
	//--------------Utilizando objetos statement---------
		Scanner sc = new Scanner(System.in);
		//Consultas DQL - statement
                
                int opcion;
                do {
                    System.out.println("1. Muestra todos los datos de la tabla EMP indicando nombre de campo para cada");
                    System.out.println("2. Muestra todos los datos de la tabla DEPT");
                    System.out.println("3. Muestra cada empleado con el nombre y localidad de su departamento");
                    System.out.println("4. Obtener el salario medio de cada departamento");
                    System.out.println("5. Por cada departamento mostrar el nombre y salario del empleado que más gane");
                    System.out.println("6. Por cada departamento mostrar el nombre y salario del empleado que menos gane");
                    System.out.println("7. Muestra los datos del empleado con el número introducido");
                    System.out.println("8. INSERT 1");
                    System.out.println("9. INSERT 2");
                    System.out.println("10. DELETE 1");
                    System.out.println("11. ACTUALIZAR O INSERTAR");
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
                        case 7:
                            System.out.println("--CONSULTA 6-- \n");
                            statementQueryExample7();
                            break;   
                        case 8:
                            System.out.println("--INSERT 1-- \n");
                            insert1();
                            break;  
                        case 9:
                            System.out.println("--INSERT 2-- \n");
                            insert2();
                            break;  
                        case 10:
                            System.out.println("--DELETE 1-- \n");
                            delete1();
                            break;  
                        case 11:
                            System.out.println("--ACTUALIZAR O INSERTAR -- \n");
                            ejer10();
                            break;     
                        case 0:
                            System.out.println("SALIENDO...");
                            break;
                        default:
                            System.out.println("Opción inválida(1-6)");
                            break;
                        
                    }
                
                } while (opcion != 0);



	}
	
	
	//--CONSULTAS--
	
	public static void statementQueryExample1()
	{
	String query="SELECT * FROM EMP";
				
	 try{	
	 	 
                 
         
            Class.forName("oracle.jdbc.driver.OracleDriver");


            Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){
			 
			 System.out.println("NUM: "+result.getInt(1)+"\n"+
                                "NOMBRE: "+result.getString(2)+"\n"+"JOB: "+result.getString(3) + "\n" +
                                "MGR: "+result.getInt(4)+"\n"+ "HIREDATE: "+result.getString(5)+"\n"+ 
                                "SAL: "+result.getDouble(6)+"\n"+ "COMM: "+result.getDouble(7)+"\n"+ 
                                "DEPTNO: "+result.getInt(8)+"\n");	 
		 }
		 
		 result.close(); 
		 statement.close();
		 connection.close();
					
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
	 	
                 
                 
                 
                 
            Class.forName("oracle.jdbc.driver.OracleDriver");


Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){
			 
			 System.out.println(+result.getInt(1)+" "+result.getString(2)+" "+result.getString(3) + "\n");	 
		 }
		 
		 result.close(); 
		 statement.close();
		 connection.close();
					
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
	 	
            Class.forName("oracle.jdbc.driver.OracleDriver");


Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){
			 
			 System.out.println(result.getString(1)+" | "+result.getString(2)+" | "+result.getString(3) + "\n");	 
		 }
		 
		 result.close(); 
		 statement.close();
		 connection.close();
					
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
	 	
            Class.forName("oracle.jdbc.driver.OracleDriver");


Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){
			 
			 System.out.println(result.getDouble(1)+" | "+result.getInt(2) + "\n");	 
		 }
		 
		 result.close(); 
		 statement.close();
		 connection.close();
					
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
	 	
            Class.forName("oracle.jdbc.driver.OracleDriver");


Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){
			 
			 System.out.println(result.getInt(1)+" | "+result.getString(2) + " | "+result.getDouble(3) + "\n");	 
		 }
		 
		 result.close(); 
		 statement.close();
		 connection.close();
					
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
	 	
            Class.forName("oracle.jdbc.driver.OracleDriver");


Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){
			 
			 System.out.println(result.getInt(1)+" | "+result.getString(2) + " | "+result.getDouble(3) + "\n");	 
		 }
		 
		 result.close(); 
		 statement.close();
		 connection.close();
					
	 }catch(ClassNotFoundException cnfe){  
			System.out.printf("Not found the jdbc driver %s\n", driver);
	 }catch (SQLException sqle){
			System.out.println("SQL Exception");
                        System.out.println(sqle.getMessage());
                      sqle.printStackTrace();
                        
	 }					
	}
        
        public static void statementQueryExample7()
	{
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce num de empleado:");
            int numEmp = sc.nextInt();
            
            String query="SELECT * FROM EMP WHERE EMPNO="+numEmp;
				
	 try{	
	 	
            Class.forName("oracle.jdbc.driver.OracleDriver");


Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){
			 
			System.out.println("NUM: "+result.getInt(1)+"\n"+
                                "NOMBRE: "+result.getString(2)+"\n"+"JOB: "+result.getString(3) + "\n" +
                                "MGR: "+result.getInt(4)+"\n"+ "HIREDATE: "+result.getString(5)+"\n"+ 
                                "SAL: "+result.getDouble(6)+"\n"+ "COMM: "+result.getDouble(7)+"\n"+ 
                                "DEPTNO: "+result.getInt(8)+"\n");	 
		 }
		 
		 result.close(); 
		 statement.close();
		 connection.close();
					
	 }catch(ClassNotFoundException cnfe){  
			System.out.printf("Not found the jdbc driver %s\n", driver);
	 }catch (SQLException sqle){
			System.out.println("SQL Exception");
                        System.out.println(sqle.getMessage());
                      sqle.printStackTrace();
                        
	 }					
	}
        
	//--INSERT,DELETE,UPDATE--
	
	public static void statementInsertExample(){
		 String insert="INSERT INTO departamentos VALUES(60,'VENTAS','GRANADA')";
			
		 try{	
		 	 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
						
			 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");
			
			 Statement statement=connection.createStatement();
			 
			 
			 try{
			     statement.executeUpdate(insert);
			     System.out.println("Inserción realizada");
			 }catch(SQLException sqle){
				 System.out.println("SQL Exception: El departamento indicado ya existe");
			 }
			 
			 statement.close();
			 connection.close();
			 	 
						
		 }catch(ClassNotFoundException cnfe){  
				System.out.printf("Not found the jdbc driver %s\n", driver);
		 }catch (SQLException sqle){
				System.out.println("SQL Exception");
		 }	
		
	}
        
        public static void insert1(){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce num del empleado");
            int empno = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce nombre del empleado");
            String ename = sc.nextLine();
            System.out.println("Introduce job del empleado");
            String job = sc.nextLine();
            System.out.println("Introduce mgr del empleado");
            int mgr = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce fecha de alta del empleado");
            String hiredate = sc.nextLine();
            System.out.println("Introduce salario del empleado");
            double sal = sc.nextDouble();
            System.out.println("Introduce comisión empleado");
            double comm = sc.nextDouble();
            System.out.println("Introduce num del departamento del empleado");
            int deptno = sc.nextInt();
            String insert="INSERT INTO EMP VALUES("+empno+",'"+ename+"','"+job+"',"+mgr+"," +"TO_DATE("+"'"+hiredate+"'"+","+ "'DD-MM-YYYY'"+")"+","+ sal+"," +comm+"," +deptno+")";
           
		 try{	
		 	 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
						
			 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");
			
			 Statement statement=connection.createStatement();
			 
			 
			 try{
			     statement.executeUpdate(insert);
			     System.out.println("Inserción realizada");
			 }catch(SQLException sqle){
				 System.out.println("SQL Exception");
			 }
			 
			 statement.close();
			 connection.close();
			 	 
						
		 }catch(ClassNotFoundException cnfe){  
				System.out.printf("Not found the jdbc driver %s\n", driver);
		 }catch (SQLException sqle){
				System.out.println("SQL Exception");
                                sqle.printStackTrace();
		 }	
		
	}
	
        public static void insert2(){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce num del departamento");
            int deptno = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce nombre del departamento");
            String dname = sc.nextLine();
            System.out.println("Introduce localización del departamento");
            String loc = sc.nextLine();
        
            String insert="INSERT INTO DEPT VALUES("+deptno+","+"'"+dname+"'"+","+"'"+loc+"'"+")";
            System.out.println(insert);
		 try{	
		 	 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
						
			 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");
			
			 Statement statement=connection.createStatement();
			 
			 
			 try{
			     statement.executeUpdate(insert);
			     System.out.println("Inserción realizada");
			 }catch(SQLException sqle){
				 System.out.println("SQL Exception: El departamento indicado ya existe");
			 }
			 
			 statement.close();
			 connection.close();
			 	 
						
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
			 Class.forName("oracle.jdbc.driver.OracleDriver");
						
		     //Connect to DB
			 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");
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
        
        public static void delete1()
	{
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número del empleado");
            int empno = sc.nextInt();
            String delete="DELETE FROM EMP WHERE EMPNO ="+empno;
			
		 try{	
		 	 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
						
		     
			 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");
			
			 Statement statement=connection.createStatement();
			 
			 
			 try{
			     statement.executeUpdate(delete);
			     System.out.println("Borrado realizado");
			 }catch(SQLException sqle){
				 System.out.println("SQL Exception: El departamento indicado ya existe");
			 }
			 
			 statement.close();
			 connection.close();
			 
			 
						
		 }catch(ClassNotFoundException cnfe){  
				System.out.printf("Not found the jdbc driver %s\n", driver);
		 }catch (SQLException sqle){
				System.out.println("SQL Exception");
		 }
	}
        
        public static void ejer10()
	{
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce num del empleado");
            int empno = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce nombre del empleado");
            String ename = sc.nextLine();
            System.out.println("Introduce job del empleado");
            String job = sc.nextLine();
            System.out.println("Introduce mgr del empleado");
            int mgr = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce fecha de alta del empleado");
            String hiredate = sc.nextLine();
            System.out.println("Introduce salario del empleado");
            double sal = sc.nextDouble();
            System.out.println("Introduce comisión empleado");
            double comm = sc.nextDouble();
            System.out.println("Introduce num del departamento del empleado");
            int deptno = sc.nextInt();
            
            String consulta = "SELECT EMPNO FROM EMP WHERE EMPNO="+empno;
            String update = "UPDATE EMP SET ENAME='"+ename+"',"+"JOB='"+job+"',"+"MGR="+mgr+","+"HIREDATE=TO_DATE('"+hiredate+"',"+"'DD-MM-YYYY')"+","+"SAL="+sal+","+"COMM="+comm+","+"DEPTNO="+deptno+"WHERE EMPNO="+empno;
            String insert="INSERT INTO EMP VALUES("+empno+",'"+ename+"','"+job+"',"+mgr+"," +"TO_DATE("+"'"+hiredate+"'"+","+ "'DD-MM-YYYY'"+")"+","+ sal+"," +comm+"," +deptno+")";
			
		 try{	
		 	 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
						
		     
			 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");
			
			Statement statement=connection.createStatement();
                        ResultSet result=statement.executeQuery(consulta);
			if(result.next()){
			 
                            //System.out.println(result.getInt(1));
                            try{
			     statement.executeUpdate(update);
			     System.out.println("Actualización realizada");
                            }catch(SQLException sqle){
				 System.out.println("SQL Exception");
                            }
                            
                        }
                        else{
                            
                            try{
			     statement.executeUpdate(insert);
			     System.out.println("Inserción realizada");
                            }catch(SQLException sqle){
				 System.out.println("SQL Exception");
			 }
                            
                        }
			                  
			 
		 
		 result.close(); 
		 statement.close();
		 connection.close();
			 
			 
						
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
		 	 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
						
		     
			 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");
			
			 Statement statement=connection.createStatement();
			 
			 
			 try{
			     statement.executeUpdate(update);
			     System.out.println("Actualización realizada");
			 }catch(SQLException sqle){
				 System.out.println("SQL Exception: El departamento indicado ya existe");
			 }
			 
			 statement.close();
			 connection.close();
			 
			 
						
		 }catch(ClassNotFoundException cnfe){  
				System.out.printf("Not found the jdbc driver %s\n", driver);
		 }catch (SQLException sqle){
				System.out.println("SQL Exception");
		 }
	}
	
	
}
