/*
RAFAEL MONCLOVA SUANO
 */
package recuperacion1.RafaelMonclovaSUano;
import java.util.*;

public class ejercicio6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce cadena 1: ");
    String cadena1 = sc.nextLine();
    System.out.println("Introduce cadena 2: ");
    String cadena2 = sc.nextLine();
    String cadena3=""; 
    int incremento1 = 0;
    int incremento2 = 0;
    /*
    for(int i = 0;i<cadena1.length();i++){
  
        if(cadena1.charAt(i)<cadena2.charAt(i)){
            cadena3 = cadena3+cadena1.charAt(i);
        }
        else{
            if(cadena2.charAt(i)<cadena1.charAt(i)){
                cadena3 = cadena3+cadena2.charAt(i);
            }
        }            
    } 
    */
    
    for(int i = 0;i < cadena1.length();i++){
        
        if(cadena1.charAt(i)<cadena2.charAt(i)){
                cadena3 = cadena3+cadena1.charAt(i); 
                
            }
        
            for(int j = 0;j<cadena2.length();j++){
            

            if(cadena2.charAt(j)<cadena1.charAt(i)){
                cadena3 = cadena3+cadena2.charAt(j);
    
            }
    
        }
   
        
    }
    
    System.out.println(cadena3); 
    
        
    }
}
