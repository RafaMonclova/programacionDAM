//EJERCICIO 1
//RAFAEL MONCLOVA SUANO
package entregaMatrices;
import java.util.*;

public class ejercicio1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    
    char [][] matriz = new char[10][10];
        
    for(int i = 0; i < matriz.length;i++){
        for(int j = 0; j < matriz[i].length;j++){
            
            matriz[i][j] = (char) (r.nextInt(26) + 'a');
            
        }
    }    
        
    //imprime filas
    for(int i = 0; i < matriz.length;i++){
        for(int j = 0; j < matriz[i].length;j++){
            
            System.out.print(matriz[i][j]);
        }
        System.out.println();
    } 
        
    System.out.println("-----------------------------------------------");
    
    //imprime columnas
    for(int i = 0; i < matriz.length;i++){
        for(int j = 0; j < matriz[i].length;j++){
            System.out.print(matriz[j][i]);
        }
        System.out.println();
    }      
        
        
        
    }
}
