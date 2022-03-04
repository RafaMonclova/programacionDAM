package videoclub;

public class Pelicula {

    /* --CIRUGÍA DE ESCOPETA--
    public static final int INFANTIL = 2;
    public static final int ESTRENO = 1;
    public static final int REGULAR = 0;
    */
    //Es mejor crear una clase hija que extienda de Pelicula, para cada tipo de película

    private String titulo;

    public Pelicula(String titulo ) {
        this.titulo = titulo;
             
    }
   
 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    //Creamos un metodo para calcular el precio de la película, el cual se reescribirá en cada clase hija
    public double precio(int diasAlquilado){
        double importe = 0;
        return importe;
    }
    
    //--LONG METHOD--
    //Este metodo suma los puntos de alquiler y los devuelve, para cualquier película suma 1 punto
    //Lo calculamos en un método aparte, fuera de extracto()
    public int puntosAlquilerFrecuente(int diasAlquilado){
        int puntosAlquilerFrecuente = 0;
        if(diasAlquilado > 1){
            puntosAlquilerFrecuente++;
        }
        return puntosAlquilerFrecuente;
    }
    

}