/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class CiclistaBDD implements CiclistaDAO{
    

    @Override
    public Ciclista read(int numero) {
        
        Ciclista c = null;
        
        String query="SELECT * FROM CICLISTA WHERE DORSAL="+numero;
		
	 try{	
	 	 
                 
         
            Class.forName("oracle.jdbc.driver.OracleDriver");


            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){ 

                        c = new Ciclista(result.getInt(1),result.getString(2),result.getInt(3),result.getString(4));
                        System.out.println(c);
		 }
		 
		 result.close(); 
		 statement.close();
		 connection.close();
					
	 }catch(ClassNotFoundException cnfe){  
			System.out.printf("Not found the jdbc driver %s\n");
	 }catch (SQLException sqle){
			System.out.println("SQL Exception");
                        System.out.println(sqle.getMessage());
                      sqle.printStackTrace();
                        
	 }					
        return c;
        
        
        
    }

    @Override
    public ArrayList<Ciclista> readAll() {
        
        ArrayList<Ciclista> lista = new ArrayList();
        Ciclista c = null;
        
        String query="SELECT * FROM CICLISTA";
				
	 try{	
	 	 
                 
         
            Class.forName("oracle.jdbc.driver.OracleDriver");


            Connection connection = DriverManager.getConnection
                  ("jdbc:oracle:thin:@delfos:1521:XE", "rafaelmosu", "uno");

	     
		 Statement statement=connection.createStatement();
		 ResultSet result=statement.executeQuery(query);
		 
		 
		 while(result.next()){ 
                         
                          c = new Ciclista(result.getInt(1),result.getString(2),result.getInt(3),result.getString(4));
                         lista.add(c);
		 }
		 
		 result.close(); 
		 statement.close();
		 connection.close();
					
	 }catch(ClassNotFoundException cnfe){  
			System.out.printf("Not found the jdbc driver %s\n");
	 }catch (SQLException sqle){
			System.out.println("SQL Exception");
                        System.out.println(sqle.getMessage());
                      sqle.printStackTrace();
                        
	 }					
        return lista;
        
        
    }
    
    
    
    
}
