
package arrays;
import java.util.*;

public class vectores4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int vector[] = new int[10];
     
    
    for(int i = 0;i < vector.length;i++){
            
       System.out.println("Introduce la posición "+(i+1));
       int num = sc.nextInt();
       
       while(num >= 0){
           System.out.println("Numero inválido, debe ser NEGATIVO");
           num = sc.nextInt();
       }
       
       vector[i] = num;
           
    }

    
     
        
    }
}
