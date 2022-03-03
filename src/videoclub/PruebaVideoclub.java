package videoclub;

public class PruebaVideoclub {

    public static void main(String[] args) {
        Pelicula pelicula1 = new Infantil("Madagascar");
        Alquiler alquiler1 = new Alquiler(pelicula1, 6); // 6 day rental
        Pelicula pelicula2 = new Estreno("Star Wars");
        Alquiler alquiler2 = new Alquiler(pelicula2, 2); // 2 day rental
        Pelicula pelicula3 = new Regular("Gone with the Wind");
        Alquiler alquiler3 = new Alquiler(pelicula3, 8); // 8 day rental
        Cliente cliente1 = new Cliente("David");
        cliente1.agregarAlquiler(alquiler1);
        cliente1.agregarAlquiler(alquiler2);
        cliente1.agregarAlquiler(alquiler3);
        String extracto = cliente1.extracto();
        System.out.println(extracto);
    }
}