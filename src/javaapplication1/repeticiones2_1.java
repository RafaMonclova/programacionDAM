
package javaapplication1;
import java.util.*;

public class repeticiones2_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);    
        double salario;
        double sumaTotal=0;
        int contador1000=0;
        System.out.println("Introduce los salarios");     
        for (int i=0;i<10;i++){
            salario = sc.nextDouble(); 
            sumaTotal=sumaTotal+salario;   
            System.out.println("---------------------------");
            if (salario>1000){
                contador1000++;    
            } 
        }    
     System.out.println("El total de salarios es: "+sumaTotal + " €");
     System.out.println("Los que superan 1000€ de salario mensual son: "+contador1000 );
    }
}
