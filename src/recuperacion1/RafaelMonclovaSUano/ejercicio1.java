/*
RAFAEL MONCLOVA SUANO
 */
package recuperacion1.RafaelMonclovaSUano;
import java.util.*;

public class ejercicio1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Introduce cadena 1: ");
    String cadena1 = sc.nextLine();
    System.out.println("Introduce cadena 2: ");
    String cadena2 = sc.nextLine();
    
    double num1 = Double.parseDouble(cadena1);
    double num2 = Double.parseDouble(cadena2);
    
    double producto = num1*num2;
    producto += 0.5;
    
    int productoEntero = (int)producto;
    System.out.println(productoEntero);

    }
}
