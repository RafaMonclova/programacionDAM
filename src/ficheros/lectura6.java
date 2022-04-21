/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class lectura6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del fichero");
        String fichero = sc.nextLine();
        System.out.println("Introduce la palabra a buscar");
        String palabra = sc.nextLine();
        int contPalabra = 0;
        BufferedReader br = null;
        
        try {
            
            br = new BufferedReader(new FileReader(fichero));
            
            String linea;
            int contLinea = 0;
            while((linea = br.readLine()) != null){
                contLinea++;
                if(linea.contains(palabra)){
                    System.out.println(palabra + " aparece en la linea "+contLinea);
                    contPalabra++;
                }
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        } catch (IOException ex) {
            System.out.println("Error");
        }
        finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        
        System.out.println("TOTAL: "+contPalabra+" veces");
        
        
        
        
    }
    
}
