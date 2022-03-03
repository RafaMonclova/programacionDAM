
package videoclub;

/**
 *
 * @author alumno
 */
public class Infantil extends Pelicula{
    
    public Infantil(String titulo){
        super(titulo);
    }
    
    @Override
    public double precio(int diasAlquilado){
        double importe = 0;
        importe += 1.5;
        if (diasAlquilado > 3)
            importe += (diasAlquilado - 3) * 1.5;
        return importe;            
    }
    
    
}
