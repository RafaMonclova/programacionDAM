
package patrones;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejemplo1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    Pattern pat = Pattern.compile(".es$");
    System.out.println("Pongame un enlace y te diré si nes español");
    String enlace = sc.nextLine();
    Matcher mat = pat.matcher(enlace);    
        
    if(mat.find()){
        System.out.println("Es español");
        
    }else {
        System.out.println("NO es español");
        
    }    
       
        
    }
}
