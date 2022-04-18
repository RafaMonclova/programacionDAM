/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.File;
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
public class Fichero {
    
    public int tamañoFichero(String fichero){
        
        File f = new File(fichero);
        
        int tamaño = (int)f.length();
        
        return tamaño;
        
    }
    
    public String contenidoFichero(String fichero){
        
        BufferedReader br = null;
        String salida = "";
        try {
            
            br = new BufferedReader(new FileReader(fichero));
            
            String linea;
            
            while((linea = br.readLine()) != null){
                
                salida += linea;
                
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        } catch (IOException ex) {
            System.out.println("Error");
        }
        finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        
        return salida;
        
    }
    
    public int lineasFichero(String fichero){
        
        BufferedReader br = null;
        int contLineas = 0;
        try {
            
            br = new BufferedReader(new FileReader(fichero));
            
            String linea;
            
            while((linea = br.readLine()) != null){
                
                contLineas++;
                
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        } catch (IOException ex) {
            System.out.println("Error");
        }
        finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        
        return contLineas;
        
    }
    
    public void escribirFichero(String fichero, String texto, boolean modo){
        
        PrintWriter pw = null;
  
        try {
            
             pw = new PrintWriter(new FileWriter(fichero),modo);
                pw.println(texto);
            /*
            
            if(modo){
                pw = new PrintWriter(new FileWriter(fichero),true);
                pw.println(texto);
            }
            else{
                pw = new PrintWriter(new FileWriter(fichero));
                pw.println(texto);
            }
*/
            
            
        } catch (IOException ex) {
            System.out.println("Error");
        }
        finally{
            pw.close();
        }
        
    }
    
    public void copiarFichero(String origen, String destino){
        
        BufferedReader br = null;
        PrintWriter pw = null;
        
        try {
            
            br = new BufferedReader(new FileReader(origen));
            pw = new PrintWriter(new FileWriter(destino));
            
            String linea;
            
            while((linea = br.readLine()) != null){
                pw.println(linea);   
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        } catch (IOException ex) {
            System.out.println("Error");
        }
        finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error");
            }
            pw.close();
        }
        
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce nombre del fichero");
        String fichero = sc.nextLine();
        
        
        
    }
    
    
    
    
}
