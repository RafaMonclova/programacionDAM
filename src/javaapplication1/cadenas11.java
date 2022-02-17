
package javaapplication1;
import java.util.*;

public class cadenas11 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
    
    System.out.println("Introduce una cadena");
    String cadena = sc.nextLine();
    
    int contadorA=0;
    int contadorE=0;    
    int contadorI=0;    
    int contadorO=0;    
    int contadorU=0;   
    int contadorVocales=0;    
    
    for(int i = 0;i < cadena.length();i++){
        
        if (   cadena.charAt(i)=='a'   ){
            contadorA++;
        }
        if (   cadena.charAt(i)=='e'   ){
            contadorE++;
        }
        if (   cadena.charAt(i)=='i'   ){
            contadorI++;
        }
        if (   cadena.charAt(i)=='o'   ){
            contadorO++;
        }
        if (   cadena.charAt(i)=='u'   ){
            contadorU++;
        }
            
    }
    
    contadorVocales = contadorA + contadorE+ contadorI + contadorO + contadorU;
    System.out.println("A :"+contadorA);
    System.out.println("E :"+contadorE);
    System.out.println("I :"+contadorI);
    System.out.println("O :"+contadorO);
    System.out.println("U :"+contadorU);
    
    }
}
