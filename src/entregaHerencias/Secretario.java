
package entregaHerencias;

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
        
        int opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
            
            case 1:
                System.out.println("Introduzca nombre");
                String nombre = sc.nextLine();
                setNombre(nombre);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                
                break;
            case 9:
                System.out.println("Introduce fax");
                int fax = sc.nextInt();
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
        return salario * 0.05;
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
