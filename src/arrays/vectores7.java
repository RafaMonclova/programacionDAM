
package arrays;
import java.util.*;

public class vectores7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    int vector[] = new int[20];
    int contadorA = 0;    
    for(int i = 0; i < vector.length;i++){
        System.out.println("Introduce la letra "+(i+1));
        vector[i] = sc.next().charAt(0);
        if(vector[i] == 'a'){  
            contadorA++;    
        }
        
        
    }   
    
    System.out.println("Se han encontrado: "+contadorA+ " A's");
    System.out.println("LETRA A aparece en: ");
    for(int i = 0;i < vector.length;i++){
        
       if(vector[i] == 'a'){
            System.out.println("Posicion "+(i+1));
                    
        } 
                
    }

    
        
    }
}
