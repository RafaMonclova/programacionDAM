
package entregaFutbol;
import java.util.*;
/**
 *
 * @author alumno
 */
public class Partido {
 
    private String equipo1;
    private String equipo2;
    private ArrayList listaGoles;
    
    public Partido(){
        equipo1 = "";
        equipo2 = "";
        listaGoles = new ArrayList();
    }
    
    public Partido(String equipo1, String equipo2, ArrayList listaGoles){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.listaGoles = listaGoles;
        
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public ArrayList getListaGoles() {
        return listaGoles;
    }

    public void setListaGoles(ArrayList listaGoles) {
        this.listaGoles = listaGoles;
    }
    
    
    
    public static void main(String[] args){
       
       
       
       
        
       
       
        
    }
    
    
    
}
