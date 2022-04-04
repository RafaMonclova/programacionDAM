package correccionExamen2Ismael;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author ismae
 */
public class Cartelera {
    //Pelicula(String título, String director, int duración, List<String> actores) {
    
    public static void main(String[] args) {
    String [] p1Actores=  {"Tom Hanks", "Tom Sizemore", "Edward Burns", "Matt Damon", "Barry Pepper", "Giovanni Ribisi", "Adam Goldberg", "Jeremy Davies", "Vin Diesel"};
    Pelicula p1 = new Pelicula("Salvar al soldado Ryan","Steven Spielberg", 170, Arrays.asList(p1Actores) );
 
    String [] p2Actores={"Leonardo DiCaprio", "Tom Hanks", "Christopher Walken", "Amy Adams", "Nathalie Baye", "Martin Sheen"};
    Pelicula p2 = new Pelicula("Atrápame si puedes","Steven Spielberg", 140, Arrays.asList(p2Actores) );
    
    String [] p3Actores={"Tom Hanks", "Catherine Zeta-Jones", "Stanley Tucci", "Chi McBride", "Diego Luna"};
    Pelicula p3 = new Pelicula("La terminal","Steven Spielberg", 128, Arrays.asList(p3Actores) );
    
    String [] p4Actores={"Paul Walker", "Vin Diesel", "Michelle Rodriguez"};
    Pelicula p4 = new Pelicula("A todo gas 4","Justin Lin", 109, Arrays.asList(p4Actores) );
    
    String [] p5Actores={"Chris Pine", "Zachary Quinto", "Karl Urban", "Simon Pegg", "Zoe Saldana"};
    Pelicula p5 = new Pelicula("Star Trek: Más allá","Justin Lin", 126, Arrays.asList(p5Actores) );
    
      
    String [] p6Actores={"Roy Scheider", "Robert Shaw", "Richard Dreyfuss"};
    Pelicula p6 = new Pelicula("Tiburón","Steven Spielberg", 106, Arrays.asList(p6Actores) );
    
     String [] p7Actores={"Leonardo DiCaprio", "Armie Hammer", "Naomi Watts"};
    Pelicula p7 = new Pelicula("J. Edgar","Clint Eastwood", 136, Arrays.asList(p7Actores) );
    
   
     String [] p8Actores={"Morgan Freeman", "Matt Damon", "Tony Kgoroge"};
    Pelicula p8 = new Pelicula("Invictus","Clint Eastwood", 134, Arrays.asList(p8Actores) );
    
 
    //vistas 1  7  4 
    //Visionado(Pelicula peliculaVista, int tiempo)
    
    //ha visto 3 películas 
    Visionado v1 = new Visionado(p1,p1.getDuración());  //Ryan
    Visionado v2 = new Visionado(p7,p7.getDuración());  //J. Edgar
    Visionado v3 = new Visionado(p5,10);//Star Trek está solo vió 10 minutos no le gustó
    
    
    Recomendada.registrarVisionada(v1);
    Recomendada.registrarVisionada(v2);
    Recomendada.registrarVisionada(v3);
    
    
    //creamos la listas de las películas no vistas para ordenarlas
    Recomendada r1=new Recomendada(p2);  
    Recomendada r2 = new Recomendada(p3);
    Recomendada r3 = new Recomendada(p4);
    Recomendada r4 = new Recomendada(p6);
    Recomendada r5 = new Recomendada(p8);
    List <Recomendada> NoVistas= new ArrayList();
    NoVistas.add(r1);
    NoVistas.add(r2);
    NoVistas.add(r3);
    NoVistas.add(r4);
    NoVistas.add(r5);
    
    

    
     Collections.sort(NoVistas); 
     
     
    
    System.out.println("Películas ya vistas");
    Recomendada.mostrarVistas();
    
    
    System.out.println("Películas no vistas ordenadas por puntuación");
  
    System.out.println(NoVistas);


  //r1.añadirVista(v1);
  

       }
}
