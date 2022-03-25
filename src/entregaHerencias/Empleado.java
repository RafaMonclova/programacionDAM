/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaHerencias;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
abstract public class Empleado {
    
    protected String nombre;
    protected String apellidos;
    protected String DNI;
    protected String direccion;
    protected int antiguedad;
    protected int telefono;
    protected double salario;
    protected Empleado supervisor;
    

    public Empleado(String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
        
    }
    
    
    public void imprimir(){
        
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDOS: "+apellidos);
        System.out.println("DNI: "+DNI);
        System.out.println("DIRECCIÓN: "+direccion);
        System.out.println("ANTIGÜEDAD: "+antiguedad);
        System.out.println("CONTACTO: "+telefono);
        System.out.println("SALARIO: "+salario);
        System.out.println("================================");
        System.out.println("SUPERVISOR:");
        if(supervisor != null)
            supervisor.imprimir();
        System.out.println("================================");
        
    }
    
    public void cambiarSupervisor(Empleado e){
        this.supervisor = e;
    }
    
    
    public void incrementarSalario(double incremento){
        this.salario += incremento;
    }
    
    public double liquidoAPercibir(){
        
        //calcular porcentaje con años antiguedad
        
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    
    
    
    
    
}
