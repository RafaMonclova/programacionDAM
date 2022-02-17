
package arrays;
import java.util.*;

public class actividad2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int vector[] = new int[5];
    int sumaPares=0;
    
        
    for(int i=0;i<vector.length;i++){
        
        System.out.println("Introduce vector numero "+(i+1));
        vector[i] = sc.nextInt();
    }    
    
    for(int i=0;i<vector.length;i++){ 
        
        System.out.println("El resultado del "+(i+1)+" por 2 es: "+(vector[i]*2));
    }
    
    for(int i=0;i<vector.length;i++){
        
        if(vector[i]%2==0){
            sumaPares = sumaPares + vector[i];
                
        }
    }    
        
    System.out.println("La suma de los numero pares es: "+sumaPares);    
        
        
    }
}
