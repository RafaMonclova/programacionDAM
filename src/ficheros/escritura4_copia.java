/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author rafa
 */
public class escritura4_copia {
    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce fichero 1");
        String fichero1 = sc.nextLine();
        System.out.println("Introduce fichero 2");
        String fichero2 = sc.nextLine();
        System.out.println("Introduce fichero 3");
        String fichero3 = sc.nextLine();
        
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        PrintWriter pw = null;
        
        int contLineas = 0;
        try {
            
            br1 = new BufferedReader(new FileReader(fichero1));
            pw = new PrintWriter(new FileWriter(fichero3));
            
            String linea;
            
            while((linea = br1.readLine()) != null){
                
                contLineas++;
                if(contLineas % 2 == 0){
                    pw.println(linea);
                }
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("error");
        } catch (IOException ex) {
            System.out.println("error");
        }
        finally{
            try {
                br1.close();
            } catch (IOException ex) {
                System.out.println("error");
            }
            pw.close();
        }
        
        try {
            
            br2 = new BufferedReader(new FileReader(fichero2));
            pw = new PrintWriter(new FileWriter(fichero3));
            
            String linea = "";
            
            while((linea = br2.readLine()) != null){
                
                contLineas++;
                if(contLineas % 2 != 0){
                    pw.println(linea);
                }
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("error");
        } catch (IOException ex) {
            System.out.println("error");
        }
        finally{
            try {
                br2.close();
            } catch (IOException ex) {
                System.out.println("error");
            }
            pw.close();
        }
        
    }
    
    
    
}
