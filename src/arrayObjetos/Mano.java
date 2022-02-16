
package arrayObjetos;
import java.util.*;

public class Mano {


Carta arrayCartas[];    //Array con las cartas que hay en la mano
int numCartas;          //Número de cartas de la mano
 
//Constructor por defecto. Crea una mano de 3 cartas
Mano(){
    
    numCartas = 3;
    arrayCartas= new Carta[numCartas];
    for(int i=0;i<arrayCartas.length;i++){
        arrayCartas[i]= new Carta();
    }
    
}    

//Constructor por parámetros. Crea una mano con el número de cartas indicado
/**
 * 
 * @param numCartas El número de cartas de la mano
 */
Mano(int numCartas){
    
   this.numCartas= numCartas;
   
    arrayCartas= new Carta[this.numCartas];
    for(int i=0;i<arrayCartas.length;i++){
        arrayCartas[i]= new Carta();
    }
    
} 

//Devuelve el número de cartas de la mano
/**
 * 
 * @return Devuelve el número de cartas de la mano
 */
int getNumCartas(){
    return numCartas;
}

//Devuelve el array de cartas de la mano
/**
 * 
 * @param posicion Posición de la carta dentro de la mano
 * @return Devuelve el array de cartas de esa posición
 */
Carta getCarta(int posicion){
    return arrayCartas[posicion];
    
}
    
//Muestra la carta de la posición indicada
/**
 * 
 * @param posicion Posición de la carta que queremos mostrar
 */
void mostrarCarta(int posicion){
    
   arrayCartas[posicion].mostrarCarta();
    
} 

//Establece una carta en la posición dada, con su número y palo
/**
 * 
 * @param posicion La posición de la carta a establecer
 * @param num El número de la carta que queremos establecer
 * @param palo El palo de la carta que queremos establecer
 */
void setCarta(int posicion, int num, char palo){
    arrayCartas[posicion].setNumero(num);
    arrayCartas[posicion].setPalo(palo);
      
        
    
}


//Modifica el número y palo de la carta en la posición dada
/**
 * 
 * @param posicion Posición de la carta a modificar
 */
void modificarCarta(int posicion){
   
    arrayCartas[posicion].setNumero();
    arrayCartas[posicion].setPalo();
    /*
    //otra opción
     Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un palo");
    char nuevoPalo = sc.next().charAt(0); 
     
    System.out.println("Introduce un numero entre 1 y 13");
    int nuevoNumero = sc.nextInt();
    setCarta(posicion,nuevoNumero,nuevoPalo);
    */
    
}

//Muestra las cartas de la mano
void mostrarMano(){
     for(int i=0;i<arrayCartas.length;i++){
        arrayCartas[i].mostrarCarta();
    }
} 

/*
Compara la carta del objeto con otra carta introducida por parámetro.
Devuelve Empate si es empate, ganadora mia si gana la carta del objeto, y ganadora otra
si gana la introducida por parámetro.
*/
/**
 * 
 * @param otraMano Recibe otro objeto de la clase mano para comparar
 */
void manoGanadora(Mano otraMano){
    mostrarMano();
    otraMano.mostrarMano();
    int longitudManoMenor;
    int resultadoComparar=0;
    
    if(arrayCartas.length<  otraMano.arrayCartas.length )
/*nos quedamso con la longitud de la mano con menor número de cartas para comparar
        */
        
        longitudManoMenor=arrayCartas.length;
    else
        longitudManoMenor=otraMano.arrayCartas.length;
    
    for(int i=0;i<longitudManoMenor;i++){
//comparamos las cartas de la misma posición entre ambas manos
        if (arrayCartas[i].cartaGanadora(otraMano.arrayCartas[i]))
            resultadoComparar--;
        else
            resultadoComparar++;
        
    }
    if (resultadoComparar==0){
        System.out.println("empate");
    } else if (resultadoComparar<0){
        System.out.println("ganadora mia");
        mostrarMano();
    } else{
        System.out.println("ganadora otra ");
         otraMano.mostrarMano();
    }
   
    
        
    }
      
    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      System.out.println("Introduce num cartas");
      int numCartas = sc.nextInt();
      
      Mano primeraMano=new Mano(numCartas);
      Mano segundaMano=new Mano(numCartas);
      
      for (int i=0;i<primeraMano.getNumCartas();i++){
          primeraMano.modificarCarta(i);
      }
      for (int i=0;i<segundaMano.getNumCartas();i++){
          segundaMano.modificarCarta(i);
      }
      
      primeraMano.manoGanadora(segundaMano);
        
    
        
        
    }
}
