//RAFAEL MONCLOVA SUANO 1ºDAM
package examen_ejercicio1;
import java.util.*;

public class examen_ejercicio2 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la cadena");
    String cadena = sc.nextLine();
    System.out.println("Introduce el número de caracteres por línea");
    int numero = sc.nextInt();  
    String linea = "";
    
    for(int i = 0; i <= cadena.length();i++){
            
            if(cadena.charAt(i) == ' '){                
                linea = cadena.substring(0,' ');
                cadena = cadena.substring (numero, cadena.length()-1);
                }     
            linea = cadena.substring(0,numero);
            cadena = cadena.substring (numero, cadena.length()-1);
            
            System.out.println(linea); 

            
        }    
    }
}
