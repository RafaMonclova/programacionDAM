
package listas;
import java.util.*;

public class ejemploConjunto {
    public static void main(String[] args){
        
    Set<String> conjuntoAmigos = new HashSet();    
        
    conjuntoAmigos.add("rafa");
    conjuntoAmigos.add("alberto");
    conjuntoAmigos.add("ana");
    conjuntoAmigos.add("paula");
    conjuntoAmigos.add("pepe");
    
    System.out.println(conjuntoAmigos);

    List<String> listaAmigos = new ArrayList(conjuntoAmigos);
    
    System.out.println(listaAmigos);
    }
}
