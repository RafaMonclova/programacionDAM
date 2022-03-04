
package videoclub;

/**
 *
 * @author alumno
 */
public class Regular extends Pelicula{
    
    public Regular(String titulo){
        super(titulo);
    }
    
    //Reescribe el método si es Regular
    @Override
    public double precio(int diasAlquilado){
        double importe = 2;
            if (diasAlquilado > 2)
                importe += (diasAlquilado - 2) * 1.5;
        return importe;    
    }
    
}
