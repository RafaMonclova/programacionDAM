
package fabrica;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */

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

/**
 * Constructor de producto
 * @param nombre Recibe el nombre del producto, comprobando que sea válido
 * @param precio Recibe el precio del producto, comprobando que sea válido
 */
public Producto(String nombre, double precio){
    setNombre(nombre); //Los métodos setNombre y setPrecio hacen la comprobación
    serie = generar();
    setPrecio(precio);
    
}

/**
 * Genera un valor aleatorio entre 1 y 100000 y lo devuelve
 * @return Devuelve el valor aleatorio generado
 */
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

/**
 * Establece el nombre del producto, comprobando que sea una cadena de letras de la A a la Z. Si no es válido, pide volver a introducirlo por teclado hasta que sea válido
 * @param nombre Recibe el nombre del producto
 */
public void setNombre(String nombre){
    Pattern pat = Pattern.compile("[a-zA-Z]*");
    Matcher mat = pat.matcher(nombre);
    
    if(mat.matches()){
        this.nombre = nombre;
    }
    else{
        System.out.println("Nombre inválido, no puede contener números, símbolos ni ñ");
        nombre = sc.nextLine();
        setNombre(nombre);
    }
    
       
}

/**
 * Establece el precio del producto, comprobando que no sea un precio negativo. Si es negativo, lo vuelve a pedir por teclado hasta que sea válido
 * @param precio 
 */
public void setPrecio(double precio){
    
    if(precio > 0){
        this.precio = precio;
    }
    else{
        System.out.println("El precio no puede ser negativo, vuelva a introducirlo");
        precio = sc.nextDouble();
        setPrecio(precio);
    }
    
}

/**
 * Pide el nombre del producto por teclado, realizando la comprobación del mismo llamando a setNombre
 */
public void pedirNombre(){
    
    System.out.println("Introduzca el nombre del producto");
    String nombre = sc.nextLine();
    setNombre(nombre);
           
    
}

/**
 * Pide el precio del producto por teclado, realizando la comprobación del mismo llamando a setPrecio
 */
public void pedirPrecio(){
    
    double precio = sc.nextDouble();
    setPrecio(precio);
    
    
}

/**
 * Imprime por pantalla los datos del producto
 */
public void resumen(){
    
    System.out.println("INFORME DE PRODUCTO");
    System.out.println("-----------------------");
    System.out.println("NOMBRE: "+getNombre());
    System.out.println("SERIE: "+getSerie());
    System.out.println("PRECIO: "+getPrecio());
    System.out.println("-----------------------");
    
}

/**
 * Compara el producto del objeto con un producto dado por parámetros. Primero compara los nombres, si son distintos compara las series
 * @param producto Recibe un producto por parámetros
 * @return Devuelve true si son iguales y false si no lo son. 
 */
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
