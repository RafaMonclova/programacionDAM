
package javaapplication1;
import java.util.*;

public class repeticiones2 {
    public static void main (String[] args){
    Scanner sc =  new Scanner(System.in);   
    System.out.println("Introduce un número");    
    int num1 = sc.nextInt();    
    System.out.println("Introduce otro número");    
    int num2 = sc.nextInt();  
    int resultado = 0;
    
    
    for (int contador = 0;contador<num2;contador++){
        
        resultado=num1+resultado;
        System.out.println(resultado);
    }
    
    
    }
}
