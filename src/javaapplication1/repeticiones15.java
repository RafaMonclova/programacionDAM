
package javaapplication1;
import java.util.*;

public class repeticiones15 {
    public static void main (String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        
        System.out.println("Introduce otro numero");
        int num2 = sc.nextInt();
        int menor=0;
        int mayor=0;
        if (num1<num2){
            mayor= num2;
            menor=num1;
        }
        else {
            mayor=num1;
            menor=num2;
        }
        System.out.println("el menor es "+menor);
    for(int i=menor;i<=mayor;i++){
     System.out.println(i);
    }
    System.out.println("Hay un total de: "+(mayor-menor)+" entre ambos");
    }
}
