
package javaapplication1;
import java.util.*;

public class letraNumero {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);   
        System.out.println("digame un numero");
        int num = sc.nextInt();
        System.out.println("ahora digame una letra");
        char letra = sc.next().charAt(0);
        
        
        for (int cont=0; num>cont;cont++){
            
            System.out.println(letra);
            
            
        }
        
        
    }
}
