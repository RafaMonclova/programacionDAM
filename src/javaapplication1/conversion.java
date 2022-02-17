
package javaapplication1;
import java.util.*;

public class conversion {
    public static void main(String[] args){
    //Scanner sc = new Scanner(System.in);    
    
    String numString = "123";
    System.out.println("String: "+numString);
    
    
    long numLong = Long.parseLong(numString);
    System.out.println("Long: "+numLong);
    
    
    int numInt = Integer.parseInt(numString);
    System.out.println("Int: "+numInt);    
        
        
    short numShort = Short.parseShort(numString);
    System.out.println("Short: "+numShort);    
        
    
    byte numByte = Byte.parseByte(numString);
    System.out.println("Byte: "+numByte);
    
    
    double numDouble = Double.parseDouble(numString);
    System.out.println("Double: "+numDouble);
    
    
    float numFloat = Float.parseFloat(numString);
    System.out.println("Float: "+numFloat);
    


/*****************************************************************/

    
   
    }
}
