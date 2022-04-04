package correccionExamen2Ismael;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ismae
 */
public class Pelicula {
  private String título, director;
  private int duración;
  private List <String>  actores;

    public Pelicula(String título, String director, int duración, List<String> actores) {
        this.título = título;
        this.director = director;
        this.duración = duración;
        this.actores = actores;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public List<String> getActores() {
        return actores;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }
    public void añadirActor(String nuevoActor){
        actores.add(nuevoActor);        
    }
  @Override
    public String toString(){
        return título+ "duración "+ duración+" ";
    }
    /*falta método borrarActor*/
    
  
}
