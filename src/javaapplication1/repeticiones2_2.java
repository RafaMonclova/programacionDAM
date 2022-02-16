
package javaapplication1;
import java.util.*;

public class repeticiones2_2 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);    
    int mayor18=0; 
    int contadorAltos=0;
    int edadMedia=0;
    int edadTotal=0;
    int estaturaMedia=0;
    int estaturaTotal=0;   
    for(int i = 1;i<=5;i++){   
        System.out.println("Introduce edad");
        int edad = sc.nextInt();
        System.out.println("Introduce altura en cm");
        int altura = sc.nextInt();
        edadTotal=edadTotal+edad;
        edadMedia=edadTotal/i;
        
        estaturaTotal=estaturaTotal+altura;
        estaturaMedia=estaturaTotal/i;
        if(edad>=18){           
            mayor18++;       
        } 
        
        if (altura > 175){
        
            contadorAltos++;
        
    }
    }
    System.out.println("Media de edades: "+edadMedia);
    System.out.println("Media de altura: "+estaturaMedia);
    System.out.println("Mayores de 18 años: "+mayor18);  
    System.out.println("Mayores de 1.75m son: "+contadorAltos);
    }
}
