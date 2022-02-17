
package javaapplication1;
import java.util.*;

public class cadenas5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Escribe algo");
    String cadena = sc.nextLine();
    
    System.out.println("Cuántas veces quieres mostrarlo?");
    int veces = sc.nextInt();
    int i;
    for(i=0;i<veces;i++){
        //String repetido = cadena.repeat(veces);
        if(i%2==0){   
        System.out.println(cadena.toUpperCase());
        }else {
            System.out.println(cadena.toLowerCase());
        }
    }    
    }
}
