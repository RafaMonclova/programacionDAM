/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import static BDD.ejercicios.driver;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejer11 {
	
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
	
	
	
	public static void main(String[] args){
	
        Scanner sc = new Scanner(System.in);
		
                
        int opcion;
        do {
            System.out.println("1. Mostrar empleados");
            System.out.println("2. Modificar empleado");
            System.out.println("3. Añadir empleado");
            System.out.println("4. Borrar empleado");
            System.out.println("0. SALIR");
            System.out.println("Introduce opción:");
            opcion = sc.nextInt();
                    
                    switch(opcion){
                        
                        case 1:
                            System.out.println("--1-- \n");
                            consulta();
                            break;
                        case 2:
                            System.out.println("--2-- \n");
                            update();
                            break;
                        case 3:
                            System.out.println("--3-- \n");
                            insert();
                            break;
                        case 4:
                            System.out.println("--4-- \n");
                            delete();
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
    
    
        public static void consulta(){
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
        
        public static void update(){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce num del empleado para modificar sus datos");
            int empno = sc.nextInt();
            sc.nextLine();
            System.out.println("--NUEVOS DATOS--");
            System.out.println("----------------");
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
            
            
            String update = "UPDATE EMP SET ENAME='"+ename+"',"+"JOB='"+job+"',"+"MGR="+mgr+","+"HIREDATE=TO_DATE('"+hiredate+"',"+"'DD-MM-YYYY')"+","+"SAL="+sal+","+"COMM="+comm+","+"DEPTNO="+deptno+"WHERE EMPNO="+empno;
            
			
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
		 }
	}
        
        public static void insert(){
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
        
        public static void delete(){
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número del empleado a borrar");
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
				 System.out.println("SQL Exception");
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
