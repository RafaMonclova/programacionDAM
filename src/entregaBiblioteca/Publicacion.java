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
abstract public class Publicacion {
    
    protected String numRegistro;
    protected String titulo;
    protected ArrayList<Autor> listaAutores;
    protected String genero;
    protected Fecha fechaPublicacion;


    public Publicacion(String numRegistro, String titulo, ArrayList<Autor> listaAutores, Fecha fechaPublicacion, String genero) {
        this.numRegistro = numRegistro;
        this.titulo = titulo;   
        this.listaAutores = listaAutores;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
    abstract public boolean buscaPalabra(String palabra);


    @Override
    public String toString() {
        return "Publicacion{" + "numRegistro=" + numRegistro + ", titulo=" + titulo + ", autor=" + listaAutores + ", genero=" + genero + ", fechaPublicacion=" + fechaPublicacion + '}';
    }
    
    
    
}
