
package javaapplication1;
import java.util.*;

public class radar {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    while(sc.hasNext()){
    System.out.println("Introduce la distancia:");
    double distancia = sc.nextInt();
        
    System.out.println("Introduce la velocidad maxima permitida:");
    double velMaxPermitida = sc.nextInt();    
        
    System.out.println("Introduce los segundos:");
    double segundos = sc.nextInt();    
        
    double velocidad = ((distancia/1000)/(segundos/3600));    
    System.out.println(velocidad);
    
    
    double porciento = ((velMaxPermitida*20)/100);
    if (velocidad > (velMaxPermitida)){
        
        System.out.println();
        
        
    }
    
    
    }
    }
}
