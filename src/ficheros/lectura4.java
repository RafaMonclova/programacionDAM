/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class lectura4 {
    
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del fichero");
        String fichero = sc.nextLine();
        
        FileReader is = null;
        
        try {
            is = new FileReader(fichero);
            
            int c;
            int contLineas = 0;
            while((c = is.read()) != -1){
                
                if((char)c == '\n'){
                    contLineas++;
                }
                
            }
            
            System.out.println("El fichero tiene "+contLineas+" lineas");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error al leer el fichero");
        }
        finally{
            if(is != null){
                is.close();
            }
        }
        
    }
    
    
}
