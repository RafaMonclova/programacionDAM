/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class pruebaTeclado2 {
    
    public static void main(String[] args) throws IOException{
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadenaLeida = "";
        String salida = "";

        do{
            System.out.println("Introduce una cadena");
            cadenaLeida = br.readLine();
            if(cadenaLeida.equals("-1")){
                break;
            }
            salida +=cadenaLeida + "\n";
            
            
            
        }while(!cadenaLeida.equals("-1"));
        
        System.out.println("SALIDA:");
        System.out.println(salida);
        
        
        
    }
    
}
