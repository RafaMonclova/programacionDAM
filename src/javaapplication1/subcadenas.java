
package javaapplication1;
import java.util.*;
public class subcadenas {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int contador=0;
    int j=0;
    System.out.println("Digame una cadena");   
    String cadena = sc.nextLine();
    System.out.println("Digame una palabra");   
    String palabrota = sc.nextLine();
    for(int i=0;i<cadena.length();i++){
        char lectura = cadena.charAt(i);
        char lectura2 = palabrota.charAt(j);
        if(lectura==lectura2){
            j++;
            if(j%(palabrota.length())==0){
                contador++;
            }
        }else{
            j=0;
        } 
    }
    System.out.println("numero de veces que sale: "+contador);      
    }
}
