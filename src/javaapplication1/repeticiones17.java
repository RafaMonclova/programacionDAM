
package javaapplication1;
import java.util.*;

public class repeticiones17 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
        
    int contador=0;    
    int cantidad=0;
    int totalArticulos=0;
    double precioTotal=0;
       
    char opcion = 's';    
    
    System.out.println("CAJA REGISTRADORA");
    System.out.println("-----------------------");
  
       while (opcion == 's'){
           contador++;
        System.out.println("Precio del producto "+contador);
        double precio = sc.nextDouble();
        
        System.out.println("Unidades del producto:");
        cantidad = sc.nextInt();
        totalArticulos=totalArticulos+cantidad;
        precioTotal=precioTotal+precio;
        
        System.out.println("Más productos? s/n");    
        opcion = sc.next().charAt(0);
                 
    } 
       
       double precioTotalIva=precioTotal*1.21;
       double descuento20Articulos=precioTotal*0.05;
       double descuento50Euros=precioTotal*0.05;
       
       System.out.println("RESUMEN DE COMPRA");
       System.out.println("TOTAL ARTICULOS: "+totalArticulos);
       System.out.println("PRECIO SIN IVA: "+precioTotal);
       System.out.println("PRECIO CON IVA (21%): "+((precioTotal*0.21)+precioTotal));  
       if (totalArticulos > 20){
           
          System.out.println("Descuento por mas de 20 articulos (5%): "+descuento20Articulos); 
           
       } 
       else {
           System.out.println("Descuento por mas de 20 articulos (5%): no alcanzado");
           
       }
       
       if (precioTotal > 50){
           System.out.println("Descuento por mas de 50 euros (5%): "+descuento50Euros);
           
       }
       else {
           System.out.println("Descuento por mas de 50 euros (5%): no alcanzado");
           
       }
       
       System.out.println("TOTAL A PAGAR: "+ (precioTotalIva-descuento20Articulos-descuento50Euros));
        
    }
}
