
package listas;
import java.util.*;

public class Movimiento {

private int numPasos;
private String direccion;

Movimiento(){
    numPasos = 0;
    direccion = "";
}

Movimiento(int numPasos, String direccion){
    this.numPasos = numPasos;
    this.direccion = direccion;
}

public int getNumPasos() {
    return numPasos;
}

public String getDireccion() {
    return direccion;
}

public void setNumPasos(int numPasos) {
    this.numPasos = numPasos;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

void mostrarRecorrido(){
    
    System.out.println(getNumPasos() + "," + getDireccion());
    
}



String devolverInversa(){
    
    if (direccion.equals("Izquierda")){
	return  "Derecha";
    }else if (direccion.equals("Derecha")){
	return "Izquierda";
    }else if (direccion.equals("Arriba")){
	return "Abajo";
    }else{
        return "Arriba";
	}
    }

    
}
