package patrones;

import java.util.*;

public class quintoMilenio {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNext()){
    int casos = sc.nextInt();

    sc.nextLine();
    
        for (int i = 0; i < casos; i++) {
            String palabra = sc.nextLine();
            String mensaje = sc.nextLine();
            
            palabra = palabra.toLowerCase().replace(" ", "");
            mensaje = mensaje.toLowerCase().replace(" ", "");
            
            if (palabra.length() > 2000) {
                break;
            }
            
            int contador = 0;
            boolean esIgual = false;
            
            for (int j = 0; j < palabra.length(); j++) {
                if (palabra.charAt(j) == mensaje.charAt(contador)) {
                    contador++;
                    if (contador == mensaje.length()) {
                        esIgual = true;
                        break;

                    }
                }
            } 
            
        if (esIgual){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
        }

    }
    }
}
