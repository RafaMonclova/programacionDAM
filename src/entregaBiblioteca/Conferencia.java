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
public class Conferencia extends Publicacion{
    
    protected String nombre;
    protected String ubicacion;

    public Conferencia(String numRegistro, String titulo, ArrayList<Autor> listaAutores, Fecha fechaPublicacion, String genero,String nombre, String ubicacion) {
        super(numRegistro, titulo, listaAutores, fechaPublicacion, genero);
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    @Override
    public boolean buscaPalabra(String palabra) {
        boolean aparece = false;
        
        for (int i = 0; i < listaAutores.size(); i++) {
            if(titulo.contains(palabra) || listaAutores.get(i).getNombre().equals(palabra) || listaAutores.get(i).getApellidos().equals(palabra)){
            
            aparece = true;
            
        }
        else if(nombre.contains(palabra) || ubicacion.contains(palabra)){
            aparece = true;
        }
            
        }
        
        
        
        return aparece;
        
    }

    @Override
    public String toString() {
        return "[Conferencia]"+" " + "["+numRegistro+"]" + titulo + listaAutores + ", " + fechaPublicacion + ", " + genero + ", " + nombre + ", " + ubicacion;
    }
    
    
    
    
    
}
