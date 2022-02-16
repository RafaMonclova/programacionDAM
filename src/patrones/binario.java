/*
pida al usuario un número binario y mediante expresiones regulares determine si lo es o
no. 
 */
package patrones;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class binario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero binario");
        String num = sc.nextLine();
        
        Pattern pat = Pattern.compile("^[0-1]+$");
        Matcher mat = pat.matcher(num);
        
        
        if (mat.matches()){
            System.out.println("Correcto, es binario");
            
            
        }else{System.out.println("Incorrecto,no es binario");}
    }
}
