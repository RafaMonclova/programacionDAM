package javaapplication1;

import java.util.Scanner;

public class anoActual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivine mi año de nacimiento");
        int año = sc.nextInt();
        int añoActual = 1997, errores = 0;
        while (año != añoActual) {
            System.out.println("no es esa,vuelva a probar");
            año = sc.nextInt();
            errores++;
        }
        System.out.println("Enhorabuena,has fallado: " + errores + " veces");
    }
}
