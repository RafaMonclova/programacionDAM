
package javaapplication1;
import java.util.*;

public class sanfermines {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int velocidad=0;
    int velocidadMayor=Integer.MIN_VALUE;
    
    System.out.println("Introduce numero de toros");
    int numToros1 = sc.nextInt();
    
    for (int i = 1;i<=numToros1;i++){
        
        System.out.println("Introduce velocidad "+i);
        velocidad = sc.nextInt();
        if (velocidad > velocidadMayor){
            velocidadMayor=velocidad;
        }
        
    }
    
    System.out.println("La velocidad más alta es: "+velocidadMayor);

    }
    
}
 