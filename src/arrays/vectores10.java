
package arrays;
import java.util.*;

public class vectores10 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
        
    System.out.println("Introduce el número de alumnos: ");
    int contadorAlumnos = sc.nextInt();     
        
    double notas[] = new double[contadorAlumnos];    
        
    double media = 0;
    double notaMayor = Integer.MIN_VALUE;
    double notaMenor = Integer.MAX_VALUE;
        
        
    for(int i = 0;i < notas.length;i++){
        System.out.println("Introduce nota "+(i+1));
        notas[i] = sc.nextDouble();
   
        
    } 
    
    for(int i = 0;i < notas.length;i++){
       
        if(notas[i]>notaMayor){
            notaMayor = notas[i];
        }
        if(notas[i]<notaMenor){
            notaMenor = notas[i];
        }
        
        media = (media + notas[i])/contadorAlumnos;
   
        
    }
    
    System.out.println("La nota más alta es: "+notaMayor);
    System.out.println("La nota más baja es: "+notaMenor);
    System.out.println("La media es: "+media);
    
    }
}
