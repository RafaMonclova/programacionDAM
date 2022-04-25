
package fabrica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class Tienda {
    
    //La lista de productos es un atributo estático
    static ArrayList<Producto> listaProductos = new ArrayList();
    static ArrayList<Producto> pedido = new ArrayList();
    
    /**
     * Crea un producto con los datos recibidos y lo añade a la lista
     * @param nombre Recibe el nombre del producto
     * @param precio Recibe el precio del producto
     */
    public static void añadirProducto(String nombre, double precio){
        
        Producto p = new Producto(nombre,precio);
        
        listaProductos.add(p);
        
        System.out.println("--Producto añadido correctamente--");
        
    }
    
    /**
     * Borra un producto de la lista por su nombre
     * @param nombre Recibe el nombre del producto a borrar
     */
    public static void borrarProducto(String nombre){
        
        Iterator it = listaProductos.iterator();
        
        while(it.hasNext()){
            Producto e  = (Producto) it.next();
                if(e.getNombre().equals(nombre)){
                    it.remove();
                    System.out.println("--Producto eliminado correctamente--");
                }
        }
        
    }
    
    /**
     * Muestra los datos de los productos registrados en la lista
     */
    public static void mostrarProductos(){
        
        for(Producto p : listaProductos){
            p.resumen();
        }
        
    }
    
    /**
     * Graba los datos de los productos registrados en un fichero
     * @param fichero Recibe el fichero donde grabar los datos de los productos
     */
    public static void grabarLista(String fichero){
        
        PrintWriter pw = null;
        
        try {
            
            pw = new PrintWriter(new FileWriter(fichero));
            
            for(Producto p : listaProductos){
                pw.println(p.getNombre() + ";" + p.getSerie() + ";" + p.getPrecio());
            }
            
            System.out.println("--Se han grabado los datos al fichero "+fichero+"--");
            
        } catch (IOException ex) {
            System.out.println("Error de E/S");
        }
        
        finally{
            pw.close();
        }
        
    }
    
    /**
     * Añade los productos de un fichero a la lista de productos
     * @param fichero Recibe el fichero donde leer los datos
     */
    public static void añadirProductosFichero(String fichero){
        
        BufferedReader br = null;
        
        try {
            
            br = new BufferedReader(new FileReader(fichero));
            
            String linea;
            
            while((linea = br.readLine()) != null){
                
                String[] parametros = linea.split("\\;");
                
                //De cada línea, la posición 0 es el nombre, y la posición 2 el precio
                Producto p = new Producto(parametros[0],Double.parseDouble(parametros[2]));
                //La posición 1 es la serie, que se establece con setSerie, ya que el constructor genera una aleatoria
                p.setSerie(Integer.parseInt(parametros[1]));
                listaProductos.add(p);
                
            }
            
            System.out.println("--Se han cargado los productos del fichero "+fichero+"--");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al acceder al fichero");
        } catch (IOException ex) {
            System.out.println("Error de E/S");
        }
        finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error de E/S");
            }
        }
        
    }
    
    /**
     * Sustituye los productos registrados por los productos de un fichero
     * @param fichero Recibe un fichero donde leer los datos
     */
    public static void sustituirProductosFichero(String fichero){
        
        //Se crea una lista vacía donde añadir los productos leídos
        ArrayList<Producto> listaNueva = new ArrayList();
        
        BufferedReader br = null;
        
        try {
            
            br = new BufferedReader(new FileReader(fichero));
            
            String linea;
            
            while((linea = br.readLine()) != null){
                
                String[] parametros = linea.split("\\;");
                
                //De cada línea, la posición 0 es el nombre, y la posición 2 el precio
                Producto p = new Producto(parametros[0],Double.parseDouble(parametros[2]));
                //La posición 1 es la serie, que se establece con setSerie, ya que el constructor genera una aleatoria
                p.setSerie(Integer.parseInt(parametros[1]));
                listaNueva.add(p);
                
            }
            
            //Se establece la lista nueva al atributo 
            listaProductos = listaNueva;
            
            System.out.println("--Se ha reemplazado la lista actual por los productos del fichero "+fichero+"--");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al acceder al fichero");
        } catch (IOException ex) {
            System.out.println("Error de E/S");
        }
        finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error de E/S");
            }
        }
        
    }
    
    public static String mostrar(){
        String salida = "";
        for(Producto p : listaProductos){
            salida += p + "\n";
        }
        
        return salida;
        
    }
    
    public static double totalPedido(){
        double total = 0;
        for(Producto p : pedido){
            
            total += p.getPrecio();
            
        }
        
        return total;
        
    }
    
    public static void crearPedido(){
        Scanner sc = new Scanner(System.in);
           
        
        char opcion;
        do {
            System.out.println("Desea introducir un producto? s/n");

            opcion = sc.next().charAt(0);
            sc.nextLine();
        
            if(opcion == 's'){
            
                mostrarProductos();
            
                System.out.println("Introduzca el nombre del producto");
                String nombre = sc.nextLine();
            
                for(Producto p : listaProductos){
                
                    if(p.getNombre().equals(nombre)){
                        pedido.add(p);
                        break;
                    }
                
                }
            
            }
        
        
        } while (opcion != 'n');
        
        System.out.println("--Pedido creado correctamente--");
    
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //MENÚ
        int opcion;
        do {
            
            System.out.println("======");
            System.out.println("TIENDA");
            System.out.println("======");
            System.out.println("1.Crear producto en la lista");
            System.out.println("2.Borrar producto de la lista");
            System.out.println("3.Mostrar productos");
            System.out.println("4.Grabar la lista de productos en un fichero");
            System.out.println("5.Añadir productos del fichero a la lista");
            System.out.println("6.Sustituir la lista actual por los productos del fichero");
            System.out.println("7.Crear pedido");
            System.out.println("8.FACTURA");
            System.out.println("0.SALIR");
        
            System.out.println("Introduce una opción:");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                
                case 1:
                    System.out.println("1.Crear producto en la lista");
                    System.out.println("Introduce nombre del producto");
                    String nombreCrear = sc.nextLine();
                    System.out.println("Introduce precio");
                    double precioCrear = sc.nextDouble();
                    añadirProducto(nombreCrear,precioCrear);
                    break;
                case 2:
                    System.out.println("2.Borrar producto de la lista");
                    System.out.println("Introduce nombre del producto a borrar");
                    String nombreBorrar = sc.nextLine();
                    borrarProducto(nombreBorrar);
                    break;
                case 3:
                    System.out.println("3.Mostrar productos");
                    mostrarProductos();
                    break;
                case 4:
                    System.out.println("4.Grabar la lista de productos en un fichero");
                    System.out.println("Introduce el nombre del fichero");
                    String ficheroGrabar = sc.nextLine();
                    grabarLista(ficheroGrabar);
                    break;
                case 5:
                    System.out.println("5.Añadir productos del fichero a la lista");
                    System.out.println("Introduce el nombre del fichero");
                    String ficheroAñadir = sc.nextLine();
                    añadirProductosFichero(ficheroAñadir);
                    break;
                case 6:
                    System.out.println("6.Sustituir la lista actual por los productos del fichero");
                    System.out.println("Introduce el nombre del fichero");
                    String ficheroSustituir = sc.nextLine();
                    sustituirProductosFichero(ficheroSustituir);
                    break;
                case 7:
                    System.out.println("7.Crear pedido");
                    crearPedido();
                    break;
                case 8:
                    System.out.println("8.FACTURA");
                    Factura f = new Factura();
                    f.setVisible(true);
                    
                    String [] productos = new String[pedido.size()];
                    
                    for (int i = 0; i < productos.length; i++) {
                        
                        productos[i] = pedido.get(i).toString();
  
                    }

                    f.jList1.setListData(productos);
                    f.jLabel2.setText("TOTAL: "+totalPedido());
                    break;
                case 0:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("Opción inválida (1-6)");
                    break;
                
            }
            
        } while (opcion != 0);
        
        
        
    }
    
    
    
}
