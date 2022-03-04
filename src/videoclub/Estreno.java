
package videoclub;

/**
 *
 * @author alumno
 */
public class Estreno extends Pelicula{
    
    public Estreno(String titulo){
        super(titulo);
    }
    
    //Reescribe el método precio() si es Estreno
    @Override
    public double precio(int diasAlquilado){
        double importe = 0;
        importe += diasAlquilado * 3;
        return importe;    
    }
    
    //Reescribe el metodo puntosAlquilerFrecuente si es Estreno, sumando 2 puntos extras
    @Override
    public int puntosAlquilerFrecuente(int diasAlquilado){
        int puntosAlquilerFrecuente = 0;
        if(diasAlquilado > 1){
            puntosAlquilerFrecuente = puntosAlquilerFrecuente +2;
        }
        return puntosAlquilerFrecuente;
    }
}
