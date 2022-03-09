/*
Crearemos
una clase Salto con:


String Nombre saltador (solo guardamos el
nombre no el objeto saltador)


Int distancia


Int  CompareTo: compara los saltos por distancia
(a mayor distancia mejor salto).
 */
package saltos;

/**
 *
 * @author robertruhe
 */
public class Salto implements Comparable<Salto> {
    private String Nombre;
    private int Distancia;
   
    public Salto(String Nombre, int Distancia){
        this.Nombre = Nombre;
        this.Distancia = Distancia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }
   
    @Override
    public String toString(){
        return Nombre + Distancia;
       
    }
   
    @Override
    public int compareTo(Salto salto){
        return salto.Distancia- this.Distancia ;
    }
}
