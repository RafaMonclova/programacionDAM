/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class arrayAlumnos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Alumno [] arrayAlumnos; 
        
        System.out.println("Introduce numero de alumnos: ");
        int numAlumnos = sc.nextInt();
        double mediaNotas = 0;
        arrayAlumnos=new Alumno[numAlumnos];      
        /*
        for(int i =0;i<arrayAlumnos.length;i++){
            System.out.println("nombre");
            String nombre = sc.nextLine();
            
            System.out.println("edad");
            int edad = sc.nextInt();
             
            System.out.println("nota");
            double nota = sc.nextDouble();
            sc.nextLine();
            
            arrayAlumnos[i]= new Alumno(edad,nombre, nota);
        }
        */
        
        for(int i = 0;i<arrayAlumnos.length;i++){
            
            arrayAlumnos[i] = new Alumno();
            
        }
        
        System.out.println("Datos de los alumnos: ");
        for(int i = 0;i<arrayAlumnos.length;i++){
            
            System.out.println("Introduce datos del alumno "+(i+1));
            arrayAlumnos[i].pedirDatos();
        }
        
        System.out.println("La media de la clase es: ");
        for(int i = 0;i<arrayAlumnos.length;i++){
            
            mediaNotas=mediaNotas+arrayAlumnos[i].getNota();
        }
        
        mediaNotas=mediaNotas/arrayAlumnos.length;
        System.out.println(mediaNotas);
        
        double notaMayor = Integer.MIN_VALUE;
        int posicionMayor = 0;
        
        for(int i = 0;i<arrayAlumnos.length;i++){
            
            if(arrayAlumnos[i].getNota() > notaMayor){
                notaMayor = arrayAlumnos[i].getNota();
                posicionMayor = i; 
                
            }
            
        }
        
        System.out.println("La nota más alta la tiene: ");
        System.out.println(arrayAlumnos[posicionMayor]);
        
        
        // System.out.print(grupo1DAMB[1].getEdad());
        /*
        System.out.print(arrayAlumnos[0].toString());
        System.out.print(arrayAlumnos[1].toString());
        System.out.print(arrayAlumnos[2].toString());
        System.out.print(arrayAlumnos[3].toString());
        */ 
         
         
        
        
        
    }
    
}
