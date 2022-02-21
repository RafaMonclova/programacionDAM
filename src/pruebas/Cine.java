package pruebas;

import java.util.*;

public class Cine {

    static void añadir(Queue<String> lista) {

        int edad_random = (int) ((Math.random() * 55) + 5);
        lista.add("" + edad_random);

    }
    public static void main(String[] args) {
        Queue<String> lista = new LinkedList<>();
        lista.add("20");
        lista.add("30");
        lista.add("18");
        Scanner sc = new Scanner(System.in);
        int SiNo;
        

        do {
            System.out.println("Quieres añadir a alguien a la cola?");
            SiNo = sc.nextInt();
            if (SiNo == 1) {
                añadir(lista);

            } else {
                System.out.println("Cerrando...");
                break;
            }


        } while (SiNo != 1);

        
        System.out.println(lista);



        int total = lista.size()*5;
        System.out.println("La media era de: "+total);

    }
}