
package arrays;
import java.util.*;

public class vectores8 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    char vector[] = new char[10];
    
    
    
    for(int i = 0; i<vector.length;i++){
        
        System.out.println("Introduce la letra "+(i+1));
        vector[i] = sc.next().charAt(0);
        
        
        
    }    
        
        
    for(int i = vector.length-1; i>=0;i--){
        
        System.out.println(vector[i]);
        
        
        
    }     
    }
}
