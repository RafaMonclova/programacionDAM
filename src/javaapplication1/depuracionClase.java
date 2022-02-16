
package javaapplication1;
import java.util.*;

public class depuracionClase {
    public static void main(String[] args){
        
    double a = 0, b = 0, c = 0, sol1 = 0, sol2 = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Introduce el coeficiente de x²");//a=0 error
    
    a = scan.nextDouble();
    
    System.out.println("Introduce el coeficiente de x");
    
    b = scan.nextDouble();
    
    System.out.println("Introduce el termino independiente");
    
    c = scan.nextDouble(); 
    if(a!=0){
        sol1 = (-1*b + Math.sqrt(b*b - 4*a*c))/(2*a);
    
        sol2 = (-1*b - Math.sqrt(b*b - 4*a*c))/(2*a);
        
        System.out.println("Las soluciones son: " + sol1 + "y" + sol2);
    }else{
        sol1=(-c/b);
        System.out.println("Las solucion es: " + sol1);
    }
    
    }
}
