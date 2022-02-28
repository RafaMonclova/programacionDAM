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
    
    public void añadirGoles(Gol g){
        listaGoles.add(g);
    }

    public void resultado() {

        System.out.println("LOCAL: " + equipoLocal);
        System.out.println("VISITANTE: " + equipoVisitante);
        System.out.println("GOLES: ");
        System.out.println("" + listaGoles);
    }

    public static void main(String[] args) {


        ArrayList<Partido> liga = new ArrayList();

        
        
        ArrayList<Gol> goles1 = new ArrayList();
        Partido p1 = new Partido("Madrid", "Barca");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p1.getEquipoLocal();
                goles1.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
                
            }
            if(porcentaje >= 6){
                equipoGoleador = p1.getEquipoVisitante();
                goles1.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
                
            }
        
            
            
        }
        p1.setListaGoles(goles1);
        
        ArrayList<Gol> goles2 = new ArrayList();
        Partido p2 = new Partido("Barca", "Madrid");
        for (int i = 0; i < 5; i++) {
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p2.getEquipoLocal();
                goles2.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
                
            }
            if(porcentaje >= 6){
                equipoGoleador = p2.getEquipoVisitante();
                goles2.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
                
            }
            
           
        }
        p2.setListaGoles(goles2);
        
        ArrayList<Gol> goles3 = new ArrayList();     
        Partido p3 = new Partido("Betis", "Sevilla");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p3.getEquipoLocal();
                goles3.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
                
            }
            if(porcentaje >= 6){
                equipoGoleador = p3.getEquipoVisitante();
                goles3.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
                
            }
            
            
        }
        p3.setListaGoles(goles3);
        
        ArrayList<Gol> goles4 = new ArrayList();
        Partido p4 = new Partido("Sevilla", "Betis");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p4.getEquipoLocal();
                goles4.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            if(porcentaje >= 6){
                equipoGoleador = p4.getEquipoVisitante();
                goles4.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            
            
        }
        p4.setListaGoles(goles4);
        
        ArrayList<Gol> goles5 = new ArrayList();
        Partido p5 = new Partido("Madrid", "Betis");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p5.getEquipoLocal();
                goles5.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            if(porcentaje >= 6){
                equipoGoleador = p5.getEquipoVisitante();
                goles5.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            
            
        }
        p5.setListaGoles(goles5);
        
        ArrayList<Gol> goles6 = new ArrayList();
        Partido p6 = new Partido("Betis", "Madrid");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p6.getEquipoLocal();
                goles6.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            if(porcentaje >= 6){
                equipoGoleador = p6.getEquipoVisitante();
                goles6.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            
            
        }
        p6.setListaGoles(goles6);
        
        ArrayList<Gol> goles7 = new ArrayList();
        Partido p7 = new Partido("Barca", "Sevilla");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p7.getEquipoLocal();
                goles7.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            if(porcentaje >= 6){
                equipoGoleador = p7.getEquipoVisitante();
                goles7.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            
            
        }
        p7.setListaGoles(goles7);
        
        ArrayList<Gol> goles8 = new ArrayList();
        Partido p8 = new Partido("Sevilla", "Barca");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p8.getEquipoLocal();
                goles8.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            if(porcentaje >= 6){
                equipoGoleador = p8.getEquipoVisitante();
                goles8.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            
            
        }
        p8.setListaGoles(goles8);
        
        ArrayList<Gol> goles9 = new ArrayList();
        Partido p9 = new Partido("Barca", "Betis");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p9.getEquipoLocal();
                goles9.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            if(porcentaje >= 6){
                equipoGoleador = p9.getEquipoVisitante();
                goles9.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            
            
        }
        p9.setListaGoles(goles9);
        
        ArrayList<Gol> goles10 = new ArrayList();
        Partido p10 = new Partido("Betis", "Barca");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p10.getEquipoLocal();
                goles10.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            if(porcentaje >= 6){
                equipoGoleador = p10.getEquipoVisitante();
                goles10.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            
            
        }
        p10.setListaGoles(goles10);
        
        ArrayList<Gol> goles11 = new ArrayList();
        Partido p11 = new Partido("Madrid", "Sevilla");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p11.getEquipoLocal();
                goles11.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            if(porcentaje >= 6){
                equipoGoleador = p11.getEquipoVisitante();
                goles11.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            
            
        }
        p11.setListaGoles(goles11);
        
        ArrayList<Gol> goles12 = new ArrayList();
        Partido p12 = new Partido("Sevilla", "Madrid");
        for (int i = 0; i < 5; i++) {
            
            String equipoGoleador;
            int porcentaje = (int)((Math.random()*9)+1);
            int minAleatorio = (int) ((Math.random() * 89) + 1);
            int jugAleatorio = (int) ((Math.random() * 10) + 1);
            if(porcentaje <= 5){
                equipoGoleador = p12.getEquipoLocal();
                goles12.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            if(porcentaje >= 6){
                equipoGoleador = p12.getEquipoVisitante();
                goles12.add(new Gol(equipoGoleador, "J" + jugAleatorio, minAleatorio));
            }
            
            
        }
        p12.setListaGoles(goles12);
        
        
        
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
            p.resultado();
        }

        

    }

}
