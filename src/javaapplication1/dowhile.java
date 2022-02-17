
package javaapplication1;

import java.util.*;

public class dowhile {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);    
    int num = 1;

    do {
        
        System.out.println("introduce un numero mayor que 100");
        num = sc.nextInt();   
    }
    while (num <=100);    
        
        
    }
}
