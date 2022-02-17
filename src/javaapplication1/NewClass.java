
package javaapplication1;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        System.out.println("Ejemplo: ");
        Scanner sc = new Scanner(System.in);
        char opcion=sc.next().charAt(0);
        
        switch (opcion) {
            case 's':
                System.out.println("opcion si");
                break;
            
                
            case 'n':  
                System.out.println("opcion nop");
                break;
            
            case 'c':  
                System.out.println("opcion continuar");
                break;
                
                
            default:  
                System.out.println("opcion NO VALIDA");
                break;
                    
        }
        
    }
}
