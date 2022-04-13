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
        
        try {
            
            br = new BufferedReader(new FileReader(fichero));
            
            String linea;
            int contLineas = 0;
            while((linea = br.readLine()) != null){
                contLineas++;
                salida += linea;
                if(contLineas == numLineas){  
                    break;
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
        
        System.out.println("SALIDA");
        System.out.println(salida);
        
        
        
    }
    
    
    
    
}
