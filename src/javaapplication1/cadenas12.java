
package javaapplication1;
import java.util.*;

public class cadenas12 {
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce una cadena");
    String cadena = sc.nextLine();
    cadena= cadena.trim();
    
    System.out.println("Introduce una letra");
    char letra = sc.next().charAt(0);
    int contadorBorradas = 0;   
        
    for (int i = 0; i < cadena.length(); i++) {
        if (   letra == cadena.charAt(i)   ){
            cadena = cadena.replace(letra, ' ');
            
    }   
    contadorBorradas++;
    }
    
    System.out.println("La nueva cadena es: "+cadena);     
    System.out.println("Se han borrado: "+contadorBorradas + " caracteres");             
        
    }
}
