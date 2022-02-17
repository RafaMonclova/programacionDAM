
package listas;
import java.util.*;

/**
 * 
 * @author Rafa
 * @version 1.0
 */

public class Cine {

//Atributo con la lista de personas.
   
Queue<Persona> cola;

//Constructor que inicia la cola vacía
/**
 * Crea una cola para el cine
 */
public Cine(){
    cola = new LinkedList<>();
}


/**
 * Genera personas aleatorias entre 0 y 50 para la cola 
 */
public void generarPersonas(){
    
    int tamañoCola = (int)(Math.random()*50);
    
    //Añade las personas generadas a la lista "cola"
    for(int i = 0;i<tamañoCola;i++){
        
        String id = "P-"+i;
        String nombre = ("Nombre"+i);
        int edad = (int)(Math.random()*60 + 5);
        
        Persona p = new Persona(id,nombre,edad);
        cola.add(p);
    }
        
    
}

/**
 * 
 * @param personaActual Recibe la persona a la que se va a cobrar la entrada
 * @return Devuelve el precio de la entrada, dependiendo de la edad
 */
public double precioPersonaActual(Persona personaActual){
     double precio=0;
        if(personaActual.getEdad() >=5 && personaActual.getEdad() <=10){
            precio = 1;
           
            
        }
        if(personaActual.getEdad() >=11 && personaActual.getEdad() <=17){
            precio = 2.5;
            
            
        }
        if(personaActual.getEdad() >=18){
            precio = 3.5;            
            
        }
        return precio;
}


/**
 * 
 * @return Devuelve el precio de la entrada del cliente e imprime el total recaudado
 * Elimina a cada cliente cuando se le cobra la entrada
 */
public double pago(){
    double totalPagos = 0;
    /*
    for(Persona personaActual: cola){
        
       totalPagos+=precioPersonaActual(personaActual);
        
        
    }
*/
    //Mientras la cola no esté vacía, cobramos y borramos de la cola
    while (!cola.isEmpty()){
        
       /*
        totalPagos+=precioPersonaActual(cola.peek());
       cola.remove();
*/
       //cola.poll devuelve y borra a la vez 
       totalPagos+=precioPersonaActual(cola.poll());
        
    }
    System.out.println("Dinero recaudado: "+totalPagos);
    //cola.removeAll(cola);
    
    return totalPagos;
 
}

/**
 * Muestra las personas de la cola
 */
public void mostrarCola(){
    
    for(Persona personaActual: cola){
        
        personaActual.mostrar();
        
    }
    
}

public static void main(String[] args){
    //Creamos el objeto
    Cine miCine = new Cine();
    
    //Generamos las personas y mostramos la cola
    miCine.generarPersonas();
    miCine.mostrarCola();
    
    //Efectuamos el pago y volvemos a mostrar la cola para comprobar que está vacía
    miCine.pago();
    System.out.println("Vaciando cola...");
    miCine.mostrarCola();
    
}
    
}
