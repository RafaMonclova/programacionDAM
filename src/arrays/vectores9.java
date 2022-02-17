
package arrays;
import java.util.*;

public class vectores9 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    int vector1[] = new int[10];
    int vector2[] = new int[10];
    
    for(int i = 0; i<vector1.length;i++){
 
        vector1[i] = (int)(Math.random()*10);
        
    }
    
    for(int i = 0; i<vector2.length;i++){
 
        vector2[i] = (int)(Math.random()*10);
        
    }
        
    for(int i = 0; i<vector1.length;i++){
 
        System.out.println(vector1[i]+vector2[i]);
        
    }    
        
        
        
        
    }
}
