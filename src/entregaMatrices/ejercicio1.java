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
      
        System.out.println("FILAS");
    for(int i = 0; i < matriz.length;i++){
        for(int j = 0; j < matriz[i].length;j++){
            
            System.out.print(matriz[i][j]);
        }
        System.out.println();
    } 
      /*  
    System.out.println("-----------------------------------------------");
    
        System.out.println("COLUMNAS");
    for(int i = 0; i < matriz.length;i++){
        for(int j = 0; j < matriz[i].length;j++){
            System.out.print(matriz[j][i]);
        }
        System.out.println();
    }  


         System.out.println("DIAGONAL NORMAL");
    for (int j=0;j<matriz.length;j++){
        int x=j;
        for(int p=0;p<matriz.length;p++){
          
            System.out.print(matriz[x][p]);
        x++;
        
        if(x>=matriz.length){
            break;
        }
        
        }
        System.out.println("");
    }
        for (int j=0;j<matriz.length;j++){
        int x=j;
        for(int p=0;p<matriz.length;p++){
          
            System.out.print(matriz[p][x]);
        x++;
        
        if(x>=matriz.length){
            break;
        }
        
        }
        System.out.println("");
    }
*/
        
        System.out.println("DIAGONAL INVERSA");
        
        for (int j=0;j<matriz.length;j++){
        int x=j;
        for(int p=matriz.length-1;p>=0;p--){
          
            System.out.print(matriz[p][x]);
        x++;
        
        if(x>=matriz.length){
            break;
        }
        
        }
        System.out.println("");
    }
        for (int j=matriz.length-1;j>=0;j--){
        int x=j;
        for(int p=0;p<matriz.length;p++){
          
            System.out.print(matriz[p][x]);
        x--;
        
        if(x<0){
            break;
        }
        
        }
        System.out.println("");
    }
    }
}
