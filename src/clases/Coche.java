/*
Realizar una aplicación con una sóla clase Coche.
 
Atributos:
 - String Color. Inicialmente será "blanco".
 - int Velocidad. La velocidad inicial será 0.
 
Métodos:
 - acelerar(): aumentará en 10 la velocidad.
 - desacelerar(): disminuirá en 10 la velocidad.
 - frenar(): detendrá totalmente el coche (pondrá a 0 la velocidad)
 - pintar(String nuevoColor): cambiará el color del coche. nombre alternativo setColor
 - informe(): mostrará por pantalla un mensaje como este...
                    "El coche verde va a 70 Km/h"
 - main(...): usando los métodos anteriores...
         . Pintar el coche de azul.
         . Poner el coche a 50 Km/h.
         . Mostrar informe.
         . Desacelerar el coche a 20 Km/h.
         . Mostrar informe.
         . Pintar el coche de verde.
         . Detener completamente el vehículo (sin usar desacelerar)
         . Mostrar informe.

 */
package clases;
import java.util.*;
public class Coche {
    
    String color="Blanco";
    int velocidad = 0;
    
    void acelerar(int turbo){
        velocidad += turbo;
    }
    void desacelerar(int desturbo){
        velocidad -= desturbo;
    }
    void frenar(){
        velocidad = 0;
    }
    void pintar(String newColor){
        color = newColor;
    }
    void informe(){
        System.out.println("El coche "+ color +" va a "+velocidad+" km/h");
    }
    
    public static void main(String[] args){
        
       
        Coche miCoche = new Coche();
        miCoche.pintar("azul");
        miCoche.acelerar(50);
        miCoche.informe();
        miCoche.desacelerar(20);
        miCoche.informe();
        miCoche.pintar("verde");
        miCoche.frenar();
        miCoche.informe();

 

    }
}