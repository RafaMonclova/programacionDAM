/**
 * @author Rafa
 * 
 */
package arrayObjetos;
import java.util.*;

public class Carta {

private int numero;     //El número de la carta
private char palo;      //El palo de la carta


//Constructor por defecto. Crea un objeto de clase carta cuyo número es el 1 y el palo c

Carta(){ 
    numero = 1;
    palo='c';   
}

//Constructor por parámetros. Crea un objeto de la clase carta con el número y palo indicados
/**
 * 
 * @param nuevoNumero Número de la carta
 * @param nuevoPalo Palo de la carta
 */
Carta(int nuevoNumero, char nuevoPalo){   
    numero = nuevoNumero;
    palo = nuevoPalo;  
}

//Establece el número de la carta. Debe estar comprendido entre 1 y 13

void setNumero(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero entre 1 y 13");
    int nuevoNumero = sc.nextInt();
    while(nuevoNumero < 1 || nuevoNumero > 13){
        System.out.println("Introduce un número entre 1 y 13");
        nuevoNumero = sc.nextInt();  
    }
    
    numero = nuevoNumero;
}

//Establece el número de la carta sin tener en cuenta el número introducido
/**
 * 
 * @param nuevoNumero El número que se da a la carta
 */
void setNumero(int nuevoNumero){
    numero = nuevoNumero;
    
}

//Establece el palo de la carta. Debe ser c,p,r o t
void setPalo(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un palo");
    char nuevoPalo = sc.next().charAt(0); 
    while(nuevoPalo!='c' && nuevoPalo!='p' && nuevoPalo!='r' && nuevoPalo!='t'){
        System.out.println("Introduce un palo: c(Corazones),p(Picas),r(Rombos),t(Treboles)");
        nuevoPalo = sc.next().charAt(0);  
    }
    
    palo = nuevoPalo;    
}

//Establece el palo de la carta sin tener en cuenta el tipo
/**
 * 
 * @param nuevoPalo El palo que se da a la carta
 */
void setPalo( char nuevoPalo ){
     palo = nuevoPalo;    
}

//Devuelve el número de la carta
/**
 * 
 * @return Devuelve el número de la carta
 */
int getNumero(){
    return numero;
}

//Devuelve el palo de la carta
/**
 * 
 * @return Devuelve el palo de la carta
 */
char getPalo(){
    return palo;
}

//Muestra la carta, es decir, su número y palo
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


//Devuelve true si gana la carta del objeto, y false si gana la carta introducida por parámetro
/**
 * 
 * @param otraCarta Recibe otro objeto de la clase carta
 * @return Devuelve true si gana la carta del objeto, y false si gana la recibida por parámetro
 */
boolean cartaGanadora(Carta otraCarta){
    
    if(numero > otraCarta.numero){
        
        return true;
    }
    else{
        if(numero < otraCarta.numero){
            
            return false;
        }
        else{//si los números son iguales se comprueba el palo
            if(palo > otraCarta.palo){
                
                return false;
            }
            else{
                
                return true;
            }
        }
    }      
}


    
}
