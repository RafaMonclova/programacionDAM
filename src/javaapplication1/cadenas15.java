
package javaapplication1;
import java.util.*;

public class cadenas15 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    
    System.out.println("Dame una cadena");
    String cadena1 = sc.nextLine();
    System.out.println("Dame otra cadena");
    String cadena2 = sc.nextLine();
        
    if( cadena1.compareToIgnoreCase(cadena2) < 0 ){
        System.out.println("La cadena "+cadena2+" es mayor que "+cadena1);
    }else{
        System.out.println("La cadena "+cadena1+" es mayor que "+cadena2);
    }    
      //la mayor alfabeticamente es la mas avanzada en el abecedario  
        
    }
}
