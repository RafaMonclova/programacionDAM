
package javaapplication1;
import java.util.*;

public class cadenas17 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce una cadena");
    String cadena = sc.nextLine();
    System.out.println("Introduce una letra");
    char letra = sc.next().charAt(0);
    
    int contadorLetra=0;
    int posicion = cadena.indexOf(letra);
    
    while(posicion != -1){
        
        contadorLetra++;
        posicion = cadena.indexOf(letra, posicion + 1);
    }
    
    System.out.println("La primera posición es: "+cadena.indexOf(letra));
    System.out.println("La letra aparece "+contadorLetra+" veces");   
        
        
        
    }
}
