
package entregaFutbol;

/**
 *
 * @author alumno
 */
public class Gol {
    
    private String nombreEquipo;
    private String nombreJugador;
    private int minuto;
    
    public Gol(){
        nombreEquipo = "";
        nombreJugador = "";
        minuto = 0;
    }

    public Gol(String nombreEquipo, String nombreJugador, int minuto) {
        this.nombreEquipo = nombreEquipo;
        this.nombreJugador = nombreJugador;
        this.minuto = minuto;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    public String toString(){
        
        return "EQUIPO: "+nombreEquipo+", JUGADOR: "+nombreJugador+", MINUTO: "+minuto;
        
    }
    
    
    
}
