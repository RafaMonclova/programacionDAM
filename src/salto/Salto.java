
package salto;

/**
 *
 * @author rafa
 */
public class Salto implements Comparable<Salto>{
    
    
    private String nombre;
    private int distancia;
    
    public Salto(String nombre){
        this.nombre = nombre;
    }

    public Salto(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    

    @Override
    public int compareTo(Salto o) {
        return o.distancia - this.distancia;
    }

    @Override
    public String toString() {
        return "Salto{" + "nombre=" + nombre + ", distancia=" + distancia + '}';
    }
    
    
    
    
}
