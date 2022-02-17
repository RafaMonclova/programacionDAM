
package arrayBidimensional;
import java.util.*;

public class opMatriz {

int matriz[][];
    
    
opMatriz(){
        
    matriz = new int[3][3];
        
}

opMatriz(int filas, int columnas){
    
    matriz = new int[filas][columnas];
    for(int i = 0; i < matriz.length;i++){
        
        for(int j = 0; j < matriz[i].length;j++){      
            matriz[i][j] = (int)(Math.random()*100);   
        }
        
    }  
    
}

void mostrarMatriz(){
    
    for(int i = 0; i < matriz.length;i++){
        
        for(int j = 0; j < matriz[i].length;j++){
            System.out.print(matriz[i][j] + " ");
        }
        
    System.out.println();
    }
    
}

void modificar(int fila, int columna, int nValor){
    
    matriz[fila][columna] = nValor;
    
}

int [][] getMatriz(){
    
    return matriz;
}

void sumar(int matriz[][]){
        if (this.matriz.length != matriz.length){
            System.out.println("ERROR. Las matrices no tienen el mismo tamaño");
        } 
        else {
            System.out.println("Suma:");
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz[i].length; j++){
                    System.out.print(this.matriz[i][j] + matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

void restar(int matriz[][]){
        if (this.matriz.length != matriz.length){
            System.out.println("ERROR. Las matrices no tienen el mismo tamaño");
        } 
        else {
            System.out.println("Resta:");
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz[i].length; j++){
                    System.out.print(this.matriz[i][j] - matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }




/*
void sumaMal(int filas, int columnas){
    
    int otraMatriz[][] = new int[filas][columnas];
    int suma[][] = new int[filas][columnas];
    if(matriz.length != otraMatriz.length){
        System.out.println("EL tamaño de las matrices son diferentes");
    }
    else{
        
        for(int i = 0; i < otraMatriz.length;i++){
        
            for(int j = 0; j < otraMatriz[i].length;j++){      
                otraMatriz[i][j] = (int)(Math.random()*10);   
            }
        
        } 
        
        //suma
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++){
                suma[i][j] = matriz[i][j] + otraMatriz[i][j];
            }   
        }
        
        //imprime suma
        for(int i = 0;i<suma.length;i++){
            for(int j = 0; j < suma[i].length;j++){
                System.out.print(suma[i][j] + " ");
            }
        System.out.println();     
        }
 
        
    }
    
}

void restaMal(int filas, int columnas){
    
    int otraMatriz[][] = new int[filas][columnas];
    int resta[][] = new int[filas][columnas];
    if(matriz.length != otraMatriz.length){
        System.out.println("EL tamaño de las matrices son diferentes");
    }
    else{
        
        for(int i = 0; i < otraMatriz.length;i++){
        
            for(int j = 0; j < otraMatriz[i].length;j++){      
                otraMatriz[i][j] = (int)(Math.random()*10);   
            }
        
        } 
        
        //suma
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++){
                resta[i][j] = matriz[i][j] - otraMatriz[i][j];
            }   
        }
        
        //imprime suma
        for(int i = 0;i<resta.length;i++){
            for(int j = 0; j < resta[i].length;j++){
                System.out.print(resta[i][j] + " ");
            }
        System.out.println();     
        }
 
        
    }
    
}
*/

    
}
