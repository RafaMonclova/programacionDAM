/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class escritura3Linea {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce fichero 1");
        String f1 = sc.nextLine();
        System.out.println("Introduce fichero 2");
        String f2 = sc.nextLine();
        
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new FileReader(f1));
            pw = new PrintWriter(new FileWriter(f2));
            
            String linea;
            
            while((linea = br.readLine()) != null){
                pw.println(linea);
                pw.println("\n");
                pw.println("\n");
            }
            
        } catch (FileNotFoundException ex) {
           
            System.out.println("ERROR, fichero no encontrado");    
            
        }catch(IOException e){
            System.out.println("ERROR de E/S");
        }
        finally{
           
                pw.close();
            
        }
    
        
    }
    
    
    
    
}
