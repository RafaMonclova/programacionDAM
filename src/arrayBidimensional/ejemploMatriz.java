
package arrayBidimensional;
import java.util.*;

public class ejemploMatriz {
    public static void main (String[] args){
        
    int[][] tablero = new int [3][4];   
        
    for(int i = 0;i < tablero.length;i++){
        
        for(int j = 0;j < tablero[i].length;j++){
            tablero[i][j] = (int)(Math.random()*10);
        
        }
        
    }    
        
    for(int i = 0;i < tablero.length;i++){
        
        for(int j = 0;j < tablero[i].length;j++){
            System.out.print(tablero[i][j] + " ");
        
        }
        System.out.println();
        
    }    
        
        
        
        
        
        
    }
}
