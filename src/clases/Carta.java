
package clases;
import java.util.*;

public class Carta {
Scanner sc = new Scanner(System.in);
private int numero;
private char palo;

Carta(){ 
    numero = 1;
    palo='c';   
}

Carta(Carta nuevaCarta){//crea una copia
    numero = nuevaCarta.numero;
    palo = nuevaCarta.palo;
}

Carta(int nuevoNumero, char nuevoPalo){   
    numero = nuevoNumero;
    palo = nuevoPalo;  
}

void setNumero(){
    
    System.out.println("Introduce un numero entre 1 y 13");
    int nuevoNumero = sc.nextInt();
    while(nuevoNumero < 1 || nuevoNumero > 13){
        System.out.println("Introduce un número entre 1 y 13");
        nuevoNumero = sc.nextInt();  
    }
    
    numero = nuevoNumero;
}

void setPalo(){
    
    System.out.println("Introduce un palo");
    char nuevoPalo = sc.next().charAt(0); 
    while(nuevoPalo!='c' && nuevoPalo!='p' && nuevoPalo!='r' && nuevoPalo!='t'){
        System.out.println("Introduce un palo: c(Corazones),p(Picas),r(Rombos),t(Treboles)");
        nuevoPalo = sc.next().charAt(0);  
    }
    
    palo = nuevoPalo;    
}

void mostrarCarta(){
    
    String salida = "";
    salida = "es el ";
    
    switch(numero){
        
        case 1:
            salida += "AS de ";
            break;
        case 11:
            salida += "JACK de ";
            break;
        case 12:
            salida += "REINA de ";
            break;
        case 13:
            salida += "REY de ";
            break;
        default:
            salida+=numero+ " de ";
    }
       
    switch (palo){
        
        case 'c':
            salida += "Corazones";
            break;
        case 'p':
            salida += "Picas";
            break;
        case 'r':
            salida += "Rombos";
            break;
        case 't':
            salida += "Treboles";
            break;
        
    }
    System.out.println(salida);
}

void compararCarta(Carta otraCarta){
    
    if(numero > otraCarta.numero){
        mostrarCarta();      
    }
    else{
        if(numero < otraCarta.numero){
            otraCarta.mostrarCarta();
        }
        else{//numeros iguales, preguntar palo
            if(palo > otraCarta.palo){
                mostrarCarta();    
            }
            else{
                otraCarta.mostrarCarta();
            }
        }
    }      
}

public static void main(String[] args){
    
    Carta miCarta = new Carta();
    miCarta.setNumero();
    miCarta.setPalo();
    miCarta.mostrarCarta();
       
    Carta tuCarta = new Carta(miCarta);
    tuCarta.setNumero();
    tuCarta.setPalo();
    tuCarta.mostrarCarta();
    
    System.out.println("Comparamos");
    System.out.print("La carta ganadora ");
    miCarta.compararCarta(tuCarta);
    }
}     