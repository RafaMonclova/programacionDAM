
package arrays;
import java.util.*;

public class vectores11 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    int vector[] = new int[11];
    
    
    for(int i = 1;i<vector.length;i++){
        
        //NÚMEROS
        System.out.println("Introduce num "+i);
        int num = sc.nextInt();
        
        while(num <= 0){
           System.out.println("Numero inválido, debe ser POSITIVO");
           num = sc.nextInt();
        }
        
        //POSICIONES
        System.out.println("Introduce posicion "+i);
        int posicion = sc.nextInt();
        
        while(vector[posicion] !=-1){
            System.out.println("Posición ocupada, introduzca otra");
            posicion = sc.nextInt();
            
        }
        
        vector[posicion] = num;    
        
    }    
        
    //MOSTRAR ARRAY   
    for(int i = 1;i<vector.length;i++){
        
        System.out.println(vector[i]);
    }     
        
       
        
        
        
        
        
        
        
        
        
    }
}
