
package listas;
import java.util.*;

public class Ejercicio14 {
    static Map<String, Double> tienda = new HashMap<>();
    
    static void introducirProducto(String codigo, double precio){
        
        tienda.put(codigo, precio);
        
    }
    
    static void modificarProducto(String codigo, double precio){
        
        tienda.put(codigo, precio);
        
    }
    
    static void mostrarProductos(){
        Iterator it = tienda.keySet().iterator();
        while(it.hasNext()){
            String key  = (String) it.next();
            System.out.println("Código: "+key + ", Precio: "+tienda.get(key));
            
        }
    }
    
    static void eliminarProducto(String codigo){
        
        tienda.remove(codigo);
        
    }
    
    
    
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    
    
    System.out.println("1. Introducir producto");
    System.out.println("2. Modificar precio");
    System.out.println("3. Mostrar todos los productos");
    System.out.println("4. Eliminar producto");
    System.out.println("5. Salir");
    
    int opcion;
    
    do{
        System.out.println("Seleccione una opción: ");
        opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
            
            case 1:
                System.out.println("1. Introducir producto");
                System.out.println("Introduce código de producto: ");
                String codigoIntroducir = sc.nextLine();
                System.out.println("Introduce precio de producto: ");
                double precioIntroducir = sc.nextDouble();
                
                introducirProducto(codigoIntroducir,precioIntroducir);
            break;
            case 2:
                System.out.println("2. Modificar precio");
                System.out.println("Introduce código de producto a modificar: ");
                String codigoModificar = sc.nextLine();
                System.out.println("Introduce nuevo precio de producto: ");
                double precioModificar = sc.nextDouble();
                
                modificarProducto(codigoModificar,precioModificar);
            break;
            case 3:
                System.out.println("3. Mostrar todos los productos");
                mostrarProductos();
            break;
            case 4:
                System.out.println("4. Eliminar producto");
                System.out.println("Introduce código de producto a eliminar: ");
                String codigoEliminar = sc.nextLine();
                
                eliminarProducto(codigoEliminar);
            break;
            case 5:
                System.out.println("SALIENDO...");
            break;
            default:
                System.out.println("Opción inválida. Seleccione 1,2,3,4");
            break;    
        
            
        }
        
        
    }while(opcion != 5);    
        
        
        
        
        
        
        
        
        
        
        
    }
}
