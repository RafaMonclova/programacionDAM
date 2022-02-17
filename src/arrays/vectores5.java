
package arrays;
import java.util.*;

public class vectores5 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);


    int vector[] = new int[10];
    int sumaTotal = 0;   
    int producto = 1;
    for(int i = 0; i<vector.length;i++){
        
        
        vector[i] = (int)(Math.random()*10);
        
    } 
        
    for(int i = 0; i<vector.length;i++){
        
        
       System.out.println(vector[i]); 
       
       sumaTotal = sumaTotal + vector[i];
       producto = producto * vector[i]; 
       
       
    }     
        
    System.out.println("La suma es: "+sumaTotal);
    System.out.println("El producto es: "+producto);
        
        
    }
}
