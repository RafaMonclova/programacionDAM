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
public class ejemploFileReader {
    
    public static void main(String[] args) throws IOException{
        
        FileReader is = null;
        FileWriter os = null;
        
        try{
            
            is = new FileReader("biblioteca.xml");
            os = new FileWriter("biblioteca_copy.xml");
            
            //Los caracteres se guardan como enteros para usar read(), 
            //que se tiene que comparar con -1
            int c;
            while((c = is.read()) != -1){
                System.out.print((char)c);
                os.write(c);
            }
            
        }catch(IOException e){
            
            System.out.println("Error al acceder al archivo");
            
        }
        
        finally{
            
            if(is != null){
                is.close();
            }
            if(os != null){
                os.close();
            }
            
        }
        
        
    }
    
    
}
