
package javaapplication1;
import java.util.*;
/**
Repite el ejercicio anterior, pero pidiendo el nombre de 3 personas.
 */
public class cadenas7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("digame la primera cadena");
    String nombre1 = sc.nextLine();
    System.out.println("digame la segunda cadena");
    String nombre2 = sc.nextLine();    
    System.out.println("digame la tercera cadena");
    String nombre3 = sc.nextLine();   
    
    int orden= nombre1.compareTo(nombre2);
    int orden2= nombre1.compareTo(nombre3);
    int orden3= nombre2.compareTo(nombre3);
    String menor = "";
    String medio = "";
    String mayor = "";
    System.out.println("------------------------------------");
    if(orden>0 && orden2>0){
         menor=nombre1;
        if(orden3>0){
             medio=nombre2;
             mayor=nombre3;
        }else{
             medio=nombre3;
             mayor=nombre2;
        }
    }
    if(orden3>0 && orden<0){
         menor=nombre2;
        if(orden2>0){
             medio=nombre1;
             mayor=nombre3;
        }else{
             medio=nombre3;
             mayor=nombre1;
        }
    }
    if(orden2<0){
         menor=nombre3;
        if(orden>0){
             medio=nombre1;
             mayor=nombre2;
        }else{
             medio=nombre2;
             mayor=nombre1;
        }
    }
    System.out.println("Mayor: "+mayor+" Medio: "+medio+" Menor: "+menor);
           
    }   
}
