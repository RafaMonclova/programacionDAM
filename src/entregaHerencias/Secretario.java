
package entregaHerencias;

import static entregaHerencias.Main.supervisor;
import java.util.Scanner;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class Secretario extends Empleado{
    
    private boolean despacho;
    private int fax;

    
    public Secretario(boolean despacho, int fax, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }
    
    @Override
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
        System.out.println("8.DESPACHO ");
        System.out.println("9.FAX ");
        System.out.println("10.SUPERVISOR");
        
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
                System.out.println("Introduzca si tiene despacho (s/n)");
                char siNo = sc.next().charAt(0);
                if(siNo == 's')
                    setDespacho(true);
                break;
            case 9:
                System.out.println("Introduzca fax");
                int fax = sc.nextInt();
                setFax(fax);
                break;
            case 10:
                System.out.println("Introduzca si tiene un supervisor (s/n)");
                char siNoS = sc.next().charAt(0);
                sc.nextLine();
                if(siNoS == 's'){
                    System.out.println("Introduce DNI del supervisor");
                    String dniSupervisor = sc.nextLine();
                    supervisor(this,dniSupervisor);
                }
                break;    
            
        }
  
        
    }
    
    @Override
    public void imprimir(){
        
        System.out.println("-------SECRETARIO------");    
        super.imprimir();
        
        System.out.println("DESPACHO: "+despacho);
        System.out.println("FAX: "+fax);
        
        
    }
    
    @Override
    public double liquidoAPercibir(){
        return antiguedad * 0.05;
    }

    public boolean isDespacho() {
        return despacho;
    }

    public void setDespacho(boolean despacho) {
        this.despacho = despacho;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    
    
    
    
    
}
