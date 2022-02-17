
package javaapplication1;
import java.util.*;

public class repeticiones2_3 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);    
        
    
    System.out.println("Cuantos salarios quieres introducir?");
    int contadorSalarios = sc.nextInt();
    int maximo=Integer.MIN_VALUE;
    
    for(int i = 1;i<=contadorSalarios;i++){
       
       System.out.println("Introduce salario "+i);
       int salario = sc.nextInt(); 
       
       if (salario > maximo){
           maximo=salario;
                 
       }  
        
    } 
    System.out.println("El salario más alto es: "+maximo);
          
    }
}
