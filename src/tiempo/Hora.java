
package tiempo;
import java.util.*;

public class Hora {

int hora;
int minuto;
int segundo;

Hora(){
    hora = 0;
    minuto = 0;
    segundo = 0;
}

Hora(int nuevaHora, int nuevoMinuto, int nuevoSegundo){
    hora = nuevaHora;
    minuto = nuevoMinuto;
    segundo = nuevoSegundo;
}

int getHora(){
    return hora;
}

int getMinuto(){
    return minuto;
}

int getSegundo(){
    return segundo;
}

void setHora(int nuevaHora){
      
    while(nuevaHora >= 24){
        nuevaHora = nuevaHora-24;
        
    }
    
    hora = nuevaHora;
}

void setMinuto(int nuevoMinuto){
      
    while(nuevoMinuto >= 60){
        hora++;
        nuevoMinuto = nuevoMinuto - 60;       
    }
    
    minuto = nuevoMinuto;
}

void setSegundo(int nuevoSegundo){
    
    while (nuevoSegundo >= 3600){
        hora++;
        nuevoSegundo = nuevoSegundo - 3600;
    }

    while (nuevoSegundo >= 60){
        minuto++;
        nuevoSegundo = nuevoSegundo - 60;
    }
    
    segundo = nuevoSegundo;
    
    
}

void mostrarHora24(){
    
    System.out.println("Son las "+getHora()+" horas "+getMinuto()+" minutos "+getSegundo()+" segundos.");
}

void mostrarHora12(){
    
    if(hora > 12){
        System.out.println("Son las "+(getHora()-12)+" horas "+(getMinuto())+" minutos "+(getSegundo())+" segundos de la tarde.");
    }
    else{
        System.out.println("Son las "+(getHora())+" horas "+(getMinuto())+" minutos "+(getSegundo())+" segundos de la mañana.");
    }
    
    
    
}


    
}
