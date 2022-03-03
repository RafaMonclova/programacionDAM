
package entregaFutbol;

/**
 *
 * @author Rafael Monclova Suano
 */
public class Gol {
    
    /**
     * Atributos
     */
    private String nombreEquipo;
    private String nombreJugador;
    private int minuto;
    
    /**
     * Constructor por defecto
     */
    public Gol(){
        nombreEquipo = "";
        nombreJugador = "";
        minuto = 0;
    }

    /**
     * Constructor por parámetros
     * @param nombreEquipo String con el nombre del equipo goleador
     * @param nombreJugador String con el nombre del jugador goleador
     * @param minuto Entero con el minuto donde se marca gol
     */
    public Gol(String nombreEquipo, String nombreJugador, int minuto) {
        this.nombreEquipo = nombreEquipo;
        this.nombreJugador = nombreJugador;
        this.minuto = minuto;
    }

    /**
     * 
     * @return Devuelve el nombre del equipo goleador
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * 
     * @param nombreEquipo Recibe el nombre del equipo goleador y lo asigna al atributo
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * 
     * @return Devuelve el nombre del jugador goleador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * 
     * @param nombreJugador Recibe el nombre del jugador goleador y lo asigna al atributo
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    /**
     * 
     * @return Devuelve el minuto donde se marca gol
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * 
     * @param minuto Recibe el minuto donde se marca gol y lo asigna al atributo
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    /**
     * 
     * @return Devuelve un string mostrando el equipo, jugador y minuto del gol
     */
    public String toString(){
        
        return "EQUIPO: "+nombreEquipo+", JUGADOR: "+nombreJugador+", MINUTO: "+minuto;
        
    }
    
    
    
}
