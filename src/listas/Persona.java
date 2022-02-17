
package listas;
import java.util.*;

/**
 * 
 * @author Rafa
 * @version 1.0
 */
public class Persona {

private String id;
private String nombre;
private int edad;

//Crea la persona con los datos introducidos por parámetros
/**
 * 
 * @param id El identificador único de cada persona
 * @param nombre El nombre de la persona
 * @param edad La edad de la persona
 */
Persona(String id, String nombre, int edad){
    this.id = id;
    this.nombre = nombre;
    this.edad = edad;
}

/**
 * 
 * @return Devuelve el id de la persona
 */
public String getId() {
    return id;
}

/**
 * 
 * @return Devuelve el nombre de la persona
 */
public String getNombre() {
    return nombre;
}

/**
 * 
 * @return Devuelve la edad de la persona
 */
public int getEdad() {
    return edad;
}

/**
 * 
 * @param id El id a establecer a la persona
 */
public void setId(String id) {
    this.id = id;
}

/**
 * 
 * @param nombre El nombre a establecer de la persona
 */
public void setNombre(String nombre) {
    this.nombre = nombre;
}

/**
 * 
 * @param edad La edad a establecer de la persona
 */
public void setEdad(int edad) {
    this.edad = edad;
}


/**
 * 
 * Muestra los datos de la persona
 */
void mostrar(){
    
    System.out.println("ID: "+getId());
    System.out.println("NOMBRE: "+getNombre());
    System.out.println("EDAD:"+getEdad());
    
}
    
}
