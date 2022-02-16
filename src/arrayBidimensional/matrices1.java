package arrayBidimensional;

import java.util.*;

public class matrices1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Introduce filas: ");
    int filas = sc.nextInt();
    System.out.println("Introduce columnas: ");
    int columnas = sc.nextInt();
    
    int [][] matriz = new int[filas][columnas];   
        
    for(int i = 0; i < matriz.length;i++){
        
        for(int j = 0; j < matriz[i].length;j++){
            matriz [i][j] = (int)(Math.random()*100);
        }
        
        
    }  
    
    for(int i = 0; i < matriz.length;i++){
        
        for(int j = 0; j < matriz[i].length;j++){
            System.out.print(matriz[i][j] + " ");
        }
        
    System.out.println();
    }
        
        
    }
}
