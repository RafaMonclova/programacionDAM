
package javaapplication1;
import java.util.*;

public class repeticiones7 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número");
    int num1 = sc.nextInt();
    System.out.println("Introduce otro número");
    int num2 = sc.nextInt();
        
    while (num1==num2){
        
        System.out.println("La pareja introducida es: "+ num1 + " " + num2);
        
        System.out.println("Vuelva a introducir un número");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número");
        num2 = sc.nextInt();
        
        
    }    
        System.out.println("SALIR");
        
    }
}
