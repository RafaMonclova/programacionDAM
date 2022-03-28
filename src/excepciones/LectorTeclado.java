/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class LectorTeclado {
    
    Scanner sc; 
    
    public LectorTeclado(){
        sc = new Scanner(System.in);
    }
    
    
    public String leeTexto(){
        
        String a = "a";
        try{
            
            a = sc.nextLine();
            
            return a;
            
        }
        catch(InputMismatchException ex){
            System.err.println("ERROR, el valor no es una cadena");
            sc.nextLine();
            leeTexto();
        }
        finally{
            return a;
        }
        
    }
    
    public int leeEntero(){
        int a = 0;
        try{
            
            a = sc.nextInt();
            
            return a;
            
        }
        catch(InputMismatchException ex){
            System.err.println("ERROR, el valor no es un entero");
            sc.nextLine();
            leeEntero();
        }
        finally{
            return a;
        }
        
    }
    
    public double leeDouble(){
        double a = 0;
        try{
            
            a = sc.nextDouble();
            
            return a;
            
        }
        catch(InputMismatchException ex){
            System.err.println("ERROR, el valor no es un decimal");
            sc.nextLine();
            leeDouble();
        }
        finally{
            return a;
        }
    }
    
    public char leeCaracter(){
        char a = 'a';
        try{
            
            a = sc.next().charAt(0);
            
            return a;
            
        }
        catch(InputMismatchException ex){
            System.err.println("ERROR, el valor no es un carácter");
            sc.nextLine();
            leeCaracter();
        }
        finally{
            return a;
        }
    }
    
    public boolean leeBoolean(){
        boolean a = false;
        try{
            
            a = sc.nextBoolean();
            
            return a;
            
        }
        catch(InputMismatchException ex){
            System.err.println("ERROR, el valor no es un boolean");
            sc.nextLine();
            leeBoolean();
        }
        finally{
            return a;
        }
    }
    
    
    
    public static void main(String[] args){
        
        LectorTeclado t = new LectorTeclado();
        
        
        t.leeEntero();
        
        
        
        
    }
    
}
