/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class lectura3 {
    
    
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del fichero");
        String fichero = sc.nextLine();
        System.out.println("Introduzca el caracter a buscar");
        char buscado = sc.next().charAt(0);
        
        FileReader is = null;
        
        try{
            
            is = new FileReader(fichero);
            int c;
            int posicion=0;
            int contadorVeces = 0;
            
            while((c = is.read()) != -1){
                posicion++;
                if((char)c == buscado){ 
                    contadorVeces++;
                    System.out.println("posición: "+posicion);
                }
                    
                
            }
            
            System.out.println("El carácter "+buscado+" ha salido "+contadorVeces+" veces.");    
            
        }catch(IOException e){
            System.out.println("Error al acceder al archivo");
        }
        
        finally{
            if(is != null){
                is.close();
            }
        }
        
    }
    
    
}
