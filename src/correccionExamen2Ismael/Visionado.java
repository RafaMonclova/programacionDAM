package correccionExamen2Ismael;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ismae
 */
public class Visionado {
   protected Pelicula peliculaVista;
    private int tiempo;

    public Visionado(Pelicula peliculaVista, int tiempo) {
        this.peliculaVista = peliculaVista;
        this.tiempo = tiempo;
    }

    public Pelicula getPeliculaVista() {
        return peliculaVista;
    }

    public void setPeliculaVista(Pelicula peliculaVista) {
        this.peliculaVista = peliculaVista;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public boolean haGustado(){
        if (tiempo>=peliculaVista.getDuración())
            return true;
        else
            return false;
    }
    public String  toString(){
        return peliculaVista+" se ha visto: " +tiempo;
        
    }
    
}
