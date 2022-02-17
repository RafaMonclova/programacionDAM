
package javaapplication1;

import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce el dia:");
    int dia=sc.nextInt();
    
    System.out.println("Introduce el mes:");
    int mes=sc.nextInt();
    
    System.out.println("Introduce el año:");
    int año=sc.nextInt();
    
    
    System.out.println("La fecha es "+ dia + "/" + mes + "/" + año);
    
    if (dia > 30 && mes < 12) {
        System.out.println("El dia siguiente es: "+"1/"+(mes+1)+"/"+año);
    }
    
    else {
        System.out.println("mañana es: "+(dia+1)+"/"+mes+"/"+año);
    }
    if (mes > 11 && dia > 30) {
        System.out.println("El dia siguiente es: "+"1/"+"1/"+(año+1));
    }
    
    else {
        System.out.println("Tenga una buena tarde");
    }
} 
}