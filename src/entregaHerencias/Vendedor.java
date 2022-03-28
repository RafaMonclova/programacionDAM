
package entregaHerencias;

import static entregaHerencias.Main.supervisor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class Vendedor extends Empleado{

    protected Coche coche;
    protected int movil;
    protected String areaVenta;
    protected ArrayList<Cliente> listaClientes = new ArrayList();
    protected double porcentajeComision;

    
    public Vendedor(Coche coche, int movil, String areaVenta, double porcentajeComision, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.porcentajeComision = porcentajeComision;
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
        System.out.println("8.COCHE ");
        System.out.println("9.MOVIL ");
        System.out.println("10.AREA DE VENTA ");
        System.out.println("11.PORCENTAJE DE COMISION");
        System.out.println("12.SUPERVISOR");
        
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
                System.out.println("Introduzca los datos del vehículo");
                System.out.println("Introduzca la matrícula");
                String matricula = sc.nextLine();
                this.coche.setMatricula(matricula);
                System.out.println("Introduzca la marca");
                String marca = sc.nextLine();
                this.coche.setMarca(marca);
                System.out.println("Introduzca el modelo");
                String modelo = sc.nextLine();
                this.coche.setModelo(modelo);
                break;    
            case 9:
                System.out.println("Introduzca el móvil");
                int movil = sc.nextInt();
                setMovil(movil);
                break;
            case 10:
                System.out.println("Introduzca el área de venta");
                String areaVenta = sc.nextLine();
                setAreaVenta(areaVenta);
                break;
            case 11:
                System.out.println("Introduzca el porcentaje de comisión");
                int porcentajeComision = sc.nextInt();
                setPorcentajeComision(porcentajeComision);
                break;
            case 12:
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
    
    @Override
    public void imprimir(){
        
        System.out.println("-------VENDEDOR------");    
        super.imprimir();
        
        System.out.println("TELÉFONO MÓVIL: "+movil);
        System.out.println("ÁREA DE VENTA: "+areaVenta);
        System.out.println("LISTA DE CLIENTES: "+listaClientes);
        System.out.println("COMISIÓN(Porcentaje) "+porcentajeComision);
        
        System.out.println();
        
        System.out.println("----DATOS DEL VEHÍCULO------");
        System.out.println(coche);
        
       
    }
    
    public void altaCliente(String DNI, String nombre, String apellidos, int telefono){
        

        Cliente c = new Cliente(DNI,nombre,apellidos,telefono);
        if(listaClientes.contains(c.getDNI())){
            System.out.println("Error, ya existe un cliente con ese DNI");
        }
        else
            listaClientes.add(c);
        
    }
    
    public void bajaCliente(String DNI){
        
        Iterator<Cliente> it = listaClientes.iterator();
        
        while(it.hasNext()){
            
            Cliente actual = it.next();
            if(actual.getDNI().equals(DNI)){
                listaClientes.remove(actual);
            }
            
        }
        
    }
    
    public void cambiarCoche(String matricula, String marca,String modelo){
        
        this.coche = new Coche(matricula,marca,modelo);
        
    }
    
    @Override
    public double liquidoAPercibir(){
        return antiguedad * 0.1;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    
    
    
    
}
