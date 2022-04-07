/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class lectura2 {
    
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        FileReader is = null;
        
        System.out.println("Introduce número de caracteres a leer");
        int numChars = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce nombre del fichero a leer");
        String fichero = sc.nextLine();
        File f = new File(fichero);
         
        
        try{
            
            is = new FileReader(fichero);
            int c;
            int contC = 0;
            
            while((c = is.read()) != -1){
                if(f.length() < numChars){
                    System.err.println("El fichero es demasiado pequeño");
                    break;
                }
                    
                contC++;
                System.out.println((char)c);
                if(contC == numChars)
                    break;
                
                
            }
            
            
            
        }catch(IOException e){
            System.out.println("Error al acceder al archivo");
        }
        
        finally{
            if(is != null){
                is.close();
            }
            
        }
        
    }
    
    
}
