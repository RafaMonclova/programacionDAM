
package javaapplication1;
import java.util.*;

public class repeticiones5 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);    
    System.out.println("Introduce numero");
    int num = sc.nextInt();
    
    System.out.println("Introduce la potencia deseada");
    int potencia = sc.nextInt();
    int resultado =1;    
    
    
    for (int i=0;i < potencia;i++){
        
        resultado= resultado*num;
        System.out.println(resultado);
    }      
    }
}
