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
public class Comercial extends Trabajador{
    
    private double comision;

    public Comercial(String dni, String nombre, double sueldo,double comision) {
        super(dni, nombre, sueldo);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void leer(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--DATOS TRABAJADOR--");
        super.leer();
        
        System.out.println("--DATOS COMERCIAL--");
        System.out.println("Introduce comisión");
        double comision = sc.nextDouble();
        setComision(comision);
    }
    
    @Override
    public double cobrar() {
        
        double irpf = super.calcularIRPF(comision+super.getSueldo());
        
        return super.getSueldo()+comision - irpf;
        
    }
    
    @Override
    public String toString() {
        return "COMERCIAL" + ";"+ super.toString()+";"+ comision;
    }
    
    
    
}
