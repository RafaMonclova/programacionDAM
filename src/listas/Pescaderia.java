
package listas;
import java.util.*;

public class Pescaderia {
    public static void main(String[] args){
        
    Queue<String> cola = new LinkedList<>();  
    int tiempoTotal=0;
        
    int cantidadPersonas = (int)(Math.random()*10+5);
    
        
    for(int i = 0; i < cantidadPersonas;i++){
        
        String persona = "Persona"+i;
        cola.add(persona);
        
    }    
         
    for(int i = 0; i < cantidadPersonas;i++){    
        System.out.println("Atendiendo a: "+cola.poll()+" :----"+i+" cola"+cola.toString());
        
        int tiempo = (int)(Math.random()*6+5);
        
        System.out.println(tiempo + " minutos de cola");
        
        
        for(int j = 0; j < tiempo;j++){
            
            System.out.println(++tiempoTotal+"    "+(j+1));
            double porcentaje = Math.random();
            
            if(porcentaje <= 0.1){
                cantidadPersonas++;
                String persona = "Persona"+(cantidadPersonas);
                cola.offer(persona);
                System.out.println("Llega "+persona);          
            }
              
        }
        
        
        
    }
 
                 
    
    }
}
