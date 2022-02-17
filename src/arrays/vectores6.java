
package arrays;
import java.util.*;

public class vectores6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int vector[] = new int[5];
    int mayor = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    
    for(int i = 0; i<vector.length;i++){
        
        
        vector[i] = (int)(Math.random()*10);
        
    } 
        
    for(int i = 0; i<vector.length;i++){
        
        
       System.out.println(vector[i]); 
       
       if(vector[i]>mayor){
            mayor = vector[i];
        }
        if(vector[i]<menor){
            menor = vector[i];
        }
       
    }     
        
    System.out.println("El mayor es: "+mayor);
    System.out.println("El menor es: "+menor);
    
        
        
        
        
    }
}
