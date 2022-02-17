
package javaapplication1;
import java.util.*;

public class repeticiones16 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int contador=0;    
    int menor=Integer.MAX_VALUE;
    //int mayor=0;    
    char opcion = 's';    
    /*
    System.out.println("Introduzca un numero");
    int num = sc.nextInt();
  */ int num;
       do { 
        System.out.println("Introduzca un numero");
         num = sc.nextInt();
        if(num < menor){
                 menor=num;              
              }
        contador++;
        do{
            System.out.println("Desea introducir mas numeros? s/n");    
            opcion = sc.next().charAt(0);
        }while (!(opcion=='s' ||  opcion=='n')); //Las opciones deben ser 's' o 'n'
                 
    } while (opcion == 's');
       System.out.println("El menor es: "+menor); 
          
    }
}
