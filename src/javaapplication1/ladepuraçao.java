
package javaapplication1;
import java.util.*;

public class ladepuraçao {
    public static void main(String[] args){
    long n = 20;
    long factorial = 1;    
    
    for(int i = 1 ; i <= n ; i++){ 
        
        factorial = factorial * i;  
        
    }
        
        System.out.println("El factorial de "+ n + " es "+ factorial);
    }
}
