
package ficheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Alumno {

String nombre;
int edad;


    public Alumno(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  
    
    public String toString(){
        return "Nombre: "+nombre+", "+"Edad: "+edad;
    }

    public void escribirFichero(String fichero){
        
        BufferedWriter bw = null;
        
    try {
        
        bw = new BufferedWriter(new FileWriter(fichero));
        bw.write(nombre + "\n");
        bw.write(edad + "\n");
        
        
    } catch (IOException ex) {
        System.out.println("ERROR");
    }
    finally{
            try {
                bw.close();
            } catch (IOException ex) {
                System.out.println("Error");
            }
    }
        
        
    }
    
    public void leerFichero(String fichero){
        
        BufferedReader br = null;
        
    try {
        
        br = new BufferedReader(new FileReader(fichero));
        nombre = br.readLine();
        edad = Integer.parseInt(br.readLine());
        
        
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
        
    }
    
    public static ArrayList<Alumno> leerListaAlumnos(String fichero){
        
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        BufferedReader br = null;
        
    try {
        
        br = new BufferedReader(new FileReader(fichero));
        String linea;
        
        while((linea = br.readLine()) != null){
            
            String [] parametros = linea.split("\\;");
            
            Alumno a = new Alumno(parametros[0],Integer.parseInt(parametros[1]));
            listaAlumnos.add(a);
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
        
        return listaAlumnos;
    }
    
    public static void escribirListaAlumnos(String fichero,ArrayList<Alumno> lista){
        
        BufferedWriter bw = null;
        
    try {
        
        bw = new BufferedWriter(new FileWriter(fichero));
        
        for(Alumno a : lista){
            
            /*
              bw.write(a.getNombre()+ ";");
             bw.write(a.getEdad()+ "\n");
            */
            bw.write(a.getNombre()+ ";"+a.getEdad()+ "\n");
        }
        
        
    } catch (IOException ex) {
        System.out.println("Error");
    }
    finally{
            try {
                bw.close();
            } catch (IOException ex) {
                System.out.println("Error");
            }
    }
        
    }
    
    public static void main(String[] args){
        
        ArrayList<Alumno> listaAlumnos = leerListaAlumnos("alumnos.txt");
        
        for(Alumno a : listaAlumnos){
            System.out.println(a);
        }
        
        escribirListaAlumnos("alumnos2.txt",listaAlumnos);
        
        
        //Alumno a = new Alumno("antonio",4);
        //a.escribirFichero("alumnos.txt"); -- Escribe el objeto a en el fichero
        //a.leerFichero("alumnos.txt"); -- Lee el fichero y asigna los datos al objeto a
        //System.out.println(a);
    }
    
}
