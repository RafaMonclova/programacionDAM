
package listas;
import java.util.*;

public class Ejercicio3 {
    
    public static ArrayList<Integer> listaInterseccion (ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        
        ArrayList<Integer> listaInterseccion = new ArrayList<>();
        
        
        for(int i = 0; i < lista1.size();i++){
        if (lista2.contains(lista1.get(i))){//además en la segunda
                if(listaInterseccion.contains(lista1.get(i))==false) //si no lo habíamos introducido anteriormente
                    listaInterseccion.add(lista1.get(i));
                
              
            }
        }
        /*
        for (int num : lista1){
            if (lista2.contains(num)){//además en la segunda
                if(listaInterseccion.contains(num)==false) //si no lo habíamos introducido anteriormente
                    listaInterseccion.add(num);
                
              
            }
        }
        */
        
        return listaInterseccion;
        
    }
    
    public static ArrayList<Integer> listaUnion (ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        
        ArrayList<Integer> listaUnion = new ArrayList<>();
        
        /*
        for(int i = 0; i < lista1.size();i++){
            if (lista2.contains(lista1.get(i)) && lista1.contains(lista2.get(i))){
              listaUnion.add(lista1.get(i));
              listaUnion.add(lista2.get(i));
            }
        }
*/
        for (int num : lista1){
            if(listaUnion.contains(num)==false){
                
                listaUnion.add(num);
            }
        }
         for (int num : lista2){
            if(listaUnion.contains(num)==false){
                
                listaUnion.add(num);
            }
        }
        
        return listaUnion;
        
    }

    
    public static void main(String[] args){
        
    ArrayList<Integer> lista1 = new ArrayList<>();
    ArrayList<Integer> lista2 = new ArrayList<>();    
    
    for (int i = 0; i < 20; i++) {
            int aleatorio = (int) (Math.random() * 100);
            lista1.add( aleatorio);
            

    }
    System.out.println(lista1);

    for (int i = 0; i < 20; i++) {
         int aleatorio = (int) (Math.random() * 100);
          lista2.add( aleatorio);

        }
    System.out.println(lista2);
    
    
    System.out.println("INTERSECCION");
    System.out.println(listaInterseccion(lista1,lista2));
    System.out.println("------------------------------------");
    
    System.out.println("UNION");
    System.out.println(listaUnion(lista1,lista2));
    
    
    
     
        
    }
}
