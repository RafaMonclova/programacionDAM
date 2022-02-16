
package arrayBidimensional;
import java.util.*;

public class ejecutar {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
        
    opMatriz matriz1 = new opMatriz();        
    opMatriz matriz2 = new opMatriz(3,3);     
    
    //rellena matriz1
    for(int i = 0; i<matriz1.getMatriz().length;i++){
        
        for(int j = 0; j < matriz1.getMatriz()[i].length;j++){
            matriz1.modificar(i, j, (int)(Math.random()*100));
        }
        
    }
    
    System.out.println("Matriz 1: ");
    matriz1.mostrarMatriz();
    System.out.println("Matriz 2: ");
    matriz2.mostrarMatriz();
    
    System.out.println("SUMA");
    matriz1.sumar(matriz2.getMatriz());
    
    System.out.println("RESTA"); 
    matriz1.restar(matriz2.getMatriz());
    }
}
