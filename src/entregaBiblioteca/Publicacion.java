/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregaBiblioteca;

import java.util.ArrayList;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
abstract public class Publicacion implements Comparable<Publicacion>{
    
    protected String numRegistro;
    protected String titulo;
    protected ArrayList<Autor> listaAutores;
    protected String genero;
    protected Fecha fechaPublicacion;


    public Publicacion(String numRegistro, String titulo, ArrayList<Autor> listaAutores, Fecha fechaPublicacion, String genero) {
        this.numRegistro = numRegistro;
        this.titulo = titulo;   
        this.listaAutores = listaAutores;
        this.genero = generos(genero);
        this.fechaPublicacion = fechaPublicacion;
    }
    
    /**
     * Método abstracto para buscar palabras en la publicación, se implementa dependiendo del tipo de publicación
     * @param palabra Recibe la palabra a buscar
     * @return Devuelve true si encuentra la palabra
     */
    abstract public boolean buscaPalabra(String palabra);

    /**
     * Asigna el nombre completo del género de la publicación recibiendo una letra
     * @param genero Recibe la letra del género
     * @return Devuelve una cadena con el género que le corresponde
     */
    public String generos(String genero){
        
        String salida = "";
        
        switch(genero){
            
            case "B":
                salida += "Ciencias biológicas";
                break;
            case "S":
                salida += "Ciencias de la salud y deporte";
                break;
            case "M":
                salida += "Matemáticas";
                break;
            case "T":
                salida += "Tecnología";
                break;
            case "H":
                salida += "Historia, cultura y sociedad";
                break;
            case "G":
                salida += "Ciencias de la tierra y el espacio";
                break;
            case "F":
                salida += "Física y química";
                break;
            case "A":
                salida += "Artes y oficios";
                break;
            case "I":
                salida += "Informática";
                break;
            
        }
        
        return salida;
        
    }
    
    //Las publicaciones se comparan por fecha de publicación
    @Override
    public int compareTo(Publicacion otra){
        return this.fechaPublicacion.compareTo(otra.fechaPublicacion);
    }

    @Override
    public String toString() {
        return "Publicacion{" + "numRegistro=" + numRegistro + ", titulo=" + titulo + ", autor=" + listaAutores + ", genero=" + genero + ", fechaPublicacion=" + fechaPublicacion + '}';
    }
    
    
    
}
