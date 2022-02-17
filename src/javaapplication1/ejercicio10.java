
package javaapplication1;

import java.util.Scanner;
public class ejercicio10 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce num 1");
    int num1=sc.nextInt();
    System.out.println("Introduce num 2");
    int num2=sc.nextInt();
    System.out.println("Indica la operacion:1 para sumar 2 restar 3 dividir 4 multiplicar");
    int operacion=sc.nextInt();
    switch (operacion) {
        
        case 1:
            System.out.println("La solucion es: "+ (num1+num2));
            break;
        
        case 2:
            System.out.println("La solucion es: "+ (num1-num2));
            break;
            
        case 3:
            System.out.println("La solucion es: "+ (num1/num2));
            break;
            
        case 4:
            System.out.println("La solucion es: "+ (num1*num2));
            break;    
        
        default:
            System.out.println("ERROR404 Opcion no valida");
        
    }
    
    }
}
