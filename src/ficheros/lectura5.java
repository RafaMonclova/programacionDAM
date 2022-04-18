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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafa
 */
public class lectura5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del fichero");
        String fichero = sc.nextLine();
        System.out.println("Introduce el número de líneas");
        int numLineas = sc.nextInt();
        String salida = "";
        BufferedReader br = null;
        int contLineas = 0;
        try {
            
            br = new BufferedReader(new FileReader(fichero));
            
            String linea;
            
            while((linea = br.readLine()) != null && numLineas > 0){
                
                
                salida += linea + "\n";
                numLineas--;
                contLineas++;
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error");
        } catch (IOException ex) {
            System.err.println("Error");
        }
        finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.err.println("Error");
            }
        }
        
        System.out.println("SALIDA");
        
        if(numLineas > contLineas)
            System.out.println("EL FICHERO ES DEMASIADO PEQUEÑO!");
        else
            System.out.println(salida);
        
        
        
    }
    
    
    
    
}
