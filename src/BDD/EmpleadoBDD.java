/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EmpleadoBDD implements EmpleadoDAO{

    
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
    
    
    
    
    public Empleado creaEmpleado(){
        
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
            
        Empleado e = new Empleado(empno,ename,job,mgr,hiredate,sal,comm,deptno);
        return e;
        
    }
    
    @Override
    public void update(Empleado e) {
        
        String update = "UPDATE EMP SET ENAME='"+e.getENAME()+"',"+"JOB='"+e.getJOB()+"',"+"MGR="+e.getMGR()+","+"HIREDATE=TO_DATE('"+e.getHIREDATE()+"',"+"'DD-MM-YYYY')"+","+"SAL="+e.getSAL()+","+"COMM="+e.getCOMM()+","+"DEPTNO="+e.getDEPTNO()+"WHERE EMPNO="+e.getEMPNO();
           
		 try{	
		 	 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
						
			 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");
			
			 Statement statement=connection.createStatement();
			 
			 
			 try{
			     statement.executeUpdate(update);
			     System.out.println("Actualización realizada");
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

    @Override
    public void insert(Empleado e) {
        
            
            String insert="INSERT INTO EMP VALUES("+e.getEMPNO()+",'"+e.getENAME()+"','"+e.getJOB()+"',"+e.getMGR()+"," +"TO_DATE("+"'"+e.getHIREDATE()+"'"+","+ "'DD-MM-YYYY'"+")"+","+ e.getSAL()+"," +e.getCOMM()+"," +e.getDEPTNO()+")";
           
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

    @Override
    public void delete(int empno) {
        
    }

    @Override
    public Empleado read(int empno) {
        
        Empleado e = null;
        
        String query="SELECT * FROM EMP WHERE EMPNO="+empno;
				
	 try{	
	 	 
                 
         
            Class.forName("oracle.jdbc.driver.OracleDriver");


            Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){ 
                         
                         e = new Empleado(result.getInt(1),result.getString(2),result.getString(3),result.getInt(4),result.getString(5),result.getDouble(6),result.getDouble(7),result.getInt(8));
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
        return e;
	
        
    }
    
    public ArrayList<Empleado> listaEmpleados() {
        
        ArrayList<Empleado> listaEmpleados = new ArrayList();
        
        
        String query="SELECT * FROM EMP";
				
	 try{	
	 	 
                 
         
            Class.forName("oracle.jdbc.driver.OracleDriver");


            Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){ 
                         
                         Empleado e = new Empleado(result.getInt(1),result.getString(2),result.getString(3),result.getInt(4),result.getString(5),result.getDouble(6),result.getDouble(7),result.getInt(8));
                         listaEmpleados.add(e);
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
        return listaEmpleados;
	
        
    }
    
    
    
}
