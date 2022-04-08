
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

    
    public Vendedor(Coche coche, int movil, String areaVenta,ArrayList<Cliente> listaClientes ,double porcentajeComision, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        super.salario = liquidoAPercibir();
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.listaClientes = listaClientes;
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
        System.out.println("12.CLIENTES");
        System.out.println("13.SUPERVISOR");
        
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
                System.out.println("Introduzca la marca");
                String marca = sc.nextLine();
                System.out.println("Introduzca el modelo");
                String modelo = sc.nextLine();
                cambiarCoche(matricula,marca,modelo);
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
                System.out.println("--CLIENTES REGISTRADOS--");
                System.out.println(listaClientes);
                System.out.println("Qué desea realizar?");
                System.out.println("1.Alta de cliente");
                System.out.println("2.Baja de cliente");
                int opcionCliente = sc.nextInt();
                sc.nextLine();
                switch(opcionCliente){
                    
                    case 1:
                        System.out.println("1.Alta de cliente");
                        System.out.println("DNI:");
                        String dniCliente = sc.nextLine();
                        System.out.println("NOMBRE:");
                        String nombreCliente = sc.nextLine();
                        System.out.println("APELLIDOS:");
                        String apellidosCliente = sc.nextLine();
                        System.out.println("TELÉFONO:");
                        int telCliente = sc.nextInt();
                        Cliente c = new Cliente(dniCliente,nombreCliente,apellidosCliente,telCliente);
                        altaCliente(c);
                        
                        break;
                    case 2:
                        System.out.println("2.Baja de cliente");
                        System.out.println("Introduce el DNI del cliente a dar de baja");
                        String dniBaja = sc.nextLine();
                        bajaCliente(dniBaja);
                        
                        break;
                    default:
                        System.out.println("Opción inválida.");
                    
                }
                
                break;
            case 13:
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
    
    public void altaCliente(Cliente c){
        
        boolean existe = false;
        for(Cliente cli : listaClientes){
            
            if(cli.getDNI().equals(c.getDNI())){
                existe = true;
                System.out.println("El cliente ya existe, no se añadirá.");
                break;
            }
            
        }
        
        if(!existe)
            listaClientes.add(c);
            System.out.println("--Cliente dado de alta correctamente--");
        
        
    }
    
    public void bajaCliente(String DNI){
        
        Iterator<Cliente> it = listaClientes.iterator();
        
        while(it.hasNext()){
            
            Cliente actual = it.next();
            if(actual.getDNI().equals(DNI)){
                it.remove();
            }
            
        }
        System.out.println("--Cliente dado de baja correctamente--");
        
    }
    
    public void cambiarCoche(String matricula, String marca,String modelo){
        
        this.coche = new Coche(matricula,marca,modelo);
        
    }
    
    @Override
    public double liquidoAPercibir(){
        //Aumento anual del 10%
        double aumentoAnual = antiguedad * 0.1;
        return salario + aumentoAnual;
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
