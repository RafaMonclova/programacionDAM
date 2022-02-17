
package compararObjetos;
import java.util.*;

public class OrdenarJugador {
    public static void main(String[] args){
    List<Jugador> lista = new ArrayList<>();    
        
        
    lista.add(new Jugador("Casillas",Jugador.PORTERO,3));
    lista.add(new Jugador("Navas",Jugador.DELANTERO,10));
    lista.add(new Jugador("Xabi",Jugador.CENTROCAMPISTA,4));
    lista.add(new Jugador("Villa",Jugador.DELANTERO,15));

    Collections.sort(lista);
    
    
    for(Jugador jugadorActual : lista){
        System.out.println(jugadorActual);
    }
    
    
    //lista.forEach((n) -> System.out.println(n));
    
    }
}
