
package fabrica;
import static fabrica.Tienda.listaProductos;
import static fabrica.Tienda.mostrarProductos;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pedido {
Scanner sc = new Scanner(System.in);
    
ArrayList<Producto> pedido = new ArrayList();


public Pedido(){
    
}

public ArrayList<Producto> getPedido() {
    return pedido;
}

public void setPedido(ArrayList<Producto> pedido) {
    this.pedido = pedido;
}

public void crearPedido(){
    
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
    
}

public double total(){
    double total = 0;
    
    for(Producto p : pedido){
        
        total += p.getPrecio();
        
    }
    
    return total;
}

public void mostrarPedido(){
    
    
    for(Producto p : pedido){
        p.resumen();
    }
    
    System.out.println("=============================");
    System.out.println("=============================");
    System.out.println("TOTAL: "+total());
    
    
}  

public void añadirProducto(){
    
    
    
}

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pedido p = new Pedido();
        //MENÚ
        int opcion;
        do {
            
            System.out.println("======");
            System.out.println("TIENDA");
            System.out.println("======");
            System.out.println("1.Añadir producto al pedido");
            System.out.println("2.Borrar producto del pedido");
            System.out.println("3.Mostrar productos del pedido");
            System.out.println("4. FACTURA");
            System.out.println("0.SALIR");
        
            System.out.println("Introduce una opción:");
            opcion = sc.nextInt();
            sc.nextLine();
        
            switch(opcion){
                
                case 1:
                    System.out.println("1.Crear pedido");
                    p.crearPedido();
                    break;
                case 2:
                    System.out.println("2.Borrar producto del pedido");
                    break;
                case 3:
                    System.out.println("3.Mostrar productos del pedido");
                    p.mostrarPedido();
                    break;
                case 4:
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
