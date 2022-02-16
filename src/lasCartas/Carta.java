
package lasCartas;

import java.util.*;

public class Carta {
    private Scanner input;
    private int numero;
    private char palo;

    public Carta(){
        input = new Scanner(System.in);
        numero = 1;
        palo = 'c';
    }
    public Carta(Carta nuevaCarta){
        this.numero = nuevaCarta.getNumero();
        this.palo = nuevaCarta.getPalo();
    }

    public int getNumero() {
        return numero;
    }

    public char getPalo() {
        return palo;
    }

    public void setNumero() {
        boolean flag = true;
        int numero = 0;
        System.out.println("Introduce numero");
        do{
            numero = input.nextInt();
            input.nextLine();
            if( numero <= 13 || numero > 0) {
                this.numero = numero;
                flag = false;
            }
        }while(flag);
    }

    public void setPalo() {
        boolean flag = true;
        char palo = ' ';
        do{
            System.out.println("Introduce palo");
            palo = input.next().charAt(0);
            if(palo =='c' || palo =='p' || palo =='d' || palo =='t'){
                this.palo = palo;
                flag = false;
            }
        }while(flag);
    }
    public void mostrarCarta(){
        String cadenaPalo = "";
        switch(palo){
            case 'c': cadenaPalo = "corazones";
            break;
            case 'p': cadenaPalo = "picas";
            break;
            case 'd': cadenaPalo = "diamantes";
            break;
            case 't': cadenaPalo = "treboles";
        }
        switch(numero){
            case 1 : System.out.println("As de "+cadenaPalo);
            break;
            case 11:    System.out.println("Jack de "+cadenaPalo);
            break;
            case 12:    System.out.println("Reina de "+cadenaPalo);
            break;
            case 13:    System.out.println("Rey de "+cadenaPalo);
            break;
            default: System.out.println(numero+" de "+cadenaPalo);
        }
    }
    protected  void comparar(Carta carta2){
        System.out.print("El mayor ");
        if(numero > carta2.getNumero()){
            mostrarCarta();
        } else if (numero == carta2.getNumero()){
            if(palo > carta2.getPalo()){
                mostrarCarta();
            }else{
                carta2.mostrarCarta();
            }
        }else{
            carta2.mostrarCarta();
        }
    }
    public static void main(String[]args){
        Carta carta1 = new Carta();
        carta1.setNumero();
        carta1.setPalo();
        Carta carta2 = new Carta(carta1);
        carta1.mostrarCarta();
        carta2.mostrarCarta();
        carta2.setNumero();
        carta2.setPalo();
        carta1.mostrarCarta();
        carta2.mostrarCarta();
        carta1.comparar(carta2);
    }
}
/* Implementa una clase Carta que represente a una carta de una baraja de póker. De  una carta interesa conocer su número y su palo (almacenado como una única letra).
Un constructor por defecto y un constructor de copias.
Los métodos get que permitan acceder a los atributos.
Los métodos set que en lugar de recibir los nuevos valores como  argumento, los soliciten por teclado. Se comprobarán que sean válidos y se  volverán a solicitar mientras no lo sean. Para que el número de la carta sea  valido deberá estar entre 1 y 13 y el palo deberá ser una de las siguientes  letras: c,p,r,t que corresponden a corazones, picas, rombos y tréboles.
Un método mostrarCarta() que muestre por pantalla de que carta se trata  con el siguiente formato: es el <numero> de <palo> donde el número y el  palo corresponden a los atributos de la carta con las siguientes  particularidades:
a) El palo del número deberá mostrarse al completo, es decir
se deberá sustituir la letra del palo por el palo en cuestión.
b) Si el número de la carta está entre 2 y 10 se mostrará
normalmente. Para el resto de los números 1,11,12,13 se
cambiará respectivamente por As, Jack, Reina, Rey .

- Un método comparar(Carta) que reciba una carta como argumento y la  compare con la actual Indicando por pantalla cuál de ellas es la ganadora.  Para esto se comprobará en primer el número, si son distintos ganará la  mayor, si son iguales se compararán los palos, el orden de victoria es  Trébol, Rombos, Picas, Corazones. Si las cartas son iguales se indicará que  hay un empate.
- Un método main en el que se creen 2 cartas, la primera con el constructor  por defecto y se inicialice con los métodos set, la segunda se copiará con el  constructor de copias. Después se mostrarán ambas cartas con el método  mostrarCarta() y se compararán con el método comparar. Después de esto  se modificará la segunda con los métodos set y se volverán a mostrar y  comparar.
*/