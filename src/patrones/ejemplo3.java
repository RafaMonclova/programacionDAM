
package patrones;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejemplo3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Pattern pat = Pattern.compile("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
    
    String cadena = sc.nextLine();
    Matcher mat = pat.matcher(cadena);
    
    if (mat.matches()){
        
        System.out.println("EMAIL VALIDO: " +cadena);
        
        
    }   else {System.out.println("EMAIL INVALIDO");} 
        
        
        
        
        
    }
}
