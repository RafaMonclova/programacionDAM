
package javaapplication1;
import java.util.*;
public class repeticiones2_4 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);    
    int contadorSuspensos=0;    
    System.out.println("Introduce notas:");        
    for (int i = 0; i<5;i++){
        double nota = sc.nextDouble();        
        if (nota < 5){    
            contadorSuspensos++; 
        }
    }  
    if (contadorSuspensos > 0){       
        System.out.println("Hay alumnos suspensos");           
    }
    else {
        System.out.println("No hay alumnos suspensos");  
    }
    //System.out.println("En total hay: "+contadorSuspensos + " alumnos suspensos");       
    }
}
