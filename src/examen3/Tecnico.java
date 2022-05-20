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
public class Tecnico extends Trabajador{
    
    private int numHorasExtras;
    private double valorHorasExtra = 40;

    public Tecnico(String dni, String nombre, double sueldo,int numHorasExtras) {
        super(dni, nombre, sueldo);
        this.numHorasExtras = numHorasExtras;
    }

    public int getNumHorasExtras() {
        return numHorasExtras;
    }

    public void setNumHorasExtras(int numHorasExtras) {
        this.numHorasExtras = numHorasExtras;
    }

    public double getValorHorasExtra() {
        return valorHorasExtra;
    }

    public void setValorHorasExtra(double valorHorasExtra) {
        this.valorHorasExtra = valorHorasExtra;
    }
    
    @Override
    public void leer(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--DATOS TRABAJADOR--");
        super.leer();
        
        System.out.println("--DATOS TÉCNICO--");
        System.out.println("Introduce número de horas extras");
        int numHorasExtras = sc.nextInt();
        setNumHorasExtras(numHorasExtras);
        System.out.println("Introduce valor de las horas extras");
        double valorHorasExtras = sc.nextDouble();
        setValorHorasExtra(valorHorasExtras);
        
    }

    
    @Override
    public double cobrar() {
       
        double irpf = super.calcularIRPF(super.getSueldo()+numHorasExtras * valorHorasExtra);
        
        return super.getSueldo()+numHorasExtras * valorHorasExtra - irpf;
        
    }
    
    @Override
    public String toString() {
        return "TÉCNICO" + ";"+ super.toString()+";"+ numHorasExtras;
    }
    
    
    
    
}
