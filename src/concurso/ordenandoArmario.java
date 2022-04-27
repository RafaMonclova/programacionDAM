package concurso;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class ordenandoArmario {   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int verano, invierno;

        while (true) {
            verano = 0;
            invierno = 0;
            cadena = sc.next();
            if (cadena.equals(".")) 
                break;
            while (true) {
                if (cadena.equals(".")) 
                    break;
                if (cadena.equals("V")) 
                    verano++;
                else if (cadena.equals("I")) 
                    invierno++;
                
                cadena = sc.next();
            }
            if (verano > invierno) {
                System.out.println("VERANO");
            }
            else if (invierno > verano) {
                System.out.println("INVIERNO");
            }
            else System.out.println("EMPATE");
        }

    }
              
        
}
    
