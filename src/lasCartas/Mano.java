
package lasCartas;
import java.util.*;

public class Mano {
    private int tamanho;
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;
    public Mano(){
        tamanho = 3;
         carta1 = new Carta();
         carta2 = new Carta();
         carta3 = new Carta();
    }

    public int getTamanho() {
        return tamanho;
    }

     void getCarta(int numero) {
        switch (numero) {
            case 1:
                carta1.mostrarCarta();
                break;
            case 2:
                carta2.mostrarCarta();
                break;
            case 3:
                carta3.mostrarCarta();
                break;
        }
    }
    public void setMano(){
        setCarta(1);
        setCarta(2);
        setCarta(3);
    }

    public void setCarta(int numero) {
        switch(numero) {
            case 1:
                carta1.setNumero();
                carta1.setPalo();
                break;
            case 2:
                carta2.setNumero();
                carta2.setPalo();
                break;
            case 3: 
                carta3.setNumero();
                carta3.setPalo();
                break;
        }
    }
    public void pedirMano(){
        System.out.println("Carta 1");
        carta1.setNumero();
        carta1.setPalo();
        System.out.println("Carta 2");
        carta2.setNumero();
        carta2.setPalo();
        System.out.println("Carta 3");
        carta3.setNumero();
        carta3.setPalo();

    }
    public void mostrarMano() {
        carta1.mostrarCarta();
        carta2.mostrarCarta();
        carta3.mostrarCarta();
    }
    public void manoGanadora(Mano otraMano){
        int rojo = 0;
        int rojoOtraMano = 0;
        int sumaMano = carta1.getNumero()+carta2.getNumero()+carta3.getNumero();
        int sumaOtraMano = otraMano.carta1.getNumero()+otraMano.carta2.getNumero()+otraMano.carta2.getNumero();
        String cadenaPalo = ""+carta1.getPalo()+ carta2.getPalo()+ carta3.getPalo();
        String cadenaOtroPalo = ""+otraMano.carta1.getPalo()+otraMano.carta2.getPalo()+otraMano.carta3.getPalo();
        if(sumaMano > sumaOtraMano){
            System.out.println("Gana");
            mostrarMano();
        }else if (sumaMano < sumaOtraMano){
            System.out.println("Gana");
            otraMano.mostrarMano();
        }else{
            for(int i = 0;i<cadenaPalo.length();i++){
                if(cadenaPalo.charAt(i)=='c' || cadenaPalo.charAt(i)=='d'){
                    rojo++;
                }
                if(cadenaOtroPalo.charAt(i)=='c'|| cadenaOtroPalo.charAt(i)=='d'){
                    rojoOtraMano++;
                }
            }

            if(rojo != rojoOtraMano){
                System.out.println("Ganador");
                if(rojo == 2){
                    mostrarMano();
                }
                if(rojoOtraMano == 2){
                    otraMano.mostrarMano();
                }
            }else{
                System.out.println("Empate");
                mostrarMano();
                System.out.println();
                otraMano.mostrarMano();

            }
        }
    }
}