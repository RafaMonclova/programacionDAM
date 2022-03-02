package entregaFutbol;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Partido {
    //array de 12 partidos
    //lista de goles(objetos clase Gol)

    private String equipoLocal;
    private String equipoVisitante;
    private ArrayList<Gol> listaGoles;

    public Partido() {
        equipoLocal = "";
        equipoVisitante = "";
        listaGoles = new ArrayList();

    }

    public Partido(String equipo1, String equipo2) {
        this.equipoLocal = equipo1;
        this.equipoVisitante = equipo2;
        

    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public ArrayList<Gol> getListaGoles() {
        return listaGoles;
    }

    public void setListaGoles(ArrayList<Gol> listaGoles) {
        this.listaGoles = listaGoles;
    }
    

    public void resultado() {

        System.out.println("LOCAL: " + equipoLocal);
        System.out.println("VISITANTE: " + equipoVisitante);
        System.out.println("GOLES: ");
        System.out.println("" + listaGoles);
    }
    
    public void jornada(){
        
        ArrayList<Gol> goles = new ArrayList();
        
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = getEquipoLocal();
                goles.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
                
            }
            if(porcentaje >= 6){
                equipoGoleador = getEquipoVisitante();
                goles.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
                
            }
        
            
            
        }
        setListaGoles(goles);
        
    }
    public void jugadoresGol(){
        for(int i = 0;i<getListaGoles().size();i++){
            System.out.println(getListaGoles().get(i).getNombreJugador());
            
        }
    }

    public static void main(String[] args) {

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
        
        for(Partido p : liga){
            p.jornada();
        }   
        
        for(Partido p : liga){
            p.resultado();
        }

        //p1.jugadoresGol();

    }

}
