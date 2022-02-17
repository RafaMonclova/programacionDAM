
package fabrica;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pedido {
Scanner sc = new Scanner(System.in);
    

Producto producto1;
Producto producto2;
Producto producto3;

Pedido(){
    
    
    producto1 = new Producto();
    producto2 = new Producto();
    producto3 = new Producto();
    
}
 

Producto getProducto1(){
    return producto1;
}

Producto getProducto2(){
    return producto2;
}

Producto getProducto3(){
    return producto3;
}

void setProducto1(String nombre, double precio){
    producto1.setNombre(nombre);
    producto1.generar();
    producto1.setPrecio(precio);
}

void setProducto2(String nombre, double precio){
    producto2.setNombre(nombre);
    producto2.generar();
    producto2.setPrecio(precio);
}

void setProducto3(String nombre, double precio){
    producto3.setNombre(nombre);
    producto3.generar();
    producto3.setPrecio(precio);
}


void pedirProducto(int producto){
         
        switch(producto){
        
        case 1:
            System.out.println("PRODUCTO 1");
            System.out.println("Introduce el nombre del producto: ");
            producto1.setNombre(sc.nextLine());
            System.out.println("Introduce el precio del producto: ");
            producto1.setPrecio(sc.nextDouble());
        break;
        
        case 2:
            System.out.println("PRODUCTO 2");
            System.out.println("Introduce el nombre del producto: ");
            producto2.setNombre(sc.nextLine());
            System.out.println("Introduce el precio del producto: ");
            producto2.setPrecio(sc.nextDouble());
        break;
        
        case 3:
            System.out.println("PRODUCTO 3");
            System.out.println("Introduce el nombre del producto: ");
            producto3.setNombre(sc.nextLine());
            System.out.println("Introduce el precio del producto: ");
            producto3.setPrecio(sc.nextDouble());
        break;
        
        default:
            System.out.println("Introduce un número de producto válido (1,2,3)");
        
    }
          
    
}

double total(){
    return producto1.getPrecio() + producto2.getPrecio() + producto3.getPrecio();
}

void mostrarPedido(){
    
    System.out.println("RESUMEN PRODUCTO 1: ");
    producto1.resumen();
    System.out.println("RESUMEN PRODUCTO 2: ");
    producto2.resumen();
    System.out.println("RESUMEN PRODUCTO 3: ");
    producto3.resumen();
    System.out.println("=============================");
    System.out.println("=============================");
    System.out.println("TOTAL: "+total());
    
    
}  



}
