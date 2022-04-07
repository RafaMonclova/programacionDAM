/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class escritura1 {
    
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduzca el nombre del fichero");
        String fichero = sc.nextLine();
        
        FileWriter os = null;
        
        try{
                 
            os = new FileWriter(fichero,true);
            
            os.write(cadena);
            
            
        }catch(IOException ex){
            System.out.println("Error");
        }
        finally{
            os.close();
        }
        
        
        
        
    }
    
    
}
