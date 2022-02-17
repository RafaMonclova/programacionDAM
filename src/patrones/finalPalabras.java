/*
De un texto (leer por fichero o teclado) mostrar las palabras que acaben
en ar er ir com por ejemplo vivir, lavar etc.. puedes pensar que las palabras 
se delimitan por espacios puntos o comas
 */
package patrones;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class finalPalabras {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //while(sc.hasNext()){
               
        
        String cadena = sc.nextLine();
        String palabra = "";
        
        cadena = cadena.trim();  
        cadena = cadena.replace(","," "); 
        cadena = cadena.replace("."," "); 
        
        Pattern pat = Pattern.compile("\\b(\\w+[aei]r)\\b");
        
        
        for (int i =0; i<cadena.length(); i++){
            if (cadena.charAt(i)==' '){
                
                palabra = cadena.substring(0,i);
                cadena = cadena.substring (i+1, cadena.length()); 
                Matcher mat = pat.matcher(palabra);
                if (mat.matches()) {
                    System.out.println(palabra);
                    }
                }
            palabra = cadena;
            }
        Matcher mat2 = pat.matcher(palabra);
        if (mat2.matches()) {
            System.out.println(palabra);
            }
            
        //}
    }
}

