
package javaapplication1;
import java.util.*;

public class repeticiones2_7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce numero inicial: ");
        int n = sc.nextInt();
       
        System.out.println("Introduce numero final: ");
        int m = sc.nextInt();
       
        for(int i = n; i <= m; i++) {
            System.out.println("----TABLA DEL " + i + "-----");
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
      
        
    }
}
