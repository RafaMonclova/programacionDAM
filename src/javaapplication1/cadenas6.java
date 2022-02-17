
package javaapplication1;
import java.util.*;

public class cadenas6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("digame la primera cadena");
    String nombre1 = sc.nextLine();
    System.out.println("digame la segunda cadena");
    String nombre2 = sc.nextLine();    
    int orden= nombre1.compareTo(nombre2);
    System.out.println("------------------------------------");
    if(orden>0){
        System.out.println(nombre2);
        System.out.println(nombre1);
        System.out.println("------------------------------------");
    }else{
        System.out.println(nombre1);
        System.out.println(nombre2);
        System.out.println("------------------------------------");
    }
        
    }
}
