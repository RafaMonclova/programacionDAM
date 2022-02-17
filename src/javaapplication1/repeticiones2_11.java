
package javaapplication1;
import java.util.*;

public class repeticiones2_11 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int usuario;
      int pass;
    
    do {
        
       System.out.println("Introduce usuario");
        usuario = sc.nextInt();
        System.out.println("Introduce contraseña");
        pass = sc.nextInt();    
    } while (usuario!=12 || pass !=1234);//hasta que usuario sea 12 y contraseña 1234.
      
    
    
    
    
    }
}
