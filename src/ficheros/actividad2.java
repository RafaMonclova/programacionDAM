/*
Al programa anterior agrega las líneas de código necesarias para
mostrar:
 Si se puede leer
 Si se puede escribir
 Tamaño
 Si es un directorio
 Si es un fichero
 */
package ficheros;

import java.io.File;

/**
 *
 * @author alumno
 */
public class actividad2 {
    
    public static void main(String[] args){
        
        File f = new File("fichero.txt");
        System.out.println("Nombre: "+f.getName());
        System.out.println("Directorio: "+f.getParent());
        System.out.println("Ruta relativa: "+f.getPath());
        System.out.println("Ruta absoluta: "+f.getAbsolutePath());
        
        System.out.println("Se puede leer?: "+f.canRead());
        System.out.println("Se puede escribir?: "+f.canWrite());
        System.out.println("Tamaño: "+f.length());
        System.out.println("Es directorio?: "+f.isDirectory());
        System.out.println("Es ficheri?: "+f.isFile());
        
    }
    
    
    
    
}
