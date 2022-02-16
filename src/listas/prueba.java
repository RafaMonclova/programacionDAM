
package listas;
import java.util.*;

public class prueba {
    public static void main(String[] args){
        
    
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Banana");
        lista.add("Berenjena");
        lista.add("Tomate");
        lista.add("Banana");
        lista.add("Banana");
        lista.add("Azulejos");
        lista.add("Queso");
        lista.add("Patatas");
        
        int contBanana = 0;
        
        for(String verdura: lista){
            
            if(lista.contains("Banana")){
                contBanana++;
                lista.remove("Banana");
            }
            
        }
        
        /*
        while(lista.contains("Banana")){
            contBanana++;
            lista.remove("Banana");
        }
*/
        System.out.println("Aparece la banana: "+contBanana+" veces.");
        System.out.println("Lista: "+lista);
        
    }
}
