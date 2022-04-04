package correccionExamen2Ismael;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ismae
 */
public class Recomendada implements Comparable <Recomendada>{
   static  List <Visionado>  vistas= new ArrayList();    
    
   private  Pelicula peliculaRecomendada;
    
      public Recomendada(Pelicula peliculaRecomendada) {
        this.peliculaRecomendada = peliculaRecomendada;
    }
    

    public static List<Visionado> getVistas() {
        return vistas;
    }

    public static void setVistas(List<Visionado> vistas) {
        Recomendada.vistas = vistas;
    }

    public Pelicula getPeliculaRecomendada() {
        return peliculaRecomendada;
    }

    public void setPeliculaRecomendada(Pelicula peliculaRecomendada) {
        this.peliculaRecomendada = peliculaRecomendada;
    }
    
   static  public  void registrarVisionada(Visionado nuevaVisionada){
        boolean sehabiaVisto=false;
        for (int i=0; i<vistas.size();i++){
            if (vistas.get(i).getPeliculaVista().getTítulo().equals(nuevaVisionada.getPeliculaVista().getTítulo())){
                sehabiaVisto=true;
                if (vistas.get(i).getTiempo()<nuevaVisionada.getTiempo())
                  vistas.get(i).setTiempo(nuevaVisionada.getTiempo());
                break;
            }
          
        }         
        if (!sehabiaVisto)
                vistas.add(nuevaVisionada);
    }
    public int  puntuación(){
        int resultado=0;
        
        for (Visionado v : vistas){
            int signo =1;
            if (v.haGustado()){
                signo=1;
            } else signo=-1;
            
            //si mismo director
            if (peliculaRecomendada.getDirector().equals(v.getPeliculaVista().getDirector())){
                resultado+=3*signo;
            }
            
            //número de actores
            ArrayList <String> actoresComunes;
                    
              
            actoresComunes = new ArrayList<String>();

       
                
            for (String a : peliculaRecomendada.getActores()) {actoresComunes.add(a);}
            actoresComunes.retainAll(v.getPeliculaVista().getActores());
            resultado+=actoresComunes.size()*signo;
           
        }
         return resultado;
    }
    @Override
    public String toString(){
        return "\n"+peliculaRecomendada+ "puntuación: "+ puntuación();    
    }
    @Override
    public int compareTo(Recomendada r2){
        return r2.puntuación()-this.puntuación();
    }
    public static  void mostrarVistas(){
         for (Visionado v : vistas){
             System.out.println(v);
         }
         
    
    }
    
    public static void borrarPorActor(String nombreActorBorrar){
         Iterator<Visionado> iter= vistas.iterator();
           while (iter.hasNext()) {
               
               Visionado actualVisionado=iter.next();
               if (actualVisionado.getPeliculaVista().getActores().contains(nombreActorBorrar)) {
                    iter.remove();
                }
            }
    }
    

  
    
    
}
