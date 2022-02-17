
package bingo;
import java.util.*;

/**
 * 
 * @author Rafa
 * @version 1.0
 */
public class Bingo {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        //Creamos los cartones de 2 jugadores
        Carton Jugador1 = new Carton();
        Carton Jugador2 = new Carton();
        
        //Por defecto, la primera línea vale true hasta que alguien la saque
        boolean primeraLinea = true;
        
        //Menú que compara el número aleatorio generado con las casillas del cartón
       do{
           System.out.println("Pulsa una tecla para introducir número aleatorio");
           char tecla = sc.next().charAt(0);
           int numero = (int)((Math.random()*20)+1);
           System.out.println("Número: "+numero);
           Jugador1.borrarNum(numero);
           Jugador2.borrarNum(numero);
           System.out.println("J1");
           Jugador1.mostrarCarton();
           System.out.println("-------------------------------");
           System.out.println("J2");
           Jugador2.mostrarCarton();
           
           //El jugador que consiga línea cambiará primeraLinea a false, para comprobar que sea la primera
           if(Jugador1.linea() && primeraLinea){
               System.out.println("El Jugador 1 ha sacado la primera Linea!");
               primeraLinea = false;
               
           }
           
           
           if(Jugador2.linea() && primeraLinea){
               System.out.println("El Jugador 2 ha sacado la primera Linea!");
               primeraLinea = false;
           }
           
          
           
           
       }while(!(Jugador1.bingo() || Jugador2.bingo()));
       
       //Comprobamos qué jugador sacó bingo y se muestra el ganador
       if(Jugador1.bingo()){
           System.out.println("Gana el jugador 1!");
       }
       else{
           if(Jugador2.bingo()){
               System.out.println("Gana el jugador 2!");
           } 
       }
       
       
    }
}
