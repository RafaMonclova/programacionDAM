
package entregaHerencias;

import static entregaHerencias.Main.supervisor;
import java.util.Scanner;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
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
    
    //Modifica datos del empleado
    public void modificar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué datos desea modificar?");
        System.out.println("1.NOMBRE ");
        System.out.println("2.APELLIDOS ");
        System.out.println("3.DNI ");
        System.out.println("4.DIRECCIÓN ");
        System.out.println("5.ANTIGÜEDAD ");
        System.out.println("6.CONTACTO ");
        System.out.println("7.SALARIO ");
        System.out.println("8.SUPERVISOR ");
        
        int opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
            
            case 1:
                System.out.println("Introduzca nombre");
                String nombre = sc.nextLine();
                setNombre(nombre);
                break;
            case 2:
                System.out.println("Introduzca apellidos");
                String apellidos = sc.nextLine();
                setApellidos(apellidos);
                break;
            case 3:
                System.out.println("Introduzca DNI");
                String dni = sc.nextLine();
                setDNI(dni);
                break;
            case 4:
                System.out.println("Introduzca dirección");
                String direccion = sc.nextLine();
                setDireccion(direccion);
                break;
            case 5:
                System.out.println("Introduzca antigüedad");
                int antiguedad = sc.nextInt();
                setAntiguedad(antiguedad);
                break;
            case 6:
                System.out.println("Introduzca teléfono de contacto");
                int telefono = sc.nextInt();
                setTelefono(telefono);
                break;
            case 7:
                System.out.println("Introduzca salario");
                int salario = sc.nextInt();
                setSalario(salario);
                break;
            case 8:
                System.out.println("Introduzca si tiene un supervisor (s/n)");
                char siNo = sc.next().charAt(0);
                sc.nextLine();
                if(siNo == 's'){
                    System.out.println("Introduce DNI del supervisor");
                    String dniSupervisor = sc.nextLine();
                    supervisor(this,dniSupervisor);
                }
                break;
       
        }
        
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
