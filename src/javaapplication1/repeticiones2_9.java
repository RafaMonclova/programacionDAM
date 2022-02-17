
package javaapplication1;
import java.util.*;
public class repeticiones2_9 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número");
    int num = sc.nextInt();
    int digito = 0;
    if (num < 0){
        num = num*-1;
        System.out.println("Su numero se ha cambiado a positivo");
    }
    System.out.println("----------------------------------------------");
    while(num!=0){
        num = num/10;
        digito++;
    }
    System.out.println("El número tiene " + digito+ " dígitos");
    }
}
