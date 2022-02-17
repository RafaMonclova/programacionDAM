
package arrayBidimensional;
import java.util.*;

public class matrices3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
    
    System.out.println("MATRIZ 1");
    System.out.println("Introduce filas: ");
    int filas1 = sc.nextInt();
    System.out.println("Introduce columnas: ");
    int columnas1 = sc.nextInt();
    
    int [][] matriz1 = new int[filas1][columnas1];      
        
    System.out.println("MATRIZ 2");
    System.out.println("Introduce filas: ");
    int filas2 = sc.nextInt();
    System.out.println("Introduce columnas: ");
    int columnas2 = sc.nextInt();
    
    int [][] matriz2 = new int[filas2][columnas2];     
    
    int [][] suma = new int [filas1][columnas1];
    
    //rellena matriz 1
    for(int i = 0; i < matriz1.length;i++){
        for(int j = 0; j < matriz1[i].length;j++){
            matriz1[i][j] = (int)(Math.random()*10);
        }
    }   
    
    //rellena matriz 2
    for(int i = 0; i < matriz2.length;i++){
        for(int j = 0; j < matriz2[i].length;j++){
            matriz2[i][j] = (int)(Math.random()*10);
        }
    }
    
    //suma
    for(int i = 0; i < matriz1.length;i++){
        for(int j = 0; j < matriz1[i].length;j++){
            suma[i][j] = matriz1[i][j] + matriz2[i][j];
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
