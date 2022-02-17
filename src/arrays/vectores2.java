
package arrays;
import java.util.*;

public class vectores2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
        
    System.out.println("Introduce el tamaño del array");
    double tamaño = sc.nextDouble();
        
    int vector[] = new int[(int)tamaño];    
        
    for(int i = 0;i < vector.length;i++){
        
       System.out.println("Introduce la posición "+(i+1));
       vector[i] = sc.nextInt(); 
       
    }
    
    System.out.println("VALORES: ");
    
    for(int i = 0;i < vector.length;i++){
        
        
        System.out.println(vector[i]);
        
        
    }
    
    
    }
}
