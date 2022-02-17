
package javaapplication1;
import java.util.*;

public class ejemploValores {
    public static void main(String[] args){
    Random rnd = new Random();

    int a1=rnd.nextInt();
    System.out.println(a1);

    a1=rnd.nextInt(100);
    System.out.println(a1);
        
    float a2=rnd.nextFloat();
    System.out.println(a2);
        
    double a3=rnd.nextDouble();
    System.out.println(a3);
        
    long a4=rnd.nextLong();
    System.out.println(a4);        
        
    boolean a5=rnd.nextBoolean();
    System.out.println(a5);        
        
        
    }
}
