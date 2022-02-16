
package javaapplication1;
import java.util.*;

public class moneda {
    public static void main (String[] args){
    
        Random rnd = new Random();
        
        boolean moneda = rnd.nextBoolean();
        if(moneda){
            System.out.println("Ha salido cara");
        }else System.out.println("Ha salido cruz");
        
        
        
        
        
    }
}
