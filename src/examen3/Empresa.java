/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import fabrica.Producto;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class Empresa {
    
    private static ArrayList<Trabajador> lista = new ArrayList();
    
    /**
     * Graba el contenido de la lista a un fichero
     * @param fichero El fichero donde se guarda el contenido
     */
    public static void grabarLista(String fichero){
        
        PrintWriter pw = null;
        
        try {
            
            pw = new PrintWriter(new FileWriter(fichero));
            
            //Por cada trabajador se guarda su toString()
            for(Trabajador t : lista){
                pw.println(t);
            }
            
            System.out.println("--Se han grabado los datos al fichero "+fichero+"--");
            
        } catch (IOException ex) {
            System.out.println("Error de E/S");
        }
        
        finally{
            pw.close();
        }
     
        
    }
    
    /**
     * Carga el contenido de un fichero a la lista de trabajadores
     * @param fichero El fichero con los datos a cargar
     */
    public static void cargarLista(String fichero){
        
        
        BufferedReader br = null;
        
        try {
            
            br = new BufferedReader(new FileReader(fichero));
            
            String linea;
            
            //Por cada línea, se separa por ";".
            //Se crea el objeto dependiendo del tipo (parametros[0]) y se añade a la lista
            while((linea = br.readLine()) != null){
                
                String[] parametros = linea.split("\\;");
                
                if(parametros[0].equals("COMERCIAL")){
                    
                    Comercial c = new Comercial(parametros[1],parametros[2],Double.parseDouble(parametros[3]),Double.parseDouble(parametros[4]));
                    lista.add(c);
                }
                
                if(parametros[0].equals("TÉCNICO")){
                    
                    Tecnico t = new Tecnico(parametros[1],parametros[2],Double.parseDouble(parametros[3]),Integer.parseInt(parametros[4]));
                    lista.add(t);
                }
              
                
            }
            
            System.out.println("--Se han cargado los datos del fichero "+fichero+"--");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al acceder al fichero");
        } catch (IOException ex) {
            System.out.println("Error de E/S");
        }
        finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error de E/S");
            }
        }
 
        
    }
    
    /**
     * Muestra los trabajadores de la lista
     */
    public static void mostrarLista(){
        
        for (Trabajador t : lista) {
            
            System.out.println(t);
            
        }
        
    }
    
    /**
     * Ordena la lista de menor a mayor según lo que cobran los trabajadores
     */
    public static void ordenar(){
        
        Collections.sort(lista);
        
    }
    
    
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        do {
            
            System.out.println("1.Grabar lista a fichero");
            System.out.println("2. Cargar datos del fichero");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Ordenar");
            System.out.println("Introduce opcion");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                
                case 1:
                    System.out.println("Introduce el fichero para grabar los datos");
                    String ficheroGrabar = sc.nextLine();
                    grabarLista(ficheroGrabar);
                    break;
                case 2:
                    System.out.println("Introduce el fichero para cargar datos");
                    String ficheroCargar = sc.nextLine();
                    cargarLista(ficheroCargar);
                    break;
                case 3:
                    mostrarLista();
                    break;
                case 4:
                    System.out.println("Introduce el fichero para cargar datos");
                    String ficheroCargarOrdenada = sc.nextLine();
                    cargarLista(ficheroCargarOrdenada);
                    ordenar();
                    System.out.println("--LISTA ORDENADA--");
                    System.out.println("Introduce el fichero para grabar los datos");
                    String ficheroGrabarOrdenada = sc.nextLine();
                    grabarLista(ficheroGrabarOrdenada);
                    break;   
                case 0:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
                
                
            }
            
            
        } while (opcion != 0);
        
        
        
        
    }
    
    
}
