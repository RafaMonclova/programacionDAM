
package javaapplication1;
import java.util.*;

public class cadenas9 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce una cadena");
    String cadena = sc.nextLine();
    
    System.out.println("Introduce una letra");
    char letra = sc.next().charAt(0);
    int contadorLetra=0;    
        
    for (int i = 0; i < cadena.length(); i++) {
        if (   letra == cadena.charAt(i)   ){
            contadorLetra++;
    }   
     
    }
    System.out.println("La letra "+letra+ " aparece "+contadorLetra+" veces");  
}
}