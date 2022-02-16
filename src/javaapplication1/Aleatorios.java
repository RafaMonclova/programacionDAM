
package javaapplication1;
import java.util.*;
/**
Escribe un programa que muestre 50 números enteros aleatorios entre 100 y 199
(ambos incluidos) separados por espacios. Muestra además, el máximo, el mínimo y la
media de esos números.
 */
public class Aleatorios {
    public static void main(String[] args){
        Random rnd = new Random(); 
        int num;
        int nummayor=Integer.MIN_VALUE;
        int media=0;
        int nummenor=Integer.MAX_VALUE;
        int i=0;
        for( i=0;i<50;i++){     
            num=rnd.nextInt(100)+100;
            System.out.println(" "+num);
            if(num>nummayor){//(nummayor<=num){
                nummayor=num;
            }
            if(nummenor>=num){
               nummenor=num;
            }
          media=num+media;
             }System.out.println("El número mayor es: "+nummayor+" y el número menor es: "+nummenor);
                System.out.println("La media es de: "+(media/i));
    }
}
