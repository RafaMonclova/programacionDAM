

package javaapplication1;
import java.util.*;

public class repeticiones11 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in); 
    int num;  
    System.out.println("Introduce numeros");

    num = sc.nextInt();

    while (num > 0){

        if (num > 10){
        System.out.println("INTRODUCE UN NÚMERO VÁLIDO, ENTRE 0 Y 10");

        }
        else{
        System.out.println("Introduce numeros");
        num = sc.nextInt();

        }
        
}


    
}
}
