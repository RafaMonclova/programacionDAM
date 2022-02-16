
package javaapplication1;
import java.util.*;

public class cadenas19 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce una cadena");
    String cadena = sc.nextLine();
    System.out.println("Introduce el final de la cadena");
    String finalCadena = sc.nextLine();
    
        
    int posicionFinal=cadena.lastIndexOf(finalCadena);
        
    if(posicionFinal ==cadena.length()-finalCadena.length()){
        
        System.out.println("TRUE");
        
    }else {
        System.out.println("FALSE");
    }    
        
    }
}
