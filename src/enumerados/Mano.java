/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerados;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Mano {

    String nombre;
    gesto gesto;

    public Mano(String nombre) {
        this.nombre = nombre;
    }

    public enum gesto {
        PIEDRA, PAPEL, TIJERAS;
    }

    public gesto jugadaAleatoria() {

        int probabilidad = (int) ((Math.random() * 99) + 1);

        if (probabilidad <= 34) {
            return gesto.PIEDRA;
        } else if (probabilidad >= 35 && probabilidad <= 67) {
            return gesto.PAPEL;
        } else {
            return gesto.TIJERAS;
        }

    }

    public void juego(Mano otraMano) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que vas a sacar (PIEDRA,PAPEL,TIJERAS)");
        System.out.println("Por defecto será papel!");
        String gestoJugador = sc.nextLine();
        gesto gestoObjeto = null;
        switch(gestoJugador){
            case "PAPEL":
                gestoObjeto = gesto.PAPEL;
            break;    
            case "PIEDRA":
                gestoObjeto = gesto.PIEDRA;
            break;
            case "TIJERAS":
                gestoObjeto = gesto.TIJERAS;
            break;
            default:
                gestoObjeto = gesto.PAPEL;
        }
        
        System.out.println("Jugador " + this.nombre + " saca " + gestoObjeto);
        //////////////////////////////////////////////////////////////////////////
        gesto gestoOtro = otraMano.jugadaAleatoria();
        System.out.println("Jugador " + otraMano.nombre + " saca " + gestoOtro);

        if (gestoObjeto == gesto.PAPEL && gestoOtro == gesto.PIEDRA) {
            System.out.println("Gana " + this.nombre);

        } else if (gestoObjeto == gesto.PIEDRA && gestoOtro == gesto.PAPEL) {
            System.out.println("Gana " + otraMano.nombre);
        } else if (gestoObjeto == gesto.TIJERAS && gestoOtro == gesto.PAPEL) {
            System.out.println("Gana " + this.nombre);
        } else if (gestoObjeto == gesto.PAPEL && gestoOtro == gesto.TIJERAS) {
            System.out.println("Gana " + otraMano.nombre);
        } else if (gestoObjeto == gesto.PIEDRA && gestoOtro == gesto.TIJERAS) {
            System.out.println("Gana " + this.nombre);
        } else if (gestoObjeto == gesto.TIJERAS && gestoOtro == gesto.PIEDRA) {
            System.out.println("Gana " + otraMano.nombre);
        } else if (gestoObjeto == gestoOtro) {
            System.out.println("EMPATE");
        }

    }

    public static void main(String[] args) {

        Mano m1 = new Mano("Jugador1");
        Mano m2 = new Mano("Jugador2(BOT)");

        m1.juego(m2);

    }

}
