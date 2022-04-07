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
public class escritura3 {
    
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce fichero 1");
        String f1 = sc.nextLine();
        System.out.println("Introduce fichero 2");
        String f2 = sc.nextLine();
        
        FileReader is = null;
        FileWriter os = null;
        
        try{
            
            is = new FileReader(f1);
            os = new FileWriter(f2,true);
            
            int c;
            
            while((c = is.read()) != -1){
                
                os.write(c);
                if ((char)c=='\n'){
                     os.write(c);
                }
                
            }
            
        }catch(IOException e){
            System.out.println("ERROR");
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
