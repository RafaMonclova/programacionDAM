
package javaapplication1;
import java.util.Scanner;

public class contadorHasta0 {
    public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);   
    System.out.println("Introduce un número");
    int num = sc.nextInt();
    int cont=0;

    while (cont<=num){
        System.out.println(cont);
        cont++;
        
    }
    }
}
