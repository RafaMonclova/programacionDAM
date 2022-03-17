/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerados;

/**
 *
 * @author alumno
 */
public class Dia {
    
    
    
    public enum diaSemana{
        LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;
    }
    
    public static void main(String[] args){
        
        diaSemana primerDia = diaSemana.JUEVES;
        diaSemana segundoDia = diaSemana.VIERNES;
        
        
        if(primerDia.compareTo(segundoDia)<0){
            System.out.println("EL primer dia es "+primerDia.toString());
            System.out.println("El segundo dia es "+segundoDia.toString());
        }
        else{   
            System.out.println("El segundo dia es "+segundoDia.toString());
            System.out.println("EL primer dia es "+primerDia.toString());
        }
        
        
        
    }
    
}
