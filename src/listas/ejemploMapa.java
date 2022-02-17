
package listas;
import java.util.*;

public class ejemploMapa {
    public static void main(String[] args){
        
    Map<Integer,String> mapa = new HashMap<>();    
        
    mapa.put(1,"Casillas");    
    mapa.put(2,"Casilla"); 
    mapa.put(3,"Casi"); 
    mapa.put(4,"llas"); 
    
        
    Iterator it = mapa.keySet().iterator();
    while(it.hasNext()){
        Integer key  = (Integer) it.next();
        System.out.println("Clave: "+key + ", valor: "+mapa.get(key));
    }


    
    }
}
