package videoclub;
import java.util.ArrayList;
import java.util.List;


public class Cliente {

    private String nombre;
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlquiler(Alquiler arg) {
        alquileres.add(arg);
    }

    public String getNombre() {
        return nombre;
    }

    public String extracto() {
        double importeTotal = 0;
        int puntosAlquilerFrecuente = 0;
        String resultado = "Alguileres de " + getNombre() + "\n";

        for (Alquiler each: alquileres) {
            double importe = 0;
            
            /* --SWITCH-- 
            Cambiamos el switch por el metodo precio(), que calcula el precio dependiendo de los
            dias alquilados y el tipo de pelicula*/
            
            importe = each.getPelicula().precio(each.getDiasAlquilada());

            // Añade los puntos de alquiler, dependiendo del tipo de película, el método realiza el calculo
            puntosAlquilerFrecuente = each.getPelicula().puntosAlquilerFrecuente(each.getDiasAlquilada());
            // add bonus for a two day new release rental
            

            // show figures for this rental
            resultado += "\t" + each.getPelicula().getTitulo() + "\t" + String.valueOf(importe) + "\n";
            importeTotal += importe;
        }

        // add footer lines
        resultado += "La cantidad adeudada es " + String.valueOf(importeTotal) + "\n";
        resultado += "Has ganado " + String.valueOf(puntosAlquilerFrecuente) + " puntos por alquiler frecuente";

        return resultado;
    }
    
    
    
}