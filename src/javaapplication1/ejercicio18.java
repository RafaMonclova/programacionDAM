package javaapplication1;

import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int num = sc.nextInt();
        int unidades = num % 10;
        int decenas = num / 10;

        switch (decenas) {
            case 1:
                System.out.print("dieci");
                break;
            case 2:
                System.out.print("veinti");
                break;
            case 3:
                System.out.print("treintai");
                break;
            case 4:
                System.out.print("cuarentai");
                break;
            case 5:
                System.out.print("cincuentai");
                break;
            case 6:
                System.out.print("sesentai");
                break;
            case 7:
                System.out.print("setentai");
                break;
            case 8:
                System.out.print("ochentai");
                break;
            case 9:
                System.out.print("noventai");
                break;
        }

        switch (unidades) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.print("ocho");
                break;
            case 9:
                System.out.print("nueve");
                break;
        }
    }
}
