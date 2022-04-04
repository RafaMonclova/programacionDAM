/*
Desarrolla un programa que cree un nuevo directorio con nombre
“nuevodir” en el directorio actual, a continuación crea dos ficheros
cuyos nombres son “fichero1.txt” y “fichero2.txt” vacíos en dicho
directorio y uno de ellos se debe renombrar a “fichero1nuevo.txt”.
A continuación borra el fichero2.txt
 */
package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class actividad3 {
    
    public static void main(String[] args){
        
        File nuevodir = new File("nuevodir");
        nuevodir.mkdir();
        File f1 = new File(nuevodir,"fichero1.txt");
        File f2 = new File(nuevodir,"fichero2.txt");
        
        try {
            if(f1.createNewFile()){
                System.out.println("Fichero 1 creado");
            }
            else
                System.out.println("Fichero 1 YA EXISTE");
            
            if(f2.createNewFile()){
                System.out.println("Fichero 2 creado");
            }
            else
                System.out.println("Fichero 2 YA EXISTE");
            
            if(f1.renameTo(new File(nuevodir,"nuevofichero1.txt"))){
                System.out.println("Fichero 1 renombrado");
            }
            
            
            if(f2.delete()){
                System.out.println("Fichero 2 borrado");
            }
            
            
            
        } catch (IOException ex) {
            System.err.println("ERROR");
        }
        
        
    } 
    
}
