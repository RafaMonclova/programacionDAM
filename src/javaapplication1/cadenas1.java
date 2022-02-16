
package javaapplication1;
import java.util.*;

public class cadenas1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe algo");
        String cadena = sc.nextLine();
        
        for(int i=0;i<(cadena.length());i++){
          System.out.println(cadena.charAt(i));
        }
    }
}
