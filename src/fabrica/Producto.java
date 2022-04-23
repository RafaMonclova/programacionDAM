
package fabrica;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Producto {

    Scanner sc = new Scanner(System.in);
private String nombre;
private int serie;
private double precio;

public Producto(){
    nombre = "";
    serie = generar();
    precio = 0.0;
}

public Producto(String nombre, double precio){
    this.nombre = nombre;
    serie = generar();
    this.precio = precio;
    
}

public int generar(){
    int serie = (int)(Math.random()*99999)+1;
    return serie;
}

public String getNombre(){
    return nombre;
}

public int getSerie(){
    return serie;
}

public void setSerie(int serie) {
    this.serie = serie;
}

public double getPrecio(){
    return precio;
}   

public void setNombre(String nombre){
    Pattern pat = Pattern.compile("[a-zA-Z]*");
    Matcher mat = pat.matcher(nombre);
    
    if(mat.matches()){
        this.nombre = nombre;
    }
    else{
        System.out.println("El nombre es inválido, vuelva a introducirlo");
        nombre = sc.nextLine();
        setNombre(nombre);
    }
    
       
}

public void setPrecio(double precio){
    this.precio = precio;
}

public void pedirNombre(){
    
    System.out.println("Introduzca el nombre del producto");
    String nombre = sc.nextLine();
    Pattern pat = Pattern.compile("[a-zA-Z]*");
    Matcher mat = pat.matcher(nombre);
    
    if(mat.matches()){
        this.nombre = nombre;
    }
    else{
        System.out.println("Nombre inválido, no puede contener números ni símbolos");
    }
    
        
    
}

public void pedirPrecio(){
    
    double precio = sc.nextDouble();
    this.precio = precio;
}


public void resumen(){
    
    System.out.println("INFORME DE PRODUCTO");
    System.out.println("-----------------------");
    System.out.println("NOMBRE: "+getNombre());
    System.out.println("SERIE: "+getSerie());
    System.out.println("PRECIO: "+getPrecio());
    System.out.println("-----------------------");
    
}


public boolean iguales(Producto producto){
    
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
