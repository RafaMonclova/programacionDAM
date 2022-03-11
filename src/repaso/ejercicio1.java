package repaso;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class ejercicio1 {

    private static int[] aleatorio;

    private static int comprobarAleatorio(int numero) {
        boolean aparece = false;
        for (int i = 0; i < aleatorio.length; i++) {

            if (aleatorio[i] == numero) {
                aleatorio[i] = 0;
                aparece = true;
                break;
            }

        }

        if (aparece) {
            return 0;
        } else {
            return numero;
        }

    }

    private static void rellenarVectorAleatorio(int longitud) {

        aleatorio = new int[longitud];

        for (int i = 0; i < aleatorio.length; i++) {
            int numAleatorio = (int) ((Math.random() * 50) + 1);

            while (comprobarAleatorio(numAleatorio) == 0) {
                numAleatorio = (int) ((Math.random() * 50) + 1);

            }
            aleatorio[i] = numAleatorio;

        }

    }

    private static void rellenarComprobarRepetidos(int[][] miMatriz, int numGenerar) {

        rellenarVectorAleatorio(miMatriz.length * miMatriz[0].length);
        int numAleatorio = (int) ((Math.random() * numGenerar) + 1);
        for (int i = 0; i < miMatriz.length; i++) {

            for (int j = 0; j < miMatriz[i].length; j++) {

                miMatriz[i][j] = aleatorio[i + j];

            }

        }

    }

    private static void visualizarMatriz(int[][] miMatriz) {

        for (int i = 0; i < miMatriz.length; i++) {

            for (int j = 0; j < miMatriz[i].length; j++) {

                System.out.print(miMatriz[i][j] + " ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce valor entero positivo de la 'fila':");
        int filas = sc.nextInt();
        System.out.println("Introduce valor entero positivo de la 'columna':");
        int columnas = sc.nextInt();
        System.out.println("¿Cual es el número máximo de valores aleatorios sin repetir que deseas generar?:");
        int numGenerar = sc.nextInt();
        int[][] miMatriz = new int[filas][columnas];

        rellenarComprobarRepetidos(miMatriz, numGenerar);
        visualizarMatriz(miMatriz);

    }

}
