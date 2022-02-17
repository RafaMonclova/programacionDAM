package arrayBidimensional;
import java.util.*;

public class matrices2 {
    
private static boolean buscar(int numIntroducido, int [][] matriz ){
    boolean encontrado=false;
         
    for (int i = 0; i < matriz.length; i++) {

        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] == numIntroducido) {
                    encontrado = true;
                    System.out.println("El número " + numIntroducido
                            + " aparece en la fila: " + (i + 1) + " y columna: " + (j + 1));
            }
        }

    }
    return encontrado;
}
    
private static void rellenar(int matriz[][]){
        
    for(int i = 0; i < matriz.length;i++){
        
        for(int j = 0; j < matriz[i].length;j++){      
            matriz[i][j] = (int)(Math.random()*150);   
        }
        
    }
        
}

private static void mostrar(int matriz[][]){
    
    for(int i = 0; i < matriz.length;i++){
        
        for(int j = 0; j < matriz[i].length;j++){
            System.out.print(matriz[i][j] + " ");
        }
        
    System.out.println();
    }
    
    
}
    
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int [][] matriz = new int[10][10]; 
 
    rellenar(matriz);    
      
    
    System.out.println("Introduce un número a buscar");
    int numIntroducido = sc.nextInt();
   
    boolean encontrado=buscar(numIntroducido,  matriz );
    
    if (!encontrado)
        System.out.println("no encontrado "+numIntroducido);
    
    mostrar(matriz);
        
    }
}
