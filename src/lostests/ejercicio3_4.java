/*
 El siguiente código nos ha fallado cuando a es igual a 0, 
utiliza el depurador para ver el instante del fallo y plantea una solución mejorando el código.

 */
package lostests;
import java.util.*;

public class ejercicio3_4 {       
    public static void main(String[] args) {
    double a = 0, b = 0, c = 0, sol1 = 0, sol2 = 0;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Introduce el coeficiente de x²");//a=0 error
    a = scan.nextDouble();
    
    System.out.println("Introduce el coeficiente de x");
    b = scan.nextDouble();
    
    System.out.println("Introduce el termino independiente");
    c = scan.nextDouble(); 
    
    if(a!=0){//si a!=0, realizará la ecuación de segundo grado
        sol1 = (-1*b + Math.sqrt(b*b - 4*a*c))/(2*a);
    
        sol2 = (-1*b - Math.sqrt(b*b - 4*a*c))/(2*a);
        
        System.out.println("Las soluciones son: " + sol1 + "y" + sol2);
    }else{//si a=0, se hará una ecuación de primer grado
        sol1=(-c/b);
        System.out.println("Las solucion es: " + sol1);
    }
     
    }
    
}
