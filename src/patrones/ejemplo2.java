
package patrones;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejemplo2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Pattern pat = Pattern.compile("\\d{8}[A-Z]");
    String dni = sc.nextLine();    
    Matcher mat = pat.matcher(dni);    
        
    if(mat.matches()){
        
        System.out.println("DNI VALIDO: "+dni);
        
    }else {
        System.out.println("DNI INVALIDO");
    }    
        
    }
}
