
package listas;
import java.util.*;

public class Dino {
  
private String nombre;
private double peso;
private int añosExtinto;

Dino(String nombre, double peso, int añosExtinto){
    this.nombre = nombre;
    this.peso = peso;
    this.añosExtinto = añosExtinto;
}



    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getAñosExtinto() {
        return añosExtinto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAñosExtinto(int añosExtinto) {
        this.añosExtinto = añosExtinto;
    }
 
void mostrarDatos(){
    
    System.out.println("NOMBRE: "+getNombre());
    System.out.println("PESO: "+getPeso());
    System.out.println("AÑOS QUE LLEVA EXTINTO: "+getAñosExtinto());
    
}


}
