
package javaapplication1;
import java.util.*;

public class ejercicio12_2 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    int mes;
    int año;
    
    System.out.println("Introduce mes");
    mes=sc.nextInt();
    System.out.println("Introduce un año");
    año=sc.nextInt();
        
    switch (mes) {
        
        case 4: 
        case 6:
        case 9:
        case 11:
            System.out.println("El mes tiene 30 dias");
        break; 
        
        case 1:   
        case 3:
        case 5:
        case 7:    
        case 8:
        case 10:
        case 12:
            System.out.println("El mes tiene 31 dias");
        break; 
        
        case 2:
            if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
            System.out.println("El mes tiene 29 dias");
            else
                System.out.println("El mes tiene 28 dias");
        break; 
        
        default:
            System.out.println("Introduce un mes válido");
    }
        
   
    }
}
