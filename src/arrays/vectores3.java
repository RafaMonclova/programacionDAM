
package arrays;
import java.util.*;

public class vectores3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    /*
    for(int i = 1;i<=10;i++){
        
        int vector[] = {i};
        System.out.println(vector[0]);
    }
    */
    
    int vector[] = {1,2,3,4,5,6,7,8,9,10};
    
    int a = 0;
    int b = 0;
    int buffer = 0;
    
    for(int i = 0;i<30;i++){
       
        a = (int)(Math.random()*9)+1;
        b = (int)(Math.random()*9)+1;
        buffer = vector[a];
        vector[a] = vector[b];
        vector[b] = buffer;
    }    
    
    //PARES
    for(int i = 0;i<vector.length;i++){
       
       if(vector[i]%2==0){
           
           System.out.println(vector[i]);
       } 
      
    }    
        
    //IMPARES   
    for(int i = 0;i<vector.length;i++){
       
       if(vector[i]%2!=0){
           
           System.out.println(vector[i]);
       }  
       
    } 
    
    
    }
}
