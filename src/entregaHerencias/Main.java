
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
    
    
    /**
     * Imprime los datos de los empleados registrados
     */
    public static void mostrar(){
        
        for(Empleado e : listaEmpleados){
            
            e.imprimir();
            
        }
        
    }
    
    /**
     * Imprime los datos de un empleado
     * @param DNI Recibe el DNI del empleado a mostrar
     */
    public static void mostrar(String DNI){
        boolean encontrado = false;
        for(Empleado e : listaEmpleados){
            if(e.getDNI().equals(DNI)){
                encontrado = true;
                e.imprimir();
            }
                
                
        }
        
        if(!encontrado)
            System.out.println("No existe ningún empleado con el DNI introducido.");
        
    }
    
    /**
     * Busca un secretario por su DNI
     * @param dni Recibe el DNI del secretario a buscar
     * @return Devuelve el secretario encontrado con el DNI dado
     */
    public static Empleado buscaSecretario(String dni){
   
        Empleado secretario = null;
        for(Empleado e : filtrarSecretarios()){
            
           if(e.getDNI().equals(dni)){
               secretario = e;
           }
             
            
        }
       
        return secretario;
        
    }
    
    /**
     * Busca un vendedor por su DNI
     * @param dni Recibe el DNI del vendedor a buscar
     * @return Devuelve el vendedor encontrado con el DNI dado
     */
    public static Empleado buscaVendedor(String dni){
   
        Empleado vendedor = null;
        for(Empleado e : filtrarVendedores()){
            
           if(e.getDNI().equals(dni)){
               vendedor = e;
           }
           
            
        }
       
        return vendedor;
        
    }
    
    /**
     * Busca un jefe por su DNI
     * @param dni Recibe el DNI del jefe a buscar
     * @return Devuelve el jefe encontrado con el DNI dado
     */
    public static Empleado buscaJefe(String dni){
   
        Empleado jefe = null;
        for(Empleado e : filtrarJefes()){
            
           if(e.getDNI().equals(dni)){
               jefe = e;
           }
            
        }
       
        return jefe;
        
    }
    
    /**
     * Filtra los empleados de tipo Secretario de la lista de empleados
     * @return Devuelve una lista con los secretarios registrados
     */
    public static ArrayList<Empleado> filtrarSecretarios(){
        
        ArrayList<Empleado> secretariosEmpresa = new ArrayList();
        
            for(Empleado e : listaEmpleados){
                if(e.getClass().getName().equals("entregaHerencias.Secretario")){
                    secretariosEmpresa.add(e);
                        
                }
            }
                
            return secretariosEmpresa;
         
        
    }
    
    /**
     * Filtra los empleados de tipo Vendedor de la lista de empleados
     * @return Devuelve una lista con los vendedores registrados
     */
    public static ArrayList<Empleado> filtrarVendedores(){
        
        ArrayList<Empleado> vendedoresEmpresa = new ArrayList();
        
            for(Empleado e : listaEmpleados){
                if(e.getClass().getName().equals("entregaHerencias.Vendedor")){
                    vendedoresEmpresa.add(e);
                        
                }
            }
                
            return vendedoresEmpresa;
         
        
    }
    
    /**
     * Filtra los empleados de tipo Jefe de la lista de empleados
     * @return Devuelve una lista con los jefes registrados
     */
    public static ArrayList<Empleado> filtrarJefes(){
        
        ArrayList<Empleado> jefesEmpresa = new ArrayList();
        
            for(Empleado e : listaEmpleados){
                if(e.getClass().getName().equals("entregaHerencias.Jefe")){
                    jefesEmpresa.add(e);
                        
                }
            }
                
            return jefesEmpresa;
         
        
    }
    
    /**
     * Imprime los datos de los empleados según su cargo
     * @param cargo Recibe el cargo de los empleados a imprimir
     */
    public static void filtrar(char cargo){
        
        switch(cargo){
            
            case 's':
                for(Empleado e : filtrarSecretarios()){
                    e.imprimir();
                }
                break;
            case 'v':
                for(Empleado e : filtrarVendedores()){
                    e.imprimir();
                }
                break;
            case 'j':
                for(Empleado e : filtrarJefes()){
                    e.imprimir();
                }
                break;
            
        }    
            
    }
    
    /**
     * Crea un coche pidiendo los datos por teclado
     * @return Devuelve un coche con los datos introducidos
     */
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
    
    /**
     * Establece un supervisor al empleado indicado
     * @param empleado Recibe el empleado al que asignar un supervisor
     * @param dniSupervisor Recibe el dni del supervisor 
     */
    public static void supervisor(Empleado empleado, String dniSupervisor){
        boolean supervisorExiste = false;
        for(Empleado e : listaEmpleados){
            if(e.getDNI().equals(dniSupervisor)){
                supervisorExiste = true;
                empleado.cambiarSupervisor(e);
                break;
            } 
                        
        }
        
        if(!supervisorExiste)
            System.out.println("No existe ningún empleado con ese DNI, se dará de alta sin supervisor");
    }
    
    /**
     * Crea un empleado del cargo recibido y lo añade a la lista de empleados
     * @param cargo Recibe el cargo del empleado a dar de alta
     */
    public static void altaEmpleado(char cargo){
        Scanner sc = new Scanner(System.in);
        switch(cargo){
            
            //Secretario
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
                
                //Se crea el secretario
                Secretario s = new Secretario(despacho, fax, nombreS, apellidosS, dniS, direccionS, antiguedadS, telefonoS, salarioS);
                
                //Asignamos el supervisor si se introduce 's'
                System.out.println("Tiene supervisor? (s/n)");
                char supervisorSiNoS = sc.next().charAt(0);
                sc.nextLine();
                if(supervisorSiNoS == 's'){
                    System.out.println("Indique el DNI del supervisor");
                    String dniSupervisorS = sc.nextLine();
                    supervisor(s,dniSupervisorS);
                    
                }
                
                //Se añade a la lista de empleados
                listaEmpleados.add(s);
                System.out.println("--Secretario registrado correctamente--");
                break;
                
            //Vendedor    
            case 'v':
                //Se crea un coche nuevo
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
                
                System.out.println("Cuántos clientes tendrá el vendedor?");
                int numClientes = sc.nextInt();
                sc.nextLine();
                ArrayList<Cliente> clientesVendedor = new ArrayList();
                for (int i = 0; i < numClientes; i++) {
                    System.out.println("Introduce DNI del cliente");
                    String dniCliente = sc.nextLine();
                    System.out.println("Introduce nombre del cliente");
                    String nombreCliente = sc.nextLine();
                    System.out.println("Introduce apellidos del cliente");
                    String apellidosCliente = sc.nextLine();
                    System.out.println("Introduce teléfono del cliente");
                    int telCliente = sc.nextInt();
                    Cliente cliente = new Cliente(dniCliente, nombreCliente, apellidosCliente, telCliente);
                    clientesVendedor.add(cliente);
                }
                
                //Se crea el vendedor
                Vendedor v = new Vendedor(c,movil,areaVenta,clientesVendedor,porcentajeComision,nombreV,apellidosV,dniV,direccionV,antiguedadV,telefonoV,salarioV);
                
                //Asignamos el supervisor si se introduce 's'
                System.out.println("Tiene supervisor? (s/n)");
                char supervisorSiNoV = sc.next().charAt(0);
                sc.nextLine();
                if(supervisorSiNoV == 's'){
                    System.out.println("Indique el DNI del supervisor");
                    String dniSupervisorV = sc.nextLine();
                    supervisor(v,dniSupervisorV);
                }
                
                //Se añade a la lista de empleados
                listaEmpleados.add(v);
                System.out.println("--Vendedor registrado correctamente--");
                break;
                
            //Jefe    
            case 'j':
                System.out.println("Tiene despacho?");
                char despachoSiNoJ = sc.next().charAt(0);
                boolean despachoJ;
                if(despachoSiNoJ == 's'){
                    despachoJ = true;
                }
                else
                    despachoJ = false;
                
                sc.nextLine();
                System.out.println("Introduce el dni del secretario al que supervisa");
                String dniSJ = sc.nextLine();
                
                //Si no existe un secretario con el DNI introducido, el método devuelve null, por lo que se pedirá el DNI hasta que corresponda con un secretario existente
                while(buscaSecretario(dniSJ) == null){
                    System.out.println("No existe el secretario, vuelva a escribir el DNI");
                    dniSJ = sc.nextLine();
                }
                
                //El secretario encontrado se asigna a sJ
                Secretario sJ = (Secretario)buscaSecretario(dniSJ);
                
                System.out.println("VENDEDORES DISPONIBLES:");
                //Lista de vendedores que tendrá el jefe
                ArrayList<Empleado> listaVendedoresJefe = new ArrayList();
                
                //Mostramos los vendedores de la empresa
                filtrar('v');
                
                System.out.println("Cuántos desea añadir a su cargo?");
                int numVendedores = sc.nextInt();
                sc.nextLine();
                
                for (int i = 0; i < numVendedores; i++) {
                    //Se busca el vendedor con el dni introducido mediante buscaVendedor(String dni), y se añade a la lista de vendedores del jefe
                    System.out.println("Introduce el DNI del vendedor:");
                    String dniVendedor = sc.nextLine();
                    
                    //Si no existe un vendedor con el DNI introducido, el método devuelve null, por lo que se pedirá el DNI hasta que corresponda con un vendedor existente
                    while(buscaVendedor(dniVendedor) == null){
                        System.out.println("No existe el vendedor, vuelva a escribir el DNI");
                        dniVendedor = sc.nextLine();
                    }
                    //Se añade el vendedor encontrado a la lista de vendedores del jefe
                    listaVendedoresJefe.add(buscaVendedor(dniVendedor));
                    
                    
                }
                //Se crea un coche nuevo
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
                
                //Se crea el jefe
                Jefe j = new Jefe(despachoJ, sJ,listaVendedoresJefe, cJ, nombreJ, apellidosJ, dniJ, direccionJ, antiguedadJ, telefonoJ, salarioJ);
                
                //Se añade a la lista de empleados
                listaEmpleados.add(j);
                System.out.println("--Jefe registrado correctamente--");
                
            break;
               
            
        }
        
    }
    
    /**
     * Elimina a un empleado dado su DNI
     * @param DNI Recibe el DNI del empleado a dar de baja
     */
    public static void bajaEmpleado(String DNI){
        
        Iterator it = listaEmpleados.iterator();
        while(it.hasNext()){
            Empleado e  = (Empleado) it.next();
            if(e.getDNI().equals(DNI)){
                it.remove();
            }
        }
        System.out.println("-Empleado dado de baja del sistema--");
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
        ArrayList<Cliente> clientesV1 = new ArrayList();
        ArrayList<Cliente> clientesV2 = new ArrayList();
        ArrayList<Cliente> clientesV3 = new ArrayList();
        Vendedor vj1 = new Vendedor(new Coche("1212TYU","KIA","RIO"), 987123467, "ZONA FRANCA",clientesV1, 10, "V1", "GARCÍA", "11111111A", "CALLE FLOR", 1, 968461285, 1200);
        Vendedor vj2 = new Vendedor(new Coche("2121TYU","OPEL","CORSA"), 987773467, "ZONA NORTE",clientesV2, 21, "V2", "LÓPEZ", "22222222A", "CALLE ZARZA", 2, 968568321, 1200);
        Vendedor vj3 = new Vendedor(new Coche("3434TYU","CITROEN","PICASSO"), 987123477, "ZONA FRANCA",clientesV3, 6, "V3", "GUTIÉRREZ", "33333333A", "CALLE CLAVEL", 3, 968661685, 1200);
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
        int opcion;
        do {
            System.out.println("===================");
            System.out.println("--MENÚ PRINCIPAL--"); 
            System.out.println("===================");
            System.out.println("1. Mostrar datos de los empleados");
            System.out.println("2. Añadir empleado pidiendo datos");
            System.out.println("3. Borrar empleado pidiendo datos");
            System.out.println("4. Modificar datos de empleado");
            System.out.println("5. Mostrar datos de un empleado dado su DNI");
            System.out.println("6. Mostrar datos de todos los empleados del mismo tipo");
            System.out.println("0. SALIR");
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
