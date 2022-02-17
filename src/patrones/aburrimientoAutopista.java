
package patrones;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aburrimientoAutopista {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int matriculas = sc.nextInt();

    String matriculaEdu, matricula;
    String numerosEdu, numeros, letrasEdu, letras;
    int viejos, nuevos;

    for (int i = 0; i < matriculas; i++) {
        
        //System.out.println("Introduce matricula de Edu");
        matriculaEdu = sc.next();
        numerosEdu = matriculaEdu.substring(0, 4);
        letrasEdu = matriculaEdu.substring(4, 7);

        nuevos = 0; 
        viejos = 0;
        
        while (sc.hasNext()) {

            //System.out.println("Introduce matricula a comparar");
            matricula = sc.next();
            if (matricula.equals("0")) {
                break;
            }

            numeros = matricula.substring(0, 4);
            letras = matricula.substring(4, 7); 

            if (letrasEdu.equals(letras)) {
                if (numeros.compareTo(numerosEdu) < 0){
                    viejos++;
                }
                else 
                    nuevos++;
                }
            else {
                if (letrasEdu.compareTo(letras) < 0){
                    nuevos++;
                }   
                else 
                    viejos++;
                }

        }
        System.out.println(viejos + " " + nuevos);
        }

    }
}
