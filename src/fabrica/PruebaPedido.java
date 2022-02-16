
package fabrica;
import java.util.*;

public class PruebaPedido {
    public static void main(String [] args){
    
    Pedido miPedido = new Pedido();    
        
    
    miPedido.setProducto1("BOMBILLA", 1.5);
    miPedido.setProducto2("MACETA", 4);    
    miPedido.setProducto3("MONITOR", 140);    
    
     
    miPedido.mostrarPedido();
        
    System.out.println("Comparamos producto 1 con producto 3: ");
    System.out.println(miPedido.producto1.iguales(miPedido.producto3));    
        
        
        
        
        
    }
}
