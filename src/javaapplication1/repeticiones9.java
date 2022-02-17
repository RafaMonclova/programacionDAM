

package javaapplication1;
import java.util.*;

public class repeticiones9 {
    public static void main (String[] args){
    Scanner sc =  new Scanner(System.in);   
    System.out.println("Introduce un número");
    int num = sc.nextInt();
    System.out.println("Introduce de cuánto quiere el incremento");
    int incremento = sc.nextInt();
    int cont=0;

    while (cont<=num){
        System.out.println(cont);
        cont= cont+incremento;
        
    }



    }
}
