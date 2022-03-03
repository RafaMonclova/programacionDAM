
package videoclub;

/**
 *
 * @author alumno
 */
public class Estreno extends Pelicula{
    
    public Estreno(String titulo){
        super(titulo);
    }
    
    @Override
    public double precio(int diasAlquilado){
        double importe = 0;
        importe += diasAlquilado * 3;
        return importe;    
    }
    
    //Reescribe el metodo si es Estreno
    @Override
    public int puntosAlquilerFrecuente(int diasAlquilado){
        int puntosAlquilerFrecuente = 0;
        if(diasAlquilado > 1){
            puntosAlquilerFrecuente++;
        }
        return puntosAlquilerFrecuente;
    }
}
