/*
3 Crea una clase Libro con atributos título, autor, fecha de edición y isbn 
crea sus métodos get set y en un programa instancia 3 libros diferentes

 */
package clases;
import java.util.*;

public class Libro {
    String Autor = "";
    String tituloLibro = "";
    String FechaDeEdicion = "";
    String ISBN = "";
    
    void setAutor(String nuevoAutor){
        Autor = nuevoAutor;
    }
    void setTitulo(String nuevoTitulo){
        tituloLibro = nuevoTitulo;
    }
    void setFechaDeEdicion(String nuevaFecha){
        FechaDeEdicion= nuevaFecha;
    }
    void setISBN(String nuevoISBN){
        ISBN = nuevoISBN;
    }
    void getAutor(){
        System.out.println(Autor);
    }
    void getTitulo(){
        System.out.println(tituloLibro);
    }
    void getFechaDeEdicion(){
        System.out.println(FechaDeEdicion);
    }
    void getISBN(){
        System.out.println(ISBN);
    }

    public static void main(String[] args){
       Libro libro1 = new Libro();
       Libro libro2 = new Libro();
       Libro libro3 = new Libro();
       
       libro1.setAutor("Shakespire");
       libro1.setFechaDeEdicion("21/09/1800");
       libro1.setISBN("1111");
       libro1.setTitulo("Blanca Nieves");
       libro2.setAutor("rafa");
       libro2.setFechaDeEdicion("12/90/0081");
       libro2.setISBN("0000");
       libro2.setTitulo("Dulce Navidad");
       libro3.setAutor("AuronPlay");
       libro3.setFechaDeEdicion("30/01/2019");
       libro3.setISBN("1298");
       libro3.setTitulo("Como Dalas me arruinó la vida");
       
       libro1.getAutor();
       
        
        
        
    }
}
