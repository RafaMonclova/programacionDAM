/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author rafa
 */
public class Empleado extends Persona{
    
    private String fechaContrato;
    private double sueldoBase;
    private double baseHorasExtra;
    private int numHorasExtra;

    public Empleado() {
        super();
        fechaContrato = "";
        sueldoBase = 0;
        baseHorasExtra = 0;
        numHorasExtra = 0;
    }

    public Empleado(String nombre, String apellidos, String dni, String fechaContrato, double sueldoBase, double baseHorasExtra, int numHorasExtra) {
        super(nombre, apellidos, dni);
        this.fechaContrato = fechaContrato;
        this.sueldoBase = sueldoBase;
        this.baseHorasExtra = baseHorasExtra;
        this.numHorasExtra = numHorasExtra;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getBaseHorasExtra() {
        return baseHorasExtra;
    }

    public void setBaseHorasExtra(double baseHorasExtra) {
        this.baseHorasExtra = baseHorasExtra;
    }

    public int getNumHorasExtra() {
        return numHorasExtra;
    }

    public void setNumHorasExtra(int numHorasExtra) {
        this.numHorasExtra = numHorasExtra;
    }
    
    public double calcularSueldo(){
        return sueldoBase+(baseHorasExtra*numHorasExtra);
    }
    
    public void imprimirNomina(){
        
        System.out.println("FECHA CONTRATO: "+fechaContrato);
        System.out.println("SUELDO BASE: "+sueldoBase);
        System.out.println("BASE HORAS EXTRA: "+baseHorasExtra);
        System.out.println("NUM HORAS EXTRA: "+numHorasExtra);
        
    }
    
    
    
    
    
    
    
    
}
