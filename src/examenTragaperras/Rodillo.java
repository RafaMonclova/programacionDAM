
package examenTragaperras;

public class Rodillo {


String conjuntoSimbolos;
int posicion;

Rodillo(){
    conjuntoSimbolos = "ABCDEF";
    posicion = 0;
}

Rodillo(String conjuntoSimbolos, int posicion){ 
    
    if(conjuntoSimbolos.equals("")){
        this.conjuntoSimbolos = "ABCDEF";
    }
    else{
        this.conjuntoSimbolos = conjuntoSimbolos;
    }
    
    if(posicion >= conjuntoSimbolos.length()){
        this.posicion = 0;
    }
    else{
        this.posicion = posicion; 
    }
    
}

void avance(){
    
    int longitudPorDos = conjuntoSimbolos.length()*2;
    int avance = (int)(Math.random()*(longitudPorDos-1)+1);
    
    int total = avance+posicion;
            
    if(total > conjuntoSimbolos.length()){
        
        posicion = posicion%avance;
    }
    
    posicion = posicion + avance;
     
    
    
}

char getSimbolo(){
    
    return conjuntoSimbolos.charAt(posicion);
    
}

String getConjunto(){
    return conjuntoSimbolos;
}

int getPosicion(){
    return posicion;
}


public static void main(String [] args){
    
    Rodillo miRodillo = new Rodillo();
    
    miRodillo.avance();
    System.out.println(miRodillo.getSimbolo());
    
}




    
}
