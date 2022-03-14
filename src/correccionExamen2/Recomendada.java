
package correccionExamen2;

import java.util.ArrayList;

/**
 *
 * @author Rafael Monclova Suano
 */
public class Recomendada implements Comparable<Recomendada>{
    
    static ArrayList<Visionado> visionados = new ArrayList();
    private Pelicula pelicula;

    public Recomendada(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public static ArrayList<Visionado> getVisionados() {
        return visionados;
    }

    public static void setVisionados(ArrayList<Visionado> visionados) {
        Recomendada.visionados = visionados;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    public int puntuacion(){
        int puntos = 0;
        for(Visionado v : visionados){
            
            int signo = 1;
            if(v.haGustado()){
                signo = 1;
            }
            else
                signo = -1;
            
            //mismo director
            if(pelicula.getDirector().equals(v.getPeliculaVista().getDirector())){
                puntos += 3*signo;
            }
            
            //actores comunes
            for(String actor : pelicula.getActores()){
                if(v.getPeliculaVista().getActores().contains(actor)){
                    puntos += 1*signo;
                }
            }
                     

        }   
      
       return puntos; 
    }
    
    public static void registrarVisionada(Visionado v){
        
        
        if(visionados.contains(v) && v.getTiempo() > v.getPeliculaVista().getDuración()){
            int posicion = visionados.indexOf(v);//
            visionados.set(posicion, v);
                  
        }
        else{
            visionados.add(v);
        }
        
    }
    
    public static void mostrar(){
        
        for(Visionado v : visionados){
            
            System.out.println(v);
           
            
        }
        
    }
    
    public void borrar(String actor){
        
        for(Visionado v : visionados){
            
            if(v.getPeliculaVista().getActores().contains(actor)){
                visionados.remove(v);
            }
            
        }
        
    }

    @Override
    public int compareTo(Recomendada r) {
        return r.puntuacion() - this.puntuacion();
    }

    @Override
    public String toString() {
        return "pelicula=" + pelicula + "puntuacion "+puntuacion();
    }
    
    
}
