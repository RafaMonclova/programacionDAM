
package listas;
import java.util.*;

public class ejemploPila {
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    String cadena = sc.nextLine();
    
    Queue<Character> cola = new LinkedList<>();
    Stack<Character> pila = new Stack<>();
        
    int longitud = cadena.length();
    
    //Llenamos la cola y la pila con los valores de la frase
    for(int i = 0;i<longitud;i++){
        
        cola.offer(cadena.charAt(i));
        pila.push(cadena.charAt(i));
        
    }
    
    System.out.println("Cola: "+cola);
    System.out.println("Pila: "+pila);
    
    //Comparamos la pila y la cola para decidir si la cadena es palíndromo o no
    //Empezamos con que es palíndromo, pero si algún carácter no es igual, deja de serlo
    boolean palindromo = true;
    while(!cola.isEmpty()){
        
        if(cola.poll() != pila.pop()){
            palindromo = false;//Si un carácter es distinto, ya no es palíndromo
        }
        
    }
    
    if(palindromo)
        System.out.println("La cadena es palíndromo");
    else
        System.out.println("La cadena NO es palíndromo");
    
    }
}
