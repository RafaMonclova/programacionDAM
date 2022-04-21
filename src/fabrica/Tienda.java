
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
 * @author rafa
 */
public class Tienda {
    
    
    static ArrayList<Producto> listaProductos = new ArrayList();
    
    public static void añadirProducto(String nombre, double precio){
        
        Producto p = new Producto(nombre,precio);
        
        listaProductos.add(p);
        
        System.out.println("--Producto añadido correctamente--");
        
    }
    
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
    
    public static void mostrarProductos(){
        
        for(Producto p : listaProductos){
            p.resumen();
        }
        
    }
    
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
    
    public static void añadirProductosFichero(String fichero){
        
        BufferedReader br = null;
        
        try {
            
            br = new BufferedReader(new FileReader(fichero));
            
            String linea;
            
            while((linea = br.readLine()) != null){
                
                String[] parametros = linea.split("\\;");
                
                Producto p = new Producto(parametros[0],Double.parseDouble(parametros[1]));
                
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
    
    public static void sustituirProductosFichero(String fichero){
        
        ArrayList<Producto> listaNueva = new ArrayList();
        
        BufferedReader br = null;
        
        try {
            
            br = new BufferedReader(new FileReader(fichero));
            
            String linea;
            
            while((linea = br.readLine()) != null){
                
                String[] parametros = linea.split("\\;");
                
                Producto p = new Producto(parametros[0],Double.parseDouble(parametros[1]));
                
                listaNueva.add(p);
                
            }
            
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int opcion;
        do {
            
            System.out.println("1.Crear producto en la lista");
            System.out.println("2.Borrar producto de la lista");
            System.out.println("3.Mostrar productos");
            System.out.println("4.Grabar la lista de productos en un fichero");
            System.out.println("5.Añadir productos del fichero a la lista");
            System.out.println("6.Sustituir la lista actual por los productos del fichero");
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
