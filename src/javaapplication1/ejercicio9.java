
package javaapplication1;
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Dime tu nota: ");
        Scanner sc = new Scanner(System.in);
        double nota=sc.nextDouble();
        
        switch ((int)(nota)) {
            case 1:
               
            case 2:  
           
            case 3:  
              
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;    
            case 7:

            case 8:
                System.out.println("Notable");
                break;
            case 9:

            case 10:
                System.out.println("Sobresaliente");
                break;
                
            default:  
                System.out.println("opcion NO VALIDA");
                break;
                    
        }
        
    }
}
