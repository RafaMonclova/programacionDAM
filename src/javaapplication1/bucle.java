
package javaapplication1;
import java.util.Scanner;
public class bucle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int contador=0;
       
            while (num<0 || num >9){
                    System.out.println("Introduce un numero valido");
                    num=sc.nextInt();
                    
                }
            
            while (contador<=10){
                
                System.out.println(num+" X "+contador+" ="+(num*contador));
                contador++;
            }
               
 
        
        
        
        
        
        
        
    }
    }
