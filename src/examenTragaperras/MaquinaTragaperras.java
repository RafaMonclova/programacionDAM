
package examenTragaperras;
import java.util.*;

public class MaquinaTragaperras {
    Scanner sc = new Scanner(System.in);
Rodillo rodillo1;
Rodillo rodillo2;
Rodillo rodillo3;
       
    
MaquinaTragaperras(){
   
    rodillo1 = new Rodillo();
    rodillo2 = new Rodillo();
    rodillo3 = new Rodillo();
    
}
    
MaquinaTragaperras(String conjuntoSimbolos, int posicion1, int posicion2, int posicion3){
    
    conjuntoSimbolos = rodillo1.getConjunto();
    conjuntoSimbolos = rodillo2.getConjunto();
    conjuntoSimbolos = rodillo3.getConjunto();
    
    posicion1 = rodillo1.getPosicion();
    posicion2 = rodillo2.getPosicion();
    posicion3 = rodillo3.getPosicion();
    
}    
    
void mover(){
    
    rodillo1.avance();
    rodillo2.avance();
    rodillo3.avance();
    
}    
    
void avanceRodillo(int numRodillo){
    
    switch (numRodillo){
        
        case 1:
            rodillo1.avance();
        break;
        
        case 2:
            rodillo2.avance();
        break;
        
        case 3:
            rodillo3.avance();
        break;
        
        default:
            System.out.println("Numero de rodillo inválido (1,2,3)");
              
    }  
}      
 
void jugar(){
    
    System.out.println("SIMBOLOS: ");
    System.out.println("----------------------------");
    System.out.println(rodillo1.getSimbolo());
    System.out.println(rodillo2.getSimbolo());
    System.out.println(rodillo3.getSimbolo());
    
    System.out.println("MOVEMOS LOS RODILLOS");
    mover();
    
    System.out.println("SIMBOLOS: ");
    System.out.println("----------------------------");
    System.out.println(rodillo1.getSimbolo());
    System.out.println(rodillo2.getSimbolo());
    System.out.println(rodillo3.getSimbolo());
    
    if(rodillo1.getSimbolo() == rodillo2.getSimbolo() || rodillo2.getSimbolo() == rodillo3.getSimbolo()){
        
        System.out.println("¿Avanzar (a) o Cobrar(c)?");
        char opcion = sc.next().charAt(0);
        
        switch(opcion){
            case 'a':
                System.out.println("¿Que rodillo quiere avanzar?");
                avanceRodillo(sc.nextInt());
                System.out.println("SIMBOLOS: ");
                System.out.println("----------------------------");
                System.out.println(rodillo1.getSimbolo());
                System.out.println(rodillo2.getSimbolo());
                System.out.println(rodillo3.getSimbolo());
            break;
            
            case 'c':
                System.out.println("COBRAR");
            break;
            
            default:
                System.out.println("Opción inválida (a Avanzar, c Cobrar)");
                
        }
        
        
    }
    
    
    
    
    
    
    
}











    
}
