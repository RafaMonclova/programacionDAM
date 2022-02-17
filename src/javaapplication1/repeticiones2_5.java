
package javaapplication1;
import java.util.*;

public class repeticiones2_5 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int i;
    System.out.println("Introduce numero de lados del cuadrado");
     
    int lados = sc.nextInt();
    
    for(i = 0;i<lados;i++){
   
        for(int j= 0; j <lados; j++){            
            System.out.print("*");
          
        } 
        System.out.println("");
    
    }    
        
     
        
    }

}
