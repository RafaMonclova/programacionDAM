package bingo;

import java.util.*;

/**
 * 
 * @author Rafa
 * @version 1.0
 */
public class Carton {
    //Atributo que guarda el cartón de bingo
    int carton[][];
    
    //Crea un cartón por defecto, de 3x4
    Carton() {
        carton = new int[3][4];
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                carton[i][j] = (int) ((Math.random() * 20) + 1);
            }
        }
    }
    
    /**
     * 
     * @param numero Recibe el número a borrar del cartón. Asigna ese número a 0
     */
    void borrarNum(int numero) {
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if (carton[i][j] == numero) {
                    carton[i][j] = 0;
                }
            }
        }
    }
    
    //Muestra el cartón, colocando X si no hay ningún número
    void mostrarCarton() {
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if (carton[i][j] == 0) {
                    System.out.print("\033[1;31m"+" X ");
                    System.out.print("\033[2;30m"+"");
                    continue;
                }

                System.out.print(" " + carton[i][j] + " ");
            }
            System.out.println();
        }

    }
    
    //Comprueba si hay bingo (todas las casillas valen 0)
    boolean bingo(){
             
        int cont=0;
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if(carton[i][j]==0){
                    cont++;
                }
                
            }
            
        }
        if(cont == 12){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Comprueba si hay línea (fila con casillas en 0)
    boolean linea(){
        
        boolean encontrado = false;
        for (int i = 0; i < carton.length; i++) {
            int cont=0;
            for (int j = 0; j < carton[i].length; j++) {
                if(carton[i][j]==0){
                    cont++;
                }
                if(cont==4){
                    encontrado = true;
                    break;   
                }
                
            }
            
        }
        return encontrado;
  
    }
             

}
