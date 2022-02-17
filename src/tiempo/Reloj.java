
package tiempo;
import java.util.*;

public class Reloj {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Hora miHora = new Hora();
    
    System.out.println("1. Mostrar hora 12");
    System.out.println("2. Mostrar hora 24");
    System.out.println("3. Modificar hora");
    System.out.println("4. Modificar minuto");
    System.out.println("5. Modificar segundo");
    System.out.println("6. SALIR");
    
    
    
    int opcion;
    do{
        
      System.out.println("Introduzca una opción: ");  
      opcion = sc.nextInt();
      
      switch(opcion){
        
        case 1:
            System.out.println("1. Mostrar hora 12");
            miHora.mostrarHora12();
        break;
        
        case 2:
            System.out.println("2. Mostrar hora 24");
            miHora.mostrarHora24();
        break;
        
        case 3:
            System.out.println("3. Modificar hora");
            miHora.setHora(25);
        break;
        
        case 4:
            System.out.println("4. Modificar minuto");
            miHora.setMinuto(30);
        break;
        
        case 5:
            System.out.println("5. Modificar segundo");
            miHora.setSegundo(130);
        break;
        
        case 6:
            System.out.println("Hasta la próxima.");
        break;
        
        default:
            System.out.println("Opción inválida");
                    
    }  
        
        
    }while (opcion != 6);
    
     
        
    }
}
