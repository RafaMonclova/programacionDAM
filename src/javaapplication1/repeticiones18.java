
package javaapplication1;
import java.util.*;

public class repeticiones18 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca un importe: ");
    int importe = sc.nextInt();
    
    int b20=0;
    int b10=0;
    int b5=0;
    int b2=0;
    int b1=0;

    if(importe >= 20) {
            b20=importe / 20;
            importe= importe % 20;
    }
 
    if(importe >= 10) {
            b10=importe / 10;
            importe= importe % 10;
    }
 
    if(importe >= 5) {
            b5=importe / 5;
            importe= importe % 5;
    }
 
    if(importe >= 2) {
            b2=importe / 2;
            importe= importe % 2;
    }
    if(importe >= 1) {
            b1=importe / 1;
            importe= importe % 1;
    }

        System.out.println("Billetes de 20€ = "+b20);
        System.out.println("Billetes de 10€ = "+b10);
        System.out.println("Billetes de 5€ = "+b5);
        System.out.println("Monedas de 2€ = "+b2);
        System.out.println("Monedas de 1€ = "+b1);
       
    
    
    }
}
