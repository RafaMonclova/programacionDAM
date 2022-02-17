
package javaapplication1;
import java.util.*;
/*Escribe un programa que pida el nombre y los dos apellidos de un usuario y genere su nombre de
usuario formado por la inicial de su nombre y las tres primeras letras de cada apellido (en
mayúsculas).*/
public class cadenas4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("NOMBRE:");
    String nombre = sc.nextLine();
    
    System.out.println("PRIMER APELLIDO:");
    String ape1 = sc.nextLine();
    
    System.out.println("SEGUNDO APELLIDO:");
    String ape2 = sc.nextLine();   
        
        
    System.out.println(nombre.charAt(0)+""+ape1.charAt(0)+""+ape1.charAt(1)+""+ape1.charAt(2)+
            ""+ape2.charAt(0)+""+ape2.charAt(1)+""+ape2.charAt(2)+"");    
        
        
    }
}
