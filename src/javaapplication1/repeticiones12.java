
package javaapplication1;
import java.util.*;

public class repeticiones12 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int anterior = 1;
    int siguiente = 1;

    System.out.println("Introduzca un numero mayor que 2");
    
    int num = sc.nextInt();
    
    for (int i = 2; i<=num; i++){
        
        int numTemporal=anterior;
        anterior=siguiente;
        siguiente=numTemporal+siguiente;
        System.out.print(anterior+ " / ");
        
        
    }
    }
}
