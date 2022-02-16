
package javaapplication1;
import java.util.*;

public class cadenas16 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la cadena");
    String cadena = sc.nextLine();
        
        
    for(int i = 0; i<=7;i++){
        
        for(int j = 0; j<=2;j++){
            
           
            System.out.println("\033["+j+";3"+i+"m"+cadena);
            
            
        }
        
        
    }    
        
        
    }
}
