
package javaapplication1;
import java.util.*;

public class repeticiones6 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce numero de pisos");
    int pisos = sc.nextInt();
    
        for(int i= 0; i <= pisos; i++){
            for(int j= i; j > 0; j--)
            System.out.print("*");
            
        System.out.println("");
        }
        
        
        
        
    }
}
