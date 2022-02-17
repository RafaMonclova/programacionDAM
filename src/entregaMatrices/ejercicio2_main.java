//EJERCICIO 2 -- MAIN
//RAFAEL MONCLOVA SUANO
package entregaMatrices;
import java.util.*;
    
public class ejercicio2_main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    ejercicio2 miArray = new ejercicio2(5);    
        
    System.out.println("1. Reemplazar cadena");
    System.out.println("2. Eliminar cadena");    
    System.out.println("3. Mostrar array"); 
    System.out.println("0. SALIR");  
        
    int opcion;
    do{
        
        System.out.println("Introduzca una opción: ");  
        opcion = sc.nextInt();
        
        switch(opcion){
            
            case 1:
                System.out.println("1. Reemplazar cadena");
                
                System.out.println("Introduce la posición: ");
                int posReemplazo = sc.nextInt();
                System.out.println("Introduce la nueva cadena: ");
                String cadenaReemplazo = sc.nextLine();
                
                miArray.reemplazar(posReemplazo, cadenaReemplazo);
                break;
            case 2:
                System.out.println("2. Eliminar cadena"); 
                
                System.out.println("Introduce la posición: ");
                int posEliminar = sc.nextInt();
                
                miArray.eliminar(posEliminar);
                break;
            case 3:
                System.out.println("3. Mostrar array"); 
                miArray.mostrar();
                break;
            case 0:
                System.out.println("SALIR"); 
                break;
            default:
                System.out.println("Elige una opción válida(1-3)"); 
                break;
            
        }
         
        
    }while(opcion != 0);
    
    
    
    
    
    }
    
}
