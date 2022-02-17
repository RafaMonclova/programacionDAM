
package javaapplication1;
import java.util.*;

public class cadenas20 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la cadena");
    String cadena = sc.nextLine();
    System.out.println("Introduce en cuántas partes quieres dividir la cadena");
    int partes = sc.nextInt();
    int numCaracteres = cadena.length()/partes;    
    String nuevaCadena = "";
    
    
    for(int i = 0; i<cadena.length();i+=numCaracteres){
        
        if(cadena.length()%partes==0){
            
            nuevaCadena += cadena.substring(i,numCaracteres+i)+" ";
            
        }else{
            System.out.println("NO SE PUEDE DIVIDIR EN "+partes+ " PARTES IGUALES");
            break;  
        }
        
        
        
    }    
        
    System.out.println(nuevaCadena);
    }

}
