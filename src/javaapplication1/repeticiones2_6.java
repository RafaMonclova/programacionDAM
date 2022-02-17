
package javaapplication1;
import java.util.*;

public class repeticiones2_6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
    
    System.out.println("Introduce un numero");
    int num = sc.nextInt();  
    int contador=0;
    
    for(int i=0;i<num;i++){
	int divisor=0;
	for(int j=1;j<=i;j++){
            if(i%j==0){
            divisor++;
            }
            
	}
        
        if (divisor==2){
                System.out.println("Primo: "+ i);
                contador++;
                
            }
        
	}
    System.out.println("Cantidad: "+contador);
}
}

 