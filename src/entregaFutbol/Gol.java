
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
    
    
    
}
