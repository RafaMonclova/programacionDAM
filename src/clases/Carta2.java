
package clases;
import java.util.*;

public class Carta2 {
    Scanner sc = new Scanner(System.in);
    
int numero = 0;
String palo = "";

void setNumero(int nuevoNumero){
    
    nuevoNumero = sc.nextInt();
    
    while(!(nuevoNumero >=1 || nuevoNumero <=13)){
        System.out.println("Número inválido, debe estar entre 1 y13");
        nuevoNumero = sc.nextInt(); 
    }
     
    numero = nuevoNumero;
    
}

void getNumero(){
    
    System.out.println(numero);
    
}

void setPalo(String nuevoPalo){
    nuevoPalo = sc.nextLine();
    
    while(!(nuevoPalo.equals("c") || nuevoPalo.equals("p") || nuevoPalo.equals("r") || nuevoPalo.equals("t"))){
        System.out.println("Palo inválido, debe ser: c,p,r,t");
        nuevoPalo = sc.nextLine();
    }
    
    palo = nuevoPalo;
    
}

void getPalo(){
    
    System.out.println(palo);
    
}



void mostrarCarta(){
    
    switch (palo){
        
        case "c":
            palo = "corazones";
            break;
        case "p":
            palo = "picas";
            break;
        case "r":
            palo = "rombos";
            break;
        case "t":
            palo = "trebol";
            break;
        
    }
    
    System.out.println("Es el "+numero+" de "+palo);
    
}

void compararCarta(int numeroComparar, String paloComparar){
    
    if(numeroComparar > numero){
        System.out.println("Gana el :"+numeroComparar+" de "+paloComparar);
    }
    else{
        System.out.println("Gana el :"+numero+" de "+palo);
    }
    
}

Carta2(int numeroInicial, String paloInicial){
    numero = numeroInicial;
    palo = paloInicial;
    
}

Carta2(){
    
}


public static void main (String [] args){
    
    Carta2 carta_1 = new Carta2();
    Carta2 carta_2 = new Carta2(1,"c");
    
    carta_1.setNumero(1);
    carta_1.setPalo("c");
    carta_1.mostrarCarta();
    
    carta_2.mostrarCarta();
    
    
    
}





    
}
