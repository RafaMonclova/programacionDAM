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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

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
            System.out.println("Qué tipo de publicación desea añadir? (L)Libro, (C)Conferencia, (S)Salir");
            tipo = sc.next().charAt(0);
            switch(tipo){
                case 'L':
                    int numRegistroL = listaPublicaciones.size();
                    sc.nextLine();
                    System.out.println("Título:");
                    String tituloL = sc.nextLine();
                    System.out.println("Cuántos autores tiene?");
                    int numAutoresL = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Autor> listaAutoresL = new ArrayList();
                    for (int i = 0; i < numAutoresL; i++) {
                        System.out.println("Nombre autor "+(i+1));
                        String nombreL = sc.nextLine();
                        System.out.println("Apellidos autor "+(i+1));
                        String apellidosL = sc.nextLine();
                        Autor aL = new Autor(nombreL,apellidosL);
                        listaAutoresL.add(aL);
                    }
                    
                    System.out.println("Fecha de publicación: (dd/mm/aa)");
                    String fechaString = sc.nextLine();
                    String[] fechaLSeparado = fechaString.split("\\/");
                    int diaL = Integer.parseInt(fechaLSeparado[0]);
                    int mesL = Integer.parseInt(fechaLSeparado[1]); 
                    int añoL = Integer.parseInt(fechaLSeparado[2]);
                    
                    Fecha fechaL = new Fecha(diaL,mesL,añoL);
                    
                    System.out.println("Géneros:");
                    System.out.println("Ciencias biológicas (B)");
                    System.out.println("Ciencias de la salud y el deporte (S)");
                    System.out.println("Matemáticas (M)");
                    System.out.println("Tecnología (T)");
                    System.out.println("Historia, cultura y sociedad (H)");
                    System.out.println("Informática (I)");
                    System.out.println("Ciencias de la tierra y el espacio (G)");
                    System.out.println("Física y química (F)");
                    System.out.println("Artes y oficios (A)");
                    
                    System.out.println("Introduzca el género:");
                    String generoL = sc.nextLine();
                    System.out.println("ISBN:");
                    long isbn = sc.nextLong();
                    System.out.println("Costo:");
                    double costo = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Descripción:");
                    String descripcion = sc.nextLine();
                    
                    Libro libro = new Libro("R"+numRegistroL,tituloL,listaAutoresL,fechaL,generoL,isbn,costo,descripcion);
                    listaPublicaciones.add(libro);
                    
                    numRegistroL++; 
                    break;
                case 'C':
                    int numRegistroC = listaPublicaciones.size();
                    sc.nextLine();
                    System.out.println("Título:");
                    String tituloC = sc.nextLine();
                    System.out.println("Cuántos autores tiene?");
                    int numAutoresC = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Autor> listaAutoresC = new ArrayList();
                    for (int i = 0; i < numAutoresC; i++) {
                        System.out.println("Nombre autor "+(i+1));
                        String nombreC = sc.nextLine();
                        System.out.println("Apellidos autor "+(i+1));
                        String apellidosC = sc.nextLine();
                        Autor aC = new Autor(nombreC,apellidosC);
                        listaAutoresC.add(aC);
                    }
                    
                    System.out.println("Fecha de publicación: (dd/mm/aa)");
                    String fechaStringC = sc.nextLine();
                    String[] fechaCSeparado = fechaStringC.split("\\/");
                    int diaC = Integer.parseInt(fechaCSeparado[0]);
                    int mesC = Integer.parseInt(fechaCSeparado[1]); 
                    int añoC = Integer.parseInt(fechaCSeparado[2]);
                    
                    Fecha fechaC = new Fecha(diaC,mesC,añoC);
                    
                    System.out.println("Géneros:");
                    System.out.println("Ciencias biológicas (B)");
                    System.out.println("Ciencias de la salud y el deporte (S)");
                    System.out.println("Matemáticas (M)");
                    System.out.println("Tecnología (T)");
                    System.out.println("Historia, cultura y sociedad (H)");
                    System.out.println("Informática (I)");
                    System.out.println("Ciencias de la tierra y el espacio (G)");
                    System.out.println("Física y química (F)");
                    System.out.println("Artes y oficios (A)");
                    
                    System.out.println("Introduzca el género:");
                    String generoC = sc.nextLine();
                    
                    System.out.println("Introduzca el nombre de la conferencia");
                    String nombre = sc.nextLine();
                    System.out.println("Introduzca la ubicación");
                    String ubicacion = sc.nextLine();
                    
                    Conferencia conferencia = new Conferencia("R"+numRegistroC,tituloC,listaAutoresC,fechaC,generoC,nombre,ubicacion);
                    listaPublicaciones.add(conferencia);
                    
                    numRegistroC++;
                    
                    break;
                case 'S':
                    System.out.println("VOLVIENDO AL MENÚ...");
                    break;
                default:
                    System.out.println("Opción inválida. Introduzca: (L)Libro, (C)Conferencia");
                    break;
            }
            
            
           
            
        } while (tipo!='S');
        
        
        
    }
    
    /**
     * Busca publicaciones por una palabra clave dada
     * @param palabraClave Recibe una cadena con la palabra a buscar
     * @return Devuelve una lista con las publicaciones que coinciden con la palabra a buscar
     */
    public ArrayList<Publicacion> buscarPublicacion(String palabraClave){
        
        ArrayList<Publicacion> publicacionesEncontradas = new ArrayList();
        
        for(Publicacion p : listaPublicaciones){
            
            //Llama al método buscarPalabra() creado en la clase Publicacion y sus subclases. Si encuentra la palabra en p, devuelve true y se añade p a la lista de encontradas
            if(p.buscaPalabra(palabraClave)){
                publicacionesEncontradas.add(p);
                
            }
            
        }
        
        //Collections.sort(publicacionesEncontradas);
        return publicacionesEncontradas;
        
    }
    
    /**
     * Filtra las publicaciones que son de tipo Conferencia
     * @return Devuelve una lista de publicaciones que son conferencias
     */
    public ArrayList<Publicacion> listadoConferencias(){
        
        ArrayList<Publicacion> conferencias = new ArrayList();
        
        for(Publicacion p : listaPublicaciones){
            
            if(p.getClass().getName().equals("entregaBiblioteca.Conferencia")){
                conferencias.add(p);
            }
            
        }
        
        return conferencias;
    }
    
    /**
     * Imprime por pantalla las publicaciones de cada autor. Crea un mapa de autores y lista de publicaciones de cada uno
     */
    public void autores(){
        
        Map<Autor,ArrayList<Publicacion>> mapa = new HashMap<>();
              
        //Recorremos todas las publicaciones
        for(Publicacion p : listaPublicaciones){
            
            //Por cada publicación, recorremos la lista de autores de esta
            for (int i = 0; i < p.listaAutores.size(); i++) {
                
                //Creamos una lista para almacenar las publicaciones del autor del índice. La lista se rellena con el método publicacionesAutor(), y se crea la entrada en el mapa
                ArrayList<Publicacion> publicacionesAutor = publicacionesAutor(p.listaAutores.get(i));
                
                mapa.put(p.listaAutores.get(i), publicacionesAutor);
                    
            }   
            
        }
        
        //Elimina entradas repetidas del mapa
        Collection list = mapa.values();
        for(Iterator itr = list.iterator(); itr.hasNext();){
            if(Collections.frequency(list, itr.next())>1){
                itr.remove();
            }
        }
        
        //Imprime el mapa sin las entradas repetidas
        Iterator it = mapa.keySet().iterator();
        while(it.hasNext()){
            Autor key  = (Autor) it.next();
            ArrayList<Publicacion> value = mapa.get(key);
            
            System.out.println("Autor: "+key +"\n"+ "Publicaciones: "+value+"\n");
            
            
        }
        
        
    }
    
    /**
     * Devuelve una lista con las publicaciones del autor recibido 
     * @param a Recibe un autor al que buscar sus publicaciones
     * @return Devuelve la lista de publicaciones del autor
     */
    public ArrayList<Publicacion> publicacionesAutor(Autor a){
        
        ArrayList<Publicacion> publicacionesAutor = new ArrayList();
        
        for(Publicacion p : listaPublicaciones){
            
            for (int i = 0; i < p.listaAutores.size(); i++) {
                if(p.listaAutores.get(i).getNombre().equals(a.getNombre()) && p.listaAutores.get(i).getApellidos().equals(a.getApellidos())){
                    publicacionesAutor.add(p);
                }
            }
            
            
        }
        
        return publicacionesAutor;
        
    }
 
    public static void main(String[] args) {
        
        //Crea una biblioteca con las publicaciones recibidas en el archivo "publicaciones.txt"
        Biblioteca biblio = new Biblioteca("publicaciones.txt");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------------------------");
        System.out.println("--BIBLIOTECA CECILIO JIMÉNEZ RUEDA--");
        System.out.println("------------------------------------");
   
        int opcion;
        
        
        do {
            System.out.println("1.Mostrar publicaciones");
            System.out.println("2.Añadir publicación");
            System.out.println("3.Buscar publicación");
            System.out.println("4.Mostrar autores registrados");
            System.out.println("5.Listado de conferencias");
            System.out.println("0.SALIR");
            System.out.println("Introduzca una opción:");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                
                case 1:
                    System.out.println("1.Mostrar publicaciones");
                    System.out.println(biblio);
                    break;
                case 2:
                    System.out.println("2.Añadir publicación");
                    biblio.agregarPublicacion();
                    break;
                case 3:
                    System.out.println("3.Buscar publicación");
                    System.out.println("Introduzca una palabra clave para la búsqueda:");
                    String palabraClave = sc.nextLine();
                    System.out.println(biblio.buscarPublicacion(palabraClave));
                    break;
                case 4:
                    System.out.println("4.Mostrar autores registrados");
                    biblio.autores();
                    break;
                case 5:
                    System.out.println("5.Listado de conferencias");
                    System.out.println(biblio.listadoConferencias());
                    break;
                case 0:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR, introduzca una opción válida(1-5)");
                    break;
                
         
            }
            
            
        } while (opcion != 0);
        
   
        
    }
    

} 