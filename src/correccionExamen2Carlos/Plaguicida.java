/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author carlosroco
 */
public class Plaguicida {

    private int[][] campo = new int[4][4];

    public Plaguicida() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                campo[i][j] = generarAleatorio(1, 9);
            }
        }
    }

    private int generarAleatorio(int min, int max) {
        int num = (int) (Math.random() * ((max + 1) - min)) + min;
        return num;
    }

    public void glisofato() {
        int X = generarAleatorio(0, 3);
        int Y = generarAleatorio(0, 3);
        int potencia = generarAleatorio(1, 3);
        int potencia_imprimir = potencia;

        while (potencia > 0) {
            for (int i = (X - (potencia - 1)); i <= (X + (potencia - 1)); i++) {
                for (int j = (Y - (potencia - 1)); j <= (Y + (potencia - 1)); j++) {
                    if (existe(i) && existe(j)) {
                        campo[i][j] -= 1;
                        if (campo[i][j] < 0) {
                            campo[i][j] = 0;
                        }
                    }
                }
            }
            potencia--;
        }
        System.out.println("X:" + X);
        System.out.println("Y:" + Y);
        System.out.println("potencia:" + potencia_imprimir);

    }

    private boolean existe(int num) {
        if (num >= 0 && num < campo.length) {
            return true;
        }
        return false;
    }

    public void mostrar() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(campo[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public boolean eliminado() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (campo[i][j] > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Plaguicida P = new Plaguicida();
        P.mostrar();
        while (!P.eliminado()) {
            P.glisofato();
            P.mostrar();
        }
    }

}
