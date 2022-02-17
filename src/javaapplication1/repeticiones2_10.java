
package javaapplication1;
import java.util.*;

public class repeticiones2_10 {
    public static void main(String[]args){
    
    for(int i = 0; i<10;i++){
        
        if (i==3){
            String letra = Integer.toString(i);
            letra = "E";
            System.out.println(letra+"-"+letra+"-"+letra+"-"+letra+"-"+letra);
            
        }
        else {
            
            System.out.println(i+"-"+i+"-"+i+"-"+i+"-"+i);
        }
        
    }
        
       
    }
}
