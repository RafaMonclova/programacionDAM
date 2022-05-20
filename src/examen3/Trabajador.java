/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import java.util.Scanner;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
abstract public class Trabajador implements Comparable<Trabajador>{
    
    private String dni;
    private String nombre;
    private double sueldo;

    public Trabajador(String dni, String nombre, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return dni+";"+nombre+";"+sueldo;
    }
    
    public void leer(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce dni");
        String dni = sc.nextLine();
        setDni(dni);
        System.out.println("Introduce nombre");
        String nombre = sc.nextLine();
        setNombre(nombre);
        System.out.println("Introduce sueldo");
        double sueldo = sc.nextDouble();
        setSueldo(sueldo);
        
        
    }
    
    abstract public double cobrar();
    
    protected double calcularIRPF(double cantidad){
        
        double irpf = 0;
        
        if(sueldo <= 12450){
            irpf = 0.19;
        }
        if(sueldo <= 20200){
            irpf = 0.24;
        }
        if(sueldo <= 35200){
            irpf = 0.30;
        }
        if(sueldo <= 60000){
            irpf = 0.37;
        }
        if(sueldo > 60000){
            irpf = 0.45;
        }
 
        return cantidad*irpf;
           
    }
    
    @Override
    public int compareTo(Trabajador otro){
        
        if(this.cobrar() > otro.cobrar()){
            return (int)(this.cobrar() - otro.cobrar());
        }
        else{
            return (int)(otro.cobrar() - this.cobrar());
        }
        
    }
    
    
    
}
