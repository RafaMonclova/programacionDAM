
package entregaHerencias;

import static entregaHerencias.Main.supervisor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class Jefe extends Empleado{
    
    protected boolean despacho;
    protected Secretario secretarioSupervisa;
    protected ArrayList<Vendedor> listaVendedores;
    protected Coche coche;
    

    public Jefe(boolean despacho, Secretario secretarioSupervisa, ArrayList listaVendedores, Coche coche, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.secretarioSupervisa = secretarioSupervisa;
        this.listaVendedores = listaVendedores;
        this.coche = coche;
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
        System.out.println("8.DESPACHO");
        System.out.println("9.SECRETARIO QUE SUPERVISA");
        System.out.println("10.LISTA VENDEDORES");
        System.out.println("11.COCHE");
        System.out.println("12.SUPERVISOR ");
        
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
                System.out.println("Introduzca los datos de su secretario");
                System.out.println("Tiene despacho?");
                char despachoSiNoSJ = sc.next().charAt(0);
                boolean despachoSJ;
                if(despachoSiNoSJ == 's'){
                    this.secretarioSupervisa.setDespacho(true);
                }
                
                System.out.println("Introduce número de fax:");
                int faxSJ = sc.nextInt();
                sc.nextLine();
                this.secretarioSupervisa.setFax(faxSJ);
                System.out.println("Introduce nombre:");
                String nombreSJ = sc.nextLine();
                this.secretarioSupervisa.setNombre(nombreSJ);
                System.out.println("Introduce apellidos:");
                String apellidosSJ = sc.nextLine();
                this.secretarioSupervisa.setApellidos(apellidosSJ);
                System.out.println("Introduce DNI:");
                String dniSJ = sc.nextLine();
                this.secretarioSupervisa.setDNI(dniSJ);
                System.out.println("Introduce dirección:");
                String direccionSJ = sc.nextLine();
                this.secretarioSupervisa.setDireccion(direccionSJ);
                System.out.println("Introduce su antigüedad:");
                int antiguedadSJ = sc.nextInt();
                this.secretarioSupervisa.setAntiguedad(antiguedadSJ);
                System.out.println("Introduce teléfono:");
                int telefonoSJ = sc.nextInt();
                this.secretarioSupervisa.setTelefono(telefonoSJ);
                System.out.println("Introduce su salario:");
                int salarioSJ = sc.nextInt();
                this.secretarioSupervisa.setSalario(salarioSJ);
                
                break;
            case 10:
                
                for(Empleado e : listaVendedores){         
                    e.imprimir();   
                }
                System.out.println("Introduzca el DNI del vendedor a modificar sus datos");
                String dniVendedor = sc.nextLine();
                
                for(Empleado d : listaVendedores){
                        if(d.getDNI().equals(dniVendedor)){
                            d.modificar();
                        }
                    }
                
                break;
            case 11:
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
                
            case 12:
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
    public double liquidoAPercibir(){
        return antiguedad * 0.2;
    }
    
    @Override
    public void imprimir(){
        
        System.out.println("-------JEFE DE ZONA------");    
        super.imprimir();
        
        System.out.println("DESPACHO "+despacho);
        System.out.println("================================");
        System.out.println("SECRETARIO: ");
        secretarioSupervisa.imprimir();
        System.out.println("LISTA DE VENDEDORES: ");
        for(Empleado v : listaVendedores){
            v.imprimir();
        }
        System.out.println("================================");
        
        System.out.println();
        
        System.out.println("----DATOS DEL VEHÍCULO------");
        System.out.println(coche);
        
       
    }
    
    public void cambiarSecretario(boolean despacho, int fax,String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario){
        
        Secretario s = new Secretario(despacho, fax, nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        setSecretarioSupervisa(s);
    }
    
    public void cambiarCoche(String matricula, String marca,String modelo){
        
        this.coche = new Coche(matricula,marca,modelo);
        
    }
    
    public void altaVendedor(Coche coche, int movil, String areaVenta, double porcentajeComision, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario){
        

        Vendedor v = new Vendedor(coche, movil, areaVenta, porcentajeComision, nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        if(listaVendedores.contains(v)){
            System.out.println("Error, ya existe un vendedor con ese DNI");
        }
        else
            listaVendedores.add(v);
        
    }
    
    public void bajaVendedor(String DNI){
        
        Iterator<Vendedor> it = listaVendedores.iterator();
        
        while(it.hasNext()){
            
            Vendedor actual = it.next();
            if(actual.getDNI().equals(DNI)){
                listaVendedores.remove(actual);
            }
            
        }
        
    }

    public boolean isDespacho() {
        return despacho;
    }

    public void setDespacho(boolean despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretarioSupervisa() {
        return secretarioSupervisa;
    }

    public void setSecretarioSupervisa(Secretario secretarioSupervisa) {
        this.secretarioSupervisa = secretarioSupervisa;
    }

    public ArrayList getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ArrayList listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
    
    
}
