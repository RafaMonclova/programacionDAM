/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerados;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Persona {
    
    String nombre;
    int edad;
    estadoCivil estado;
    
    public enum estadoCivil{
        soltero,casado,divorciado;
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        
    }
    
    public void setEstado(estadoCivil estado){
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + '}';
    }


    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce edad");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce estado civil. CASADO/DIVORCIADO/SOLTERO");
        String estado = sc.nextLine();
        
        Persona p = new Persona(nombre,edad);
        
        switch(estado){
            
            case "SOLTERO":
                estadoCivil s = estadoCivil.soltero;
                p.setEstado(s);
                break;
            case "DIVORCIADO":
                estadoCivil d = estadoCivil.divorciado;
                p.setEstado(d);
                break;
            case "CASADO":
                estadoCivil c = estadoCivil.casado;
                p.setEstado(c);
                break;
            default:
                System.out.println("Estado civil inválido");
                break;
        }
        
        
        System.out.println(p);
        
    }
    
}
