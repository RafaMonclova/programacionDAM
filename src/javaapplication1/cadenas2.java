
package javaapplication1;
import java.util.*;

public class cadenas2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe una frase");
        String cadena= sc.nextLine();
        System.out.println("Escribe un numero");
        
        int num=sc.nextInt();
        if(num<=cadena.length() && num > 0){
            System.out.println("La posicion introducida corresponde a la letra: "+cadena.charAt(num-1));
        }else System.out.println("El numero introducido no es correcto");
    }
}
