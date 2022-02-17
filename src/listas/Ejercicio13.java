package listas;

import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> alumnos = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            alumnos.put("DNI" + i, "NOMBRE" + i);
        }
        System.out.println("Digame le dni");
        String dni = sc.nextLine();
        
        Iterator it = alumnos.keySet().iterator();
        while(it.hasNext()){
            String key  = (String) it.next();
            if(key.equals(dni)){
                System.out.println(alumnos.get(key));
            }
        }
        
        
        
        
    }
}
