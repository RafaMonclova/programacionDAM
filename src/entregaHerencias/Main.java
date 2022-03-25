
package entregaHerencias;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class Main {
    
    static ArrayList<Empleado> listaEmpleados = new ArrayList(); 
    

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    
    
    public static void mostrar(){
        
        for(Empleado e : listaEmpleados){
            
            e.imprimir();
            
        }
        
    }
    
    public static void mostrar(String DNI){
        
        for(Empleado e : listaEmpleados){
            if(e.getDNI().equals(DNI))
                e.imprimir();
                
        }
        
    }
    
    public static void filtrar(char cargo){
        
        ArrayList<Empleado> vendedoresEmpresa = new ArrayList();
        ArrayList<Empleado> secretariosEmpresa = new ArrayList();
        ArrayList<Empleado> jefesEmpresa = new ArrayList();

            for(Empleado empleado : listaEmpleados){
                if(empleado.getClass().getName().equals("entregaHerencias.Vendedor")){
                    vendedoresEmpresa.add(empleado);
                }
                if(empleado.getClass().getName().equals("entregaHerencias.Secretario")){
                    secretariosEmpresa.add(empleado);
                }
                if(empleado.getClass().getName().equals("entregaHerencias.Jefe")){
                    jefesEmpresa.add(empleado);
                }
                    
            }
        
        switch(cargo){
            
            case 's':
                for(Empleado e : secretariosEmpresa){
                    e.imprimir();
                }
                break;
            case 'v':
                for(Empleado e : vendedoresEmpresa){
                    e.imprimir();
                }
                break;
            case 'j':
                for(Empleado e : jefesEmpresa){
                    e.imprimir();
                }
                break;
            
        }    
            
    }
    
    
    //Devuelve un coche con los datos introducidos
    public static Coche creaCoche(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DATOS DEL VEHÍCULO");
        System.out.println("Introduce la matrícula:");
        String matricula = sc.nextLine();
        System.out.println("Introduce la marca:");
        String marca = sc.nextLine();
        System.out.println("Introduce el modelo:");
        String modelo = sc.nextLine();
                
        Coche c = new Coche(matricula,marca,modelo);
        return c;
        
    }
    
    //Establece un supervisor al empleado indicado
    public static void supervisor(Empleado empleado, String dniSupervisor){
        
        for(Empleado e : listaEmpleados){
            if(e.getDNI().equals(dniSupervisor)){
                empleado.cambiarSupervisor(e);
                break;
            }
            
                        
        }
    }
    
    //Crea un empleado del cargo recibido y lo añade a la lista de empleados
    public static void altaEmpleado(char cargo){
        Scanner sc = new Scanner(System.in);
        switch(cargo){
            
            case 's':
                System.out.println("Tiene despacho?");
                char despachoSiNo = sc.next().charAt(0);
                boolean despacho;
                if(despachoSiNo == 's'){
                    despacho = true;
                }
                else
                    despacho = false;
                
                System.out.println("Introduce número de fax:");
                int fax = sc.nextInt();
                sc.nextLine();
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
                
                
                Secretario s = new Secretario(despacho, fax, nombreS, apellidosS, dniS, direccionS, antiguedadS, telefonoS, salarioS);
                
                System.out.println("Tiene supervisor? (s/n)");
                char supervisorSiNoS = sc.next().charAt(0);
                sc.nextLine();
                if(supervisorSiNoS == 's'){
                    System.out.println("Indique el DNI del supervisor");
                    String dniSupervisorS = sc.nextLine();
                    supervisor(s,dniSupervisorS);
                    
                }
                        
                listaEmpleados.add(s);
                break;
            case 'v':
                Coche c = creaCoche(); 
                
                System.out.println("DATOS DEL EMPLEADO");
                System.out.println("Introduce móvil de contacto:");
                int movil = sc.nextInt();
                sc.nextLine();
                System.out.println("Introduce el área de venta:");
                String areaVenta = sc.nextLine();
                System.out.println("Introduce el porcentaje de comisión que recibe:");
                int porcentajeComision = sc.nextInt();
                sc.nextLine();
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
                
                System.out.println("Tiene supervisor? (s/n)");
                char supervisorSiNoV = sc.next().charAt(0);
                sc.nextLine();
                if(supervisorSiNoV == 's'){
                    System.out.println("Indique el DNI del supervisor");
                    String dniSupervisorV = sc.nextLine();
                    supervisor(v,dniSupervisorV);
                }
                
                listaEmpleados.add(v);
                break;
            case 'j':
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
                sc.nextLine();
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
                
                System.out.println("VENDEDORES DISPONIBLES:");
                //Lista de vendedores que tendrá el jefe
                ArrayList<Empleado> listaVendedoresJefe = new ArrayList();
                //Lista con los vendedores de la empresa
                ArrayList<Empleado> vendedoresEmpresa = new ArrayList();
                
                for(Empleado empleado : listaEmpleados){
                    if(empleado.getClass().getName().equals("entregaHerencias.Vendedor")){
                        empleado.imprimir();
                        vendedoresEmpresa.add(empleado);
                    }
                    
                }
                
                System.out.println("Cuántos desea añadir a su cargo?");
                int numVendedores = sc.nextInt();
                sc.nextLine();
                
                for (int i = 0; i < numVendedores; i++) {
                    
                    System.out.println("Introduce el DNI del vendedor:");
                    String dniVendedor = sc.nextLine();
                    
                    for(Empleado vendedor : vendedoresEmpresa){
                        if(vendedor.getDNI().equals(dniVendedor)){
                            listaVendedoresJefe.add(vendedor);
                        }
                    }
                    
                }
                
                Coche cJ = creaCoche();
                
                System.out.println("Introduce nombre:");
                String nombreJ = sc.nextLine();
                System.out.println("Introduce apellidos:");
                String apellidosJ = sc.nextLine();
                System.out.println("Introduce DNI:");
                String dniJ = sc.nextLine();
                System.out.println("Introduce dirección:");
                String direccionJ = sc.nextLine();
                System.out.println("Introduce su antigüedad:");
                int antiguedadJ = sc.nextInt();
                System.out.println("Introduce teléfono:");
                int telefonoJ = sc.nextInt();
                System.out.println("Introduce su salario:");
                int salarioJ = sc.nextInt();
                
                Jefe j = new Jefe(despachoJ, sJ,listaVendedoresJefe, cJ, nombreJ, apellidosJ, dniJ, direccionJ, antiguedadJ, telefonoJ, salarioJ);
                
                listaEmpleados.add(j);
                
            break;
               
            
        }
        
    }
    
    public static void bajaEmpleado(String DNI){
        
        Iterator it = listaEmpleados.iterator();
        while(it.hasNext()){
            Empleado e  = (Empleado) it.next();
            if(e.getDNI().equals(DNI)){
                it.remove();
            }
        }
        
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
           
        //secretarios
        Secretario s1 = new Secretario(true, 857230954, "ANTONIO", "PEREZ", "56392174T", "CALLE AMAPOLA", 5, 956732918, 900);
        Secretario s2 = new Secretario(false, 857875612, "PEDRO", "VÁZQUEZ", "56943912W", "CALLE MARGARITA", 6, 956789456, 900);
        listaEmpleados.add(s1);
        listaEmpleados.add(s2);
        
        //vendedores del jefe
        //Añadimos los vendedores a la lista de vendedores de j1 y a la lista de empleados
        ArrayList<Vendedor> listaVendedoresJ1 = new ArrayList();
        Vendedor vj1 = new Vendedor(new Coche("1212TYU","KIA","RIO"), 987123467, "ZONA FRANCA", 10, "V1", "GARCÍA", "11111111A", "CALLE FLOR", 1, 968461285, 1200);
        Vendedor vj2 = new Vendedor(new Coche("2121TYU","OPEL","CORSA"), 987773467, "ZONA NORTE", 21, "V2", "LÓPEZ", "22222222A", "CALLE ZARZA", 2, 968568321, 1200);
        Vendedor vj3 = new Vendedor(new Coche("3434TYU","CITROEN","PICASSO"), 987123477, "ZONA FRANCA", 6, "V3", "GUTIÉRREZ", "33333333A", "CALLE CLAVEL", 3, 968661685, 1200);
        listaVendedoresJ1.add(vj1);
        listaEmpleados.add(vj1);
        listaVendedoresJ1.add(vj2);
        listaEmpleados.add(vj2);
        listaVendedoresJ1.add(vj3);
        listaEmpleados.add(vj3);
        
        //jefe
        Jefe j1 = new Jefe(true,s1,listaVendedoresJ1,new Coche("7070QWE","MERCEDES","PRO"),"ALFONSO", "PÉREZ", "44870123N", "CALLE ROCA", 32, 978123456, 2200);
        listaEmpleados.add(j1);
        
        
        //MENÚ
        System.out.println("1. Mostrar datos de los empleados");
        System.out.println("2. Añadir empleado pidiendo datos");
        System.out.println("3. Borrar empleado pidiendo datos");
        System.out.println("4. Modificar datos de empleado");
        System.out.println("5. Mostrar datos de un empleado dado su DNI");
        System.out.println("6. Mostrar datos de todos los empleados del mismo tipo");
        System.out.println("0. SALIR");
        
        
        int opcion;
        do {
            System.out.println("Introduce una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                
                case 1:
                    System.out.println("1. Mostrar datos de los empleados");
                    mostrar();
                    break;
                case 2:
                    System.out.println("2. Añadir empleado pidiendo datos");
                    System.out.println("Introduce el cargo del empleado(secretario(s),vendedor(v),jefe(j))");
                    char cargo = sc.next().charAt(0);
                    altaEmpleado(cargo);
                    break;
                case 3:
                    System.out.println("3. Borrar empleado pidiendo datos");
                    System.out.println("Introduce el DNI del empleado a eliminar");
                    String dniEliminar = sc.nextLine();
                    bajaEmpleado(dniEliminar);
                    break;
                case 4:
                    System.out.println("4. Modificar datos de empleado");
                    System.out.println("Introduzca el DNI del empleado al que desea modificar sus datos");
                    String dniModificar = sc.nextLine();
                    for(Empleado d : listaEmpleados){
                        if(d.getDNI().equals(dniModificar)){
                            d.modificar();
                        }
                    }
                    
                    break;
                case 5:
                    System.out.println("5. Mostrar datos de un empleado dado su DNI");
                    System.out.println("Introduce el DNI del empleado a mostrar");
                    String dniMostrar = sc.nextLine();
                    mostrar(dniMostrar);
                    break;
                case 6:
                    System.out.println("6. Mostrar datos de todos los empleados del mismo tipo");
                    System.out.println("Introduce el cargo a mostrar (s-secretarios,v-vendedores,j-jefes)");
                    char cargoFiltrar = sc.next().charAt(0);
                    filtrar(cargoFiltrar);
                    break;
                case 0:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("Introduce una opción válida.");
                    break;
                         
            }
            
            
        } while (opcion != 0);
        
        
        
    }
    
}
