
package javaapplication1;
import java.util.*;

public class cadenas10 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);    
        
    System.out.println("Introduce una cadena");
    String cadena = sc.nextLine();
    
    System.out.println("Introduce la letra a sustituir");
    char letra = sc.next().charAt(0);
        
    System.out.println("Introduce la letra nueva");
    char letra2 = sc.next().charAt(0);    
        
  
    System.out.println(cadena.replace(letra,letra2));

    
    }
}
