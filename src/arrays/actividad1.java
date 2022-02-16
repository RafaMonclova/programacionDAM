
package arrays;
import java.util.*;

public class actividad1 {
    public static void main (String[] args){    
    Scanner sc = new Scanner(System.in);
    
    int mayor=Integer.MIN_VALUE;
    int menor=Integer.MAX_VALUE;
    int suma=0;    
        
    System.out.println("Introduce el tamaño: ");
    int tamaño = sc.nextInt();
    int vector[] = new int[tamaño];    
        
    for(int i=0;i<vector.length;i++){
        System.out.println("Introduce vector numero "+(i+1));
        vector[i] = sc.nextInt();
        if(vector[i]>mayor){
            mayor = vector[i];
        }
        if(vector[i]<menor){
            menor = vector[i];
        }
        
        suma = suma + vector[i];
    }    
     
    System.out.println("La suma de los vectores es: "+suma);
    
    
    }
}
