
package javaapplication1;
import java.util.Scanner;

public class ejercicio11 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int dia, mes, ano;
    System.out.println("Introduce dia");
    dia=sc.nextInt();
    System.out.println("Introduce mes");
    mes=sc.nextInt();
    System.out.println("Introduce año");
    ano=sc.nextInt();
    
    System.out.println("Fecha:" + dia + "/" + mes + "/" + ano);
    if (dia > 30) {
        
        System.out.println("La fecha es INVALIDA");  
    }
    
    else {
        if (mes > 12) {
            System.out.println("La fecha es INVALIDA");
        }
        
        else {
            System.out.println("La fecha es VALIDA");
        }
    }
    
    }
}
