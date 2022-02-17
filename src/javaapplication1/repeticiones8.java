
package javaapplication1;
import java.util.*;
        
public class repeticiones8 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int suma = 0;
    int contador = 0;
    
    do{
        
        System.out.println("Introduce un número");
        num = sc.nextInt();
        suma = suma+num;
        contador++;
        
    }
    while (num < 0 || contador < 10);   
        System.out.println("Has introducido "+ contador + " números");
        System.out.println("La suma de los introducidos es: "+ suma);
        
    }
}
