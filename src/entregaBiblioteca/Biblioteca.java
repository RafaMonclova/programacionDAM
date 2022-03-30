package entregaBiblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */

public final class Biblioteca {          

    //Lista con las publicaciones que tiene la biblioteca
    ArrayList<Publicacion> listaPublicaciones = new ArrayList();
    
    
    /**
     * Crea una biblioteca con las publicaciones recibidas en el archivo mediante el método cargarPublicaciones()
     * @param nombreArchivo Recibe como String el nombre del archivo con las publicaciones 
     */
    public Biblioteca(String nombreArchivo){
        
        cargarPublicaciones(nombreArchivo);
        
    }
    
    /**
     * Carga publicaciones de un archivo dado
     * @param nombreArchivo Recibe como String el nombre del archivo con las publicaciones
     */            
    public void cargarPublicaciones (String nombreArchivo) {
        
        BufferedReader br=null;  
        try{             
            FileReader file = new FileReader(nombreArchivo);
            br = new BufferedReader (file);             
            int contReferencia = 0;//Se incrementa con cada publicación para guardar el número de referencia autoincrementado
            String linea;
            while ((linea=br.readLine())!=null){ 
                
                    //Escribe tu código aquí
                    
                    //Separamos cada línea usando ; como delimitador, para obtener los parámetros del constructor 
                    String[] separado = linea.split("\\;");
                    
                    //LIBROS
                    if(separado[0].equals("Libro")){
                        
                        //Contamos cuántos autores tiene el libro, y creamos una lista de autores vacía
                        int contAutores = Integer.parseInt(separado[1]);
                        ArrayList<Autor> autores = new ArrayList();
                        //La variable incremento se incrementa en 2 por cada vuelta del bucle, para obtener la cadena con los datos de los siguientes autores
                        int incremento = 0;
                        for (int i = 0; i < contAutores; i++) {
                            //Creamos un autor con el nombre y apellido, obtenido de la cadena separada, y se añade a la lista de autores
                            Autor a = new Autor(separado[3+incremento],separado[4+incremento]);
                            autores.add(a);
                            incremento = incremento+2;
                        }
                        
                        //Si el libro tiene 1 autor, lo crea cogiendo los datos de la línea sin alterar
                        if(contAutores == 1){
                            Libro libro = new Libro(("R"+contReferencia),separado[2],autores,new Fecha(Integer.parseInt(separado[7]),Integer.parseInt(separado[6]),Integer.parseInt(separado[5]))
                                ,separado[8],Long.parseLong(separado[9]),Double.parseDouble(separado[10]),separado[11]);
                            listaPublicaciones.add(libro);
                        }
                        //Si tiene más de 1 autor, se suma contAutores al índice de las cadenas que forman la línea, para poder obtener los parámetros que necesita el constructor
                        if(contAutores > 1){
                            Libro libro = new Libro(("R"+contReferencia),separado[2],autores,new Fecha(Integer.parseInt(separado[7+contAutores]),Integer.parseInt(separado[6+contAutores]),Integer.parseInt(separado[5+contAutores]))
                                ,separado[8+contAutores],Long.parseLong(separado[9+contAutores]),Double.parseDouble(separado[10+contAutores]),separado[11+contAutores]);
                            listaPublicaciones.add(libro);
                        }
                        
                        //Se añaden a la lista de publicaciones
                        
                    }
                    
                    //CONFERENCIAS
                    if(separado[0].equals("Conferencia")){
                        //Contamos cuántos autores tiene la conferencia, y creamos una lista de autores vacía
                        int contAutores = Integer.parseInt(separado[1]);
                        ArrayList<Autor> autores = new ArrayList();
                        //La variable incremento se incrementa en 2 por cada vuelta del bucle, para obtener la cadena con los datos de los siguientes autores
                        int incremento = 0;
                        for (int i = 0; i < contAutores; i++) {
                            //Creamos un autor con el nombre y apellido, obtenido de la cadena separada, y se añade a la lista de autores
                            Autor a = new Autor(separado[3+incremento],separado[4+incremento]);
                            autores.add(a);
                            incremento = incremento+2;
                        }
                        //Si la conferencia tiene 1 autor, lo crea cogiendo los datos de la línea sin alterar
                        if(contAutores == 1){
                            Conferencia conferencia = new Conferencia(("R"+contReferencia),separado[2],autores,new Fecha(Integer.parseInt(separado[7]),Integer.parseInt(separado[6]),Integer.parseInt(separado[5]))
                                ,separado[8],separado[9],separado[10]);
                            listaPublicaciones.add(conferencia);
                        }
                        //Si tiene más de 1 autor, se suma contAutores al índice de las cadenas que forman la línea, para poder obtener los parámetros que necesita el constructor
                        if(contAutores > 1){
                            Conferencia conferencia = new Conferencia(("R"+contReferencia),separado[2],autores,new Fecha(Integer.parseInt(separado[7+contAutores]),Integer.parseInt(separado[6+contAutores]),Integer.parseInt(separado[5+contAutores]))
                                ,separado[8+contAutores],separado[9+contAutores],separado[10+contAutores]);
                            listaPublicaciones.add(conferencia);
                        }
                        
                        //Se añaden a la lista de publicaciones
                        
                    }
                    
                //El contador se incrementa para que el número de registro sea autoincrementado por cada nueva publicación    
                contReferencia++;   
    
            }                
        
        }catch (FileNotFoundException ex){             
                System.out.printf("Archivo no encontrado\n");         
        }catch (IOException e){
                System.out.printf("Error lectura archivo");   
        } finally{
            if (br!=null)
                try {br.close();} catch (IOException ex){System.out.println(ex.getMessage());}
        }
    }

    /**
     * 
     * @return Devuelve la lista de publicaciones
     */
    public ArrayList<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    /**
     * 
     * @param listaPublicaciones Recibe una lista de publicaciones y la establece en el atributo
     */
    public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    } 
    
    /**
     * 
     * @return Devuelve las publicaciones de la biblioteca 
     */
    @Override
    public String toString() {
        
        String salida = "Biblioteca Cecilio Jimenez Rueda \n" ;
        
        for(Publicacion p : listaPublicaciones){
            
            salida += p + "\n";
            
        }
            
        return salida;
        
    }
    
    /**
     * Añade una nueva publicación a la biblioteca
     */
    public void agregarPublicacion(){
        
        Scanner sc = new Scanner(System.in);
        char tipo;
        do {
            System.out.println("Qué tipo de publicación desea añadir? (L)Libro, (C)Conferencia");
            tipo = sc.next().charAt(0);
            switch(tipo){
                case 'L':
                    break;
                case 'C':
                    break;
                default:
                    System.out.println("Opción inválida. Introduzca: (L)Libro, (C)Conferencia");
                    break;
            }
            
            
            
            
        } while (tipo!='L' || tipo != 'C');
        
        
        
    }
 
    public static void main(String[] args) {
        
        //Crea una biblioteca con las publicaciones recibidas en el archivo "publicaciones.txt"
        Biblioteca biblio = new Biblioteca("publicaciones.txt");
        System.out.println(biblio);
        
    }
    

} 