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
    int a;
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
    
    public String leerCadena2(){
        String a;
        try{
            System.out.println("Introduce la cadena");
            a = sc.nextLine();
            return a;
            
            
        }
        
        catch(InputMismatchException ex){
            System.err.println("ERROR, valor no válido");
            System.out.println(ex.getMessage());
            
            
        }
        
        return "";
        
    }
    
    //Devuelve un entero, si es decimal lo devuelve sin decimales, si es negativo lo devuelve positivo
    public int leeEntero2(){
        String cadena = "";
        
        try{
            //Lee la cadena por teclado
            System.out.println("Introduce el numero");
            cadena = sc.nextLine();
            //Crea un entero y convierte la cadena a entero
            a = Integer.parseInt(cadena);
        
            if(a<0){
                throw new NegativoNoValidoExcepcion("El número no puede ser negativo");
            }
        
            //Si es negativo, se invierte
        }catch(NegativoNoValidoExcepcion ex){
            return -a;
            
            //Si no es un entero
        }catch(NumberFormatException ex){
            try{
                //Convierte la cadena a double y devuelve b convertiro a entero
                double b = Double.parseDouble(cadena);
                return (int)b;
                
                //Error si no es válido, por ejemplo si recibe "pepe"
            }catch(NumberFormatException ex2){
                
                System.out.println("Valor no válido");
                System.out.println(ex2.getMessage());
                
            }
        }
            
        return a;
        
    }
    
    public int leeEntero3(){
        int a = 0;
        try{
            
            a = sc.nextInt();
            if(a<0){
                throw new Exception("El número no puede ser negativo, se convertirá a valor abs");
            }
            return a;
            
            
        }
        
        catch(InputMismatchException ex){
            System.err.println("ERROR, el valor no es un entero");
            sc.nextLine();
            leeEntero();
        }
        
        catch(Exception ex){
            System.err.println("ERROR, el valor no es POSITIVO (se devolverá el absoluto)");
            return Math.abs(a);
        }
        
        return a;
        
        
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
        
        
        System.out.println(t.leeEntero2());
        
        
        
        
    }
    
}
