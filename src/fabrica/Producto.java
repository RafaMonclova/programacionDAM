
package fabrica;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Producto {

    Scanner sc = new Scanner(System.in);
String nombre;
int serie;
double precio;

Producto(){
    nombre = "a";
    serie = generar();
    precio = 0.0;
}

Producto(String nuevoNombre, int nuevaSerie, double nuevoPrecio){
    nombre = nuevoNombre;
    serie = generar();
    precio = nuevoPrecio;
    
}

int generar(){
    int serie = (int)Math.random()*99999+1;
    return serie;
}

String getNombre(){
    return nombre;
}

int getSerie(){
    return serie;
}

double getPrecio(){
    return precio;
}   

void setNombre(String nuevoNombre){
     
    nombre = nuevoNombre;
       
}

void setPrecio(double nuevoPrecio){
    precio = nuevoPrecio;
}

void pedirNombre(){
    
    System.out.println("Introduzca el nombre del producto");
    String nuevoNombre = sc.nextLine();
    Pattern pat = Pattern.compile("[a-zA-Z]");
    Matcher mat = pat.matcher(nuevoNombre);
    
    if(mat.matches()){
        nombre = nuevoNombre;
    }
    else{
        System.out.println("Nombre inválido, no puede contener números ni símbolos");
    }
    
        
    
}

void pedirPrecio(){
    
    double nuevoPrecio = sc.nextDouble();
    precio = nuevoPrecio;
}


void resumen(){
    
    
    System.out.println("NOMBRE: "+getNombre());
    System.out.println("SERIE: "+getSerie());
    System.out.println("PRECIO: "+getPrecio());
    
}


boolean iguales(Producto producto){
    
    if(!(producto.getNombre().equals(nombre))){
        return false;
    }
    else{
        if(!(producto.getSerie() == serie)){
            return false;
        }
        else{
            return true;
        }
    }
    
}






}
