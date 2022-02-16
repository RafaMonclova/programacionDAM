
package javaapplication1;
import java.util.*;

public class buscaerror {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);    
    System.out.println("Introduzca el número de pisos para el árbol");    
    int numPisos = sc.nextInt();    
    for(int altura = 1; altura<=numPisos; altura++){

        
        for(int espacioBlanco = 1; espacioBlanco <= numPisos-altura; espacioBlanco++){
                System.out.print(" ");
        }
        
        for(int asterisco=1; asterisco<=(altura*2)-1; asterisco++){
                System.out.print("*");
        }
            
        System.out.println(" ");             
    }
    
    }
}
