//EJERCICIO 2 -- MÉTODOS
//RAFAEL MONCLOVA SUANO
package entregaMatrices;
import java.util.*;

public class ejercicio2 {
    
String arrayCadenas[];
 
//Constructor por parámetros para darle el tamaño al array
ejercicio2(int tamaño){
    Scanner sc = new Scanner(System.in);
    arrayCadenas = new String[tamaño];
    
    for(int i = 0;i<arrayCadenas.length;i++){
        System.out.println("Introduce cadena para la posición" + (i+1));
        arrayCadenas[i] = sc.nextLine();
    }
    
}    
 
//Reemplaza la cadena de la posición indicada por la cadena introducida por parámetro
void reemplazar(int posicion, String cadena){
    
    arrayCadenas[posicion] = cadena;
    
}

//Elimina la cadena de la posición indicada
void eliminar(int posicion){
    
    arrayCadenas[posicion] = "";
    
}

//Muestra por pantalla el array
void mostrar(){
    
    for(int i = 0;i<arrayCadenas.length;i++){
        
        System.out.println(arrayCadenas[i]);
        
    }
    
}
    
}
