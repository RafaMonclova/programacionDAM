
package arrayObjetos;
import java.util.*;

public class foreach {
    public static void main(String[] args){
    double[] nota = new double[4];
    System.out.println("Para calcular la nota media necesito saber la ");
    System.out.println("nota de cada uno de tus exámenes. ");
        
    for(int i = 0;i<nota.length;i++){
        
        System.out.println("Nota del exámen nº: "+(i+1));
        nota[i] = Double.parseDouble(System.console().readLine());
   
    }  

    System.out.println("Tus notas son: ");
    double suma = 0;
    for(double n : nota){ //bucle estilo for each
        System.out.println(n + " ");
        suma += n;
    }
    
    System.out.println("La media es: "+ suma / 4);
        
        
        
        
    }
}
