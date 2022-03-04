
package vehiculoHerencia;

/**
 *
 * @author alumno
 */
abstract public class Vehiculo {
    
    protected String matricula;
    protected int duracionAlquiler;
    
    public Vehiculo(){
        matricula = "";
        duracionAlquiler = 0;
    }

    public Vehiculo(String matricula, int duracionAlquiler) {
        this.matricula = matricula;
        this.duracionAlquiler = duracionAlquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDuracionAlquiler() {
        return duracionAlquiler;
    }

    public void setDuracionAlquiler(int duracionAlquiler) {
        this.duracionAlquiler = duracionAlquiler;
    }
    
    abstract public double alquiler();
    abstract public void recibo();
    
    
}
