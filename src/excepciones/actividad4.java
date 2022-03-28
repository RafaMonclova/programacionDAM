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
public class actividad4 {
    
    
    public static void main(String[] args){
        
        
        try{
            
            System.out.println("START");
            System.out.println("Try to open file");
            Scanner in = new Scanner(new File("test.in"));
            //Scanner in = new Scanner(new File("test.txt"));
            System.out.println("File found, procesing file...");
            System.out.println("END");
            
            
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found caught");
        }
        finally{
            System.out.println("Finally-block regardless of the state of exception");
        }
        
        
    }
    
}
