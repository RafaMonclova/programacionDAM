
package listas;
import java.util.*;

public class Ejercicio4 {
    
    ArrayList<String> lista;
    
    Ejercicio4(){
        lista = new ArrayList<>(); 
    }
    
    ArrayList<String> getLista(){
        return lista;
    }
    
    void reemplazar(int posicion1, int posicion2){
        
        String aux1 = lista.get(posicion1);
        String aux2 = lista.get(posicion2);
        lista.set(posicion2, aux1);
        lista.set(posicion1, aux2);
        
    }
    
    void reemplazar(String valor1, String valor2){
        
        int pos1 = 0;
        int pos2 = 0;
        
        for(int i = 0; i <lista.size();i++){
            
            if(lista.get(i).equals(valor1)){
                pos1 = i;
            }
            else if(lista.get(i).equals(valor2)){
                pos2 = i;
            }
            
        }
        
    }
    
    
    
    
    public static void main(String[] args){
        
    Ejercicio4 objetoLista = new Ejercicio4();
         
        
    objetoLista.getLista().add("cadena1");
    objetoLista.getLista().add("cadena2");
    objetoLista.getLista().add("cadena3");
    objetoLista.getLista().add("cadena4");
    
    objetoLista.reemplazar(0, 1);
    System.out.println(objetoLista.getLista());
        
    }
}
