

package javaapplication1;
import java.util.*;

public class repeticiones10 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);    
    System.out.println("Introduce un número");
    int num = sc.nextInt();
    int cont=0;
    int total = 0;
       
    while (cont<=num){      
    if (cont%2==0){       
        
        total=total+cont;
        System.out.println(cont);
    }
    cont++;

    } 
 
    System.out.println("La suma de los pares es: "+total); 
      
    }


}
