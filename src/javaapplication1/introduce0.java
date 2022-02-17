
package javaapplication1;
import java.util.*;

public class introduce0 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in); 
    int num = 1;  
    int errores = 0;
    int total=0;
    do {
        System.out.println("introduce numeros");
        num = sc.nextInt();
        errores++;
        total += num;
    }
    while (num != 0);
    System.out.println("Enhorabuena! Has introducido: "+ errores);
    System.out.println("La media es: "+ total/errores);
}
}