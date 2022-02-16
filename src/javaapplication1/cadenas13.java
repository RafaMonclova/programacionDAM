
package javaapplication1;
import java.util.*;

public class cadenas13 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
    
    System.out.println("Introduce una palabra");
    String palabra = sc.nextLine();
    boolean palindromo = true;
        
    for(int i = 0; i < palabra.length()/2; i++){
        if(palabra.charAt(i) != palabra.charAt( palabra.length()-1 -i)  ){
           palindromo=false; 
           break;    
        }
         
        
    }
    if (palindromo){
        System.out.println("Es palíndromo");
    }
    else {
        System.out.println("NO es palíndromo");
    }
    
        
        
        
    }
}
