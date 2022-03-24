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
        System.out.println("SUPERVISOR:");
        if(supervisor != null)
            supervisor.imprimir();
        
    }
    
    
    
    //Cambia el supervisor, depende del puesto de trabajo pide los datos necesarios
    //Pido los datos en el mismo método para no crear 3 métodos diferentes para cada tipo de empleado, ya que habría que pedir los datos de cada uno
    /*
    public void cambiarSupervisor(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el puesto del supervisor (secretario, vendedor o jefe)");
        String tipo = sc.nextLine();
        
        switch(tipo){
            
            case "secretario":
                System.out.println("Tiene despacho?");
                char despachoSiNoS = sc.next().charAt(0);
                boolean despachoS;
                if(despachoSiNoS == 's'){
                    despachoS = true;
                }
                else
                    despachoS = false;
                
                System.out.println("Introduce número de fax:");
                int faxS = sc.nextInt();
                System.out.println("Introduce nombre:");
                String nombreS = sc.nextLine();
                System.out.println("Introduce apellidos:");
                String apellidosS = sc.nextLine();
                System.out.println("Introduce DNI:");
                String dniS = sc.nextLine();
                System.out.println("Introduce dirección:");
                String direccionS = sc.nextLine();
                System.out.println("Introduce su antigüedad:");
                int antiguedadS = sc.nextInt();
                System.out.println("Introduce teléfono:");
                int telefonoS = sc.nextInt();
                System.out.println("Introduce su salario:");
                int salarioS = sc.nextInt();
                
                
                Secretario s = new Secretario(despachoS, faxS, nombreS, apellidosS, dniS, direccionS, antiguedadS, telefonoS, salarioS);
                setSupervisor(s);
            break;
            
            case "vendedor":
                System.out.println("DATOS DEL VEHÍCULO");
                System.out.println("Introduce la matrícula:");
                String matricula = sc.nextLine();
                System.out.println("Introduce la marca:");
                String marca = sc.nextLine();
                System.out.println("Introduce el modelo:");
                String modelo = sc.nextLine();
                
                Coche c = new Coche(matricula,marca,modelo);
                
                System.out.println("DATOS DEL EMPLEADO");
                System.out.println("Introduce móvil de contacto:");
                int movil = sc.nextInt();
                System.out.println("Introduce el área de venta:");
                String areaVenta = sc.nextLine();
                System.out.println("Introduce el porcentaje de comisión que recibe:");
                int porcentajeComision = sc.nextInt();
                System.out.println("Introduce nombre:");
                String nombreV = sc.nextLine();
                System.out.println("Introduce apellidos:");
                String apellidosV = sc.nextLine();
                System.out.println("Introduce DNI:");
                String dniV = sc.nextLine();
                System.out.println("Introduce dirección:");
                String direccionV = sc.nextLine();
                System.out.println("Introduce su antigüedad:");
                int antiguedadV = sc.nextInt();
                System.out.println("Introduce teléfono:");
                int telefonoV = sc.nextInt();
                System.out.println("Introduce su salario:");
                int salarioV = sc.nextInt();
                
                Vendedor v = new Vendedor(c,movil,areaVenta,porcentajeComision,nombreV,apellidosV,dniV,direccionV,antiguedadV,telefonoV,salarioV);
                setSupervisor(v);
            break;
            
            case "jefe":
                System.out.println("Tiene despacho?");
                char despachoSiNoJ = sc.next().charAt(0);
                boolean despachoJ;
                if(despachoSiNoJ == 's'){
                    despachoJ = true;
                }
                else
                    despachoJ = false;
                
                System.out.println("Introduce los datos del secretario al que supervisa:");
                System.out.println("Tiene despacho?");
                char despachoSiNoSJ = sc.next().charAt(0);
                boolean despachoSJ;
                if(despachoSiNoSJ == 's'){
                    despachoSJ = true;
                }
                else
                    despachoSJ = false;
                
                System.out.println("Introduce número de fax:");
                int faxSJ = sc.nextInt();
                System.out.println("Introduce nombre:");
                String nombreSJ = sc.nextLine();
                System.out.println("Introduce apellidos:");
                String apellidosSJ = sc.nextLine();
                System.out.println("Introduce DNI:");
                String dniSJ = sc.nextLine();
                System.out.println("Introduce dirección:");
                String direccionSJ = sc.nextLine();
                System.out.println("Introduce su antigüedad:");
                int antiguedadSJ = sc.nextInt();
                System.out.println("Introduce teléfono:");
                int telefonoSJ = sc.nextInt();
                System.out.println("Introduce su salario:");
                int salarioSJ = sc.nextInt();
                
                
                Secretario sJ = new Secretario(despachoJ, faxSJ, nombreSJ, apellidosSJ, dniSJ, direccionSJ, antiguedadSJ, telefonoSJ, salarioSJ);
                
                System.out.println("VENDEDORES A SU CARGO:");
                
                
        }
        
    }
    */
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
