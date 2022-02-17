
package javaapplication1;
import java.util.*;

public class cadenas18 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce una cadena");
    String cadena = sc.nextLine();
    System.out.println("Introduce una palabra");
    String palabra = sc.nextLine();
    
    
    int contadorPalabra=0;
    int posicion = cadena.indexOf(palabra);
    
    while(posicion != -1){
        
        contadorPalabra++;
        posicion = cadena.indexOf(palabra, posicion + 1);
    }
    
   
    System.out.println("La palabra aparece "+contadorPalabra+" veces");     
        
        
        
        
    }
}
