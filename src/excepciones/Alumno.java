/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    String nombre;
    String dni;
    double[] notas;
    
    public Alumno(String nombre,String dni){
        
        this.nombre = nombre;
        this.dni = dni;
        notas = new double[6];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = -1;
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public void setNota(int posicion){
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Introduce la nota");
            double nota = sc.nextDouble();
            notas[posicion] = nota;
            
            if(nota <1 && nota > 10){
                throw new Exception("La nota debe estar entre 1 y 10");
            }
            
        }catch(Exception e){
            
        }
        
        
        
        
        
    }
    
    
}
