
package javaapplication1;
import java.util.Scanner;

public class ejercicio14 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in); 
    int a,b,c,menor=0,mayor=0,medio=0;
    System.out.println("Introduce num 1");
     a=sc.nextInt();
    System.out.println("Introduce num 2");
    b=sc.nextInt();
    System.out.println("Introduce num 3");
     c=sc.nextInt();
     
     if (a<b && a<c){
       menor = a; 
       if (b<c){
           medio = b;
           mayor = c;
       }
       else{
           mayor = b;
           medio = c;
       }
     }
     if (b<c && b<a){
         menor=b;
         if (c>a){
             medio= a;
             mayor= c;
         }
         else{
             medio = c;
             mayor = a;
         }
     }
     if (c<a && c<b){
         menor= c;
         if (b>a){
             mayor = b;
             medio = a;
         }
         else{
             mayor = a;
             medio = b;
         }
     }
     System.out.println("El orden descendente es: "+ mayor + medio + menor);
  }  
}
