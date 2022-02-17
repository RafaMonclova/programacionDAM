
package javaapplication1;
import java.util.*;

public class cadenas8 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la primera cadena");
    String cadena1 = sc.nextLine();
    
    System.out.println("Introduce la siguiente cadena");
    String cadena2 = sc.nextLine();
        
    int longitud1 = cadena1.length();    
    int longitud2 = cadena2.length();    
        
    if(longitud1>longitud2){
        System.out.println("La cadena más larga es "+cadena1+ " por: "+(longitud1-longitud2) + " caracteres");
    }else if(longitud2 > longitud1){
        System.out.println("La cadena más larga es "+cadena2+ " por: "+(longitud2-longitud1) + " caracteres");
    }else if (longitud1==longitud2){  
        System.out.println("Las cadenas miden lo mismo");
    }    
       
    
    
    
    
    }
}
