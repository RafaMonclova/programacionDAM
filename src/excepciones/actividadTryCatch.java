/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class actividadTryCatch {
    
    public static void main(String[] args) throws FileNotFoundException{
        try{
            
            Scanner sc = new Scanner(new File("cadena.txt"));
            while(sc.hasNext()){
                String cadena = sc.nextLine();
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    
                    System.out.println(cadena.charAt(i));
                    
                }
                
                
            }
            
            
            
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println("FIN DE LA CADENA");
            //ex.printStackTrace();
            }
    
    
    }
    
    
}
