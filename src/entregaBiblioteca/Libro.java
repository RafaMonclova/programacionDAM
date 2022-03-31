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
public class Libro extends Publicacion{
    
    protected long ISBN;
    protected double coste;
    protected String descripcion;

    public Libro(String numRegistro, String titulo, ArrayList<Autor> listaAutores, Fecha fechaPublicacion, String genero, long ISBN, double coste, String descripcion) {
        super(numRegistro, titulo, listaAutores, fechaPublicacion, genero);
        this.ISBN = ISBN;
        this.coste = coste;
        this.descripcion = descripcion;
    }

    @Override
    public boolean buscaPalabra(String palabra) {
        boolean aparece = false;
        if(titulo.contains(palabra) || listaAutores.contains(palabra)){
            
            aparece = true;
            
        }
        else if(descripcion.contains(palabra)){
            aparece = true;
        }
        
        return aparece;
        
    }

    @Override
    public String toString() {
        return "[Libro]"+" " + "["+numRegistro+"]" + titulo + listaAutores + ", " + fechaPublicacion + ", " + generos(genero) +", ISBN: "+ ISBN + ", Precio: "+coste + ". Descripción: "+descripcion;
    }
    
    
    
}
