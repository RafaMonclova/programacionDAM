
package listas;
import java.util.*;

public class Recorrido {
    
    Stack<Movimiento> camino = new Stack<>();
    
    void setCamino(Movimiento unMovimiento){
        camino.push(unMovimiento);
    }
    
    Stack<Movimiento> getCamino(){
        return camino;
    }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    
    Recorrido miRecorrido = new Recorrido();         
    miRecorrido.setCamino(new Movimiento(5, "Izquierda"));
    miRecorrido.setCamino(new Movimiento(5, "Izquierda"));
    miRecorrido.setCamino(new Movimiento(5, "Izquierda"));
    miRecorrido.setCamino(new Movimiento(5, "Izquierda"));
    
    while(!miRecorrido.getCamino().isEmpty()){
        Movimiento movActual = miRecorrido.getCamino().pop();
        System.out.println(movActual.getNumPasos()+","+
                movActual.devolverInversa());
    }
    
    
        
    }
}
