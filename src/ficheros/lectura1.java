/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class lectura1 {
    
    public static void main(String[] args) throws IOException{
        
        FileReader is = null;
        String salida = "";
        try{
            
            is = new FileReader("publicaciones.txt");

            int c;
            while((c = is.read()) != -1){
                
                salida+=(char)c;
            }
            
        }catch(IOException e){
            
            System.out.println("Error al acceder al archivo");
            
        }
        
        finally{
            
            if(is != null){
                is.close();
            }
            System.out.println(salida);
            
        }
        
        
    }
    
    
}
