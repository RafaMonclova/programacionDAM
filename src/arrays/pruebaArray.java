
package arrays;
import java.util.*;

public class pruebaArray {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce cuántas notas se van a introducir: ");
    int tamaño = sc.nextInt();
    int [] notasAlumnos = new int[tamaño];
        
    for(int i = 0; i<notasAlumnos.length;i++){
        
        //System.out.println("Introduce la nota "+i);
        //notasAlumnos[i] = sc.nextInt();
        notasAlumnos[i] = (int)(Math.random()*10); //INTRODUCE LAS NOTAS ALEATORIAMENTE
        
    }    
        
    for(int i = 0; i<notasAlumnos.length;i++){
        
        System.out.println("La nota "+i+" es: "+notasAlumnos[i]);
        
    }     
       
    
    
    
    }



    
}
