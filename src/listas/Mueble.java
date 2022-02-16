
package listas;
import java.util.*;

public class Mueble {

String nombre;   
String marca;
double precio;


Mueble(){
    nombre = " ";
    marca = " ";
    precio = 0.0;
    
}

Mueble(String nombre,String marca, double precio){
    this.nombre = nombre;
    this.marca = marca;
    this.precio = precio;
    
}

String getNombre() {
    return nombre;
}

String getMarca() {
    return marca;
}

double getPrecio() {
    return precio;
}

void setNombre(String nombre) {
    this.nombre = nombre;
}

void setMarca(String marca) {
    this.marca = marca;
}

void setPrecio(double precio) {
    this.precio = precio;
}

void mostrar(){
    
    System.out.println("NOMBRE: "+getNombre());
    System.out.println("MARCA: "+getMarca());
    System.out.println("PRECIO:"+getPrecio());
    
}



}
