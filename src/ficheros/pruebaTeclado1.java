/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alumno
 */
public class pruebaTeclado1 {
    
    public static void main(String[] args) {
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        double sumatorio = 0;
        for (int i = 0; i < 3; i++) {
            String cadenanumLeido = br.readLine();
            double numLeido = Double.parseDouble(cadenanumLeido);
            sumatorio += numLeido;
        }
        
        System.out.println("MEDIA: "+sumatorio / 3);
        
        } catch ( IOException e ){
            
            System.out.println("Error E/S");
            
        }
        
        
        
    }
    
   
    
    
}
