/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.*;
public class Alumno {
    int edad;
    double nota;
    String nombre;
    
    Alumno(){
        edad=18;
        nombre="sin nombre";
        nota = 0;
    }
    Alumno(int nEdad, String nNombre, double nNota){
        edad=nEdad;
        nombre=nNombre;
        nota = nNota;
    }
    
    String getNombre(){
        return nombre;
    }
    
    int getEdad(){
        return edad;
    }
    
    double getNota(){
        return nota;
    }
     
    public String toString (){
        return  "nombre: "+nombre+" edad: "+edad+" nota: "+nota;
    }
    
    void pedirDatos(){
        
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce el nombre del alumno: ");
            nombre = sc.nextLine();
            
        }while(nombre.equals(""));
        
        do{
            System.out.println("Introduce la edad del alumno: ");
            edad = sc.nextInt();
            
        }while(edad < 0);
        
        do{
            System.out.println("Introduce la nota del alumno: ");
            nota = sc.nextDouble();
            
        }while(nota <0 || nota > 10);
        
        
    }
    
    
    
    
    
    
    
    
 
     
     
}
