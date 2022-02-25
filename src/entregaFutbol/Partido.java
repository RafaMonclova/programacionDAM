
package entregaFutbol;
import java.util.*;
/**
 *
 * @author alumno
 */
public class Partido {
 //array de 12 partidos
 //lista de goles(objetos clase Gol)
 
    
    
    private String equipoLocal;
    private String equipoVisitante;
    private ArrayList<Gol> listaGoles;
    
    
    public Partido(){
        equipoLocal = "";
        equipoVisitante = "";
        listaGoles = new ArrayList();
        
    }
    
    public Partido(String equipo1, String equipo2, ArrayList listaGoles){
        this.equipoLocal = equipo1;
        this.equipoVisitante = equipo2;
        listaGoles = new ArrayList();
        
    }

    public String getEquipo1() {
        return equipoLocal;
    }

    public void setEquipo1(String equipo1) {
        this.equipoLocal = equipo1;
    }

    public String getEquipo2() {
        return equipoVisitante;
    }

    public void setEquipo2(String equipo2) {
        this.equipoVisitante = equipo2;
    }

    public ArrayList<Gol> getListaGoles() {
        return listaGoles;
    }

    public void setListaGoles(ArrayList<Gol> listaGoles) {
        this.listaGoles = listaGoles;
    }
      
    
    public static void main(String[] args){
       
       
       Partido [] liga = new Partido[12];
       
        
       
       
        
    }
    
    
    
}
