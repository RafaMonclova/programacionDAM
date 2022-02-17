
package arrays;
import java.util.*;

public class vectores12main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Se crean los dos objetos de la clase "vectores12"
    vectores12 misNumeros = new vectores12();    
    vectores12 misNumeros2 = new vectores12(10);     
       
        
    System.out.println("1. Mostrar vector");
    System.out.println("2. Mostrar vector en orden inverso");
    System.out.println("3. Busca el número menor");
    System.out.println("4. Busca el número mayor");
    System.out.println("5. Comprobar si existe un número en el vector");
    System.out.println("6. Cambiar el valor almacenado en una posición");
    System.out.println("7. Sustituir todas las apariciones de un número por otro");
    System.out.println("8. Intercambiar los valores de 2 posiciones");
    System.out.println("9. Ordenar el vector de menor a mayor, sin mostrarlo");  
    System.out.println("0. SALIR"); 
        
        
    int opcion;
    do{
        
      System.out.println("Introduzca una opción: ");  
      opcion = sc.nextInt();
      
      switch(opcion){
        
        case 1:
            System.out.println("1. Mostrar vector");
            misNumeros.mostrarVector();
        break;
        case 2:
            System.out.println("2. Mostrar vector en orden inverso");
            misNumeros.mostrarVectorInverso();
        break;
        case 3:
            System.out.println("3. Busca el número menor");
            System.out.println(misNumeros.mostrarMenor());
        break;
        case 4:
            System.out.println("4. Busca el número mayor");
            System.out.println(misNumeros.mostrarMayor());
        break;
        case 5:
            System.out.println("5. Comprobar si existe un número en el vector");
            misNumeros.compruebaNumero(90);
        break;
        case 6:
            System.out.println("6. Cambiar el valor almacenado en una posición");
            misNumeros.cambiaValor(2,5);
        break;
        case 7:
            System.out.println("7. Sustituir todas las apariciones de un número por otro");
            misNumeros.sustituir(90,60);
        break;
        case 8:
            System.out.println("8. Intercambiar los valores de 2 posiciones");
            misNumeros.intercambiar(2,4);
        break;
        case 9:
            System.out.println("9. Ordenar el vector de menor a mayor, sin mostrarlo");
            misNumeros.ordenar();
        break;
        
        case 0:
            System.out.println("SALIENDO...");
        break;    
        
        default:
            System.out.println("Opción inválida, 1-9");
        break;
        
    }  
        
        
    }while (opcion != 0);
    
    
    
}
    
}
