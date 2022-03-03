package entregaFutbol;

import java.util.*;

/**
 *
 * @author Rafael Monclova Suano
 */
public class Partido {

    /**
     * Atributos
     */
    private String equipoLocal;
    private String equipoVisitante;
    private ArrayList<Gol> listaGoles;
    
    /**
     * Constructor por defecto
     */
    public Partido() {
        equipoLocal = "";
        equipoVisitante = "";
        listaGoles = new ArrayList();

    }

    /**
     * Constructor por parámetros. Recibe los equipos local y visitante
     * @param equipoLocal Equipo local
     * @param equipoVisitante Equipo visitante
     */
    public Partido(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        
    }

    /**
     * 
     * @return Devuelve un string con el equipo local
     */
    public String getEquipoLocal() {
        return equipoLocal;
    }

    /**
     * 
     * @param equipoLocal Recibe un string de equipo local y lo asigna al atributo
     */
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    /**
     * 
     * @return Devuelve un string con el equipo visitante
     */
    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    /**
     * 
     * @param equipoVisitante Recibe un string de equipo visitante y lo asigna al atributo
     */
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    /**
     * 
     * @return Devuelve una lista con objetos de la clase Gol
     */
    public ArrayList<Gol> getListaGoles() {
        return listaGoles;
    }

    /**
     * 
     * @param listaGoles Recibe una lista de objetos de la clase Gol y lo asigna al atributo
     */
    public void setListaGoles(ArrayList<Gol> listaGoles) {
        this.listaGoles = listaGoles;
    }
    
    /**
     * Imprime por pantalla el resultado de un partido, indicando los equipos que juegan, y una lista de goles
     */
    public void resultado() {

        System.out.println("LOCAL: " + equipoLocal);
        System.out.println("VISITANTE: " + equipoVisitante);
        System.out.println("GOLES: ");
        System.out.println("" + listaGoles);
    }
    
    /**
     * Rellena la lista de jugadores dependiendo del equipo
     * @param jugadores Recibe la lista de jugadores a rellenar
     * @param equipo Recibe el nombre del equipo
     */
    public void rellenarJugadores(ArrayList<String> jugadores, String equipo){
            
        switch(equipo){
            case "Madrid":
                for (int i = 0; i < 11; i++) {
                    jugadores.add("Mad"+i);
                }          
            break;
            case "Barca":
                for (int i = 0; i < 11; i++) {
                    jugadores.add("Bar"+i);
                }    
            break;
            case "Betis":
                for (int i = 0; i < 11; i++) {
                    jugadores.add("Bet"+i);
                }     
            break;
            case "Sevilla":
                for (int i = 0; i < 11; i++) {
                    jugadores.add("Sev"+i);
                }   
            break;    
        }
        
        
    }
    
    /**
     * Simula que se ha jugado el partido. Se crean una lista de goles vacía y un número de goles aleatorio en cada partido. 
     * Por probabilidad, se asignará equipoLocal o equipoVisitante como equipoGoleador, se rellena la lista de jugadores con el método "rellenarJugadores()" y se crea un gol con un jugador
     * y minuto aleatorios. Por último, se establece la lista de goles al atributo "listaGoles" del partido.
     */
    public void juegaPartido(){
        
        ArrayList<Gol> goles = new ArrayList();
        
        int numGoles = (int) ((Math.random() * 19) + 1);
        int contGoles = 0;
        for (int i = 0; i < numGoles; i++) {
            
            ArrayList<String> jugadores = new ArrayList();
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = getEquipoLocal();
                rellenarJugadores(jugadores,equipoGoleador); 
                goles.add(new Gol(equipoGoleador, jugadores.get(jugAleatorio), minAleatorio));
                
                
            }
            if(porcentaje >= 6){
                equipoGoleador = getEquipoVisitante();
                rellenarJugadores(jugadores,equipoGoleador); 
                goles.add(new Gol(equipoGoleador, jugadores.get(jugAleatorio), minAleatorio));
                
            }
               
            
        }
        setListaGoles(goles);
        
        
    }
     
    /**
     * Imprime por pantalla el sumatorio de goles de los equipos que juegan en cada partido
     */
    public void ranking(){
        int golesMadrid = 0;
        int golesBarca = 0;
        int golesBetis = 0;
        int golesSevilla = 0;
        
        for(int i = 0;i<getListaGoles().size();i++){
            
            if(getListaGoles().get(i).getNombreEquipo().equals("Madrid")){
                golesMadrid++;
            }
            if(getListaGoles().get(i).getNombreEquipo().equals("Barca")){
                golesBarca++;
            }
            if(getListaGoles().get(i).getNombreEquipo().equals("Betis")){
                golesBetis++;
            }
            if(getListaGoles().get(i).getNombreEquipo().equals("Sevilla")){
                golesSevilla++;
            }
                            
        }
        if(equipoLocal.equals("Madrid") || equipoVisitante.equals("Madrid"))
            System.out.println("MADRID: "+golesMadrid+" goles.");
        if(equipoLocal.equals("Barca") || equipoVisitante.equals("Barca"))
            System.out.println("BARCA: "+golesBarca+" goles.");
        if(equipoLocal.equals("Betis") || equipoVisitante.equals("Betis"))
            System.out.println("BETIS: "+golesBetis+" goles.");
        if(equipoLocal.equals("Sevilla") || equipoVisitante.equals("Sevilla"))
            System.out.println("SEVILLA: "+golesSevilla+" goles.");
        
        
    }
    
    

    public static void main(String[] args) {
            
        //Se crea una lista de partidos vacía, y se añaden por código los 12 partidos con los nombres de los equipos
        ArrayList<Partido> liga = new ArrayList();
        Partido p1 = new Partido("Madrid", "Barca");
        Partido p2 = new Partido("Barca", "Madrid");
        Partido p3 = new Partido("Betis", "Sevilla");
        Partido p4 = new Partido("Sevilla", "Betis");
        Partido p5 = new Partido("Madrid", "Betis");
        Partido p6 = new Partido("Betis", "Madrid");
        Partido p7 = new Partido("Barca", "Sevilla");
        Partido p8 = new Partido("Sevilla", "Barca");
        Partido p9 = new Partido("Barca", "Betis");
        Partido p10 = new Partido("Betis", "Barca");
        Partido p11 = new Partido("Madrid", "Sevilla");
        Partido p12 = new Partido("Sevilla", "Madrid");
          
        //Se añaden los partidos creados a la lista
        liga.add(p1);
        liga.add(p2);
        liga.add(p3);
        liga.add(p4);
        liga.add(p5);
        liga.add(p6);
        liga.add(p7);
        liga.add(p8);
        liga.add(p9);
        liga.add(p10);
        liga.add(p11);
        liga.add(p12);
        
        //Se simula que se jueguen todos los partidos de la lista
        for(Partido p : liga){
            p.juegaPartido();
        }   
        
        //Se imprime el resultado de cada partido
        for(Partido p : liga){
            p.resultado();
        }

        //Se imprime el ranking, mostrando cuántos goles marca cada equipo. La variable idPartido se usa para imprimir el identificador de cada partido a la hora de mostrarlos
        int idPartido = 1;
        for(Partido p : liga){
            System.out.println("============================");
            System.out.println("Partido "+idPartido);
            p.ranking();
            System.out.println("============================");
            idPartido++;
        }
           

    }

}
