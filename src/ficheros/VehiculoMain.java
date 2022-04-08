/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import entregaHerencias.Empleado;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class VehiculoMain {
    
    public static ArrayList<Vehiculo> leerVehiculos(String fichero){
        
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        BufferedReader br = null;
        
        try {
        
        br = new BufferedReader(new FileReader(fichero));
        String linea;
        
        while((linea = br.readLine()) != null){
            
            String [] parametros = linea.split("\\;");
            
            Vehiculo v = new Vehiculo(parametros[0],parametros[1],Double.parseDouble(parametros[2]),parametros[3]);
            vehiculos.add(v);
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
        
        return vehiculos;
        
    }
    
    public static void escribirLista(String fichero,ArrayList<Vehiculo> vehiculos){
        
        BufferedWriter bw = null;
        
        try {
            
            bw = new BufferedWriter(new FileWriter(fichero));
            
            for(Vehiculo v : vehiculos){
                
                bw.write(v.getMatricula() + ";" + v.getMarca() + ";" + v.getTamañoDeposito() + ";" + v.getModelo()+ "\n");
                
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
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        /*
        crear vehiculo y añadirlo a la lista
 borrar vehículo de la lista (por su matrícula)
mostrar todos los vehículos de la lista
Escribir la lista de vehículos en un fichero (pedir nombre fichero)
añadir vehículos de fichero a la lista (pedir nombre fichero)
Sustituír la lista actual por vehículos en fichero (pedir nombre fichero)
*/
        
        int opcion;
        do {
            System.out.println("1.Crear vehículo en la lista");
            System.out.println("2.Borrar vehículo de la lista");
            System.out.println("3.Mostrar vehículos");
            System.out.println("4.Escribir la lista de vehículos en un fichero");
            System.out.println("5.Añadir vehículos del fichero a la lista");
            System.out.println("6.Sustituir la lista actual por los vehículos del fichero");
        
            System.out.println("Introduce una opción:");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                
                case 1:
                    System.out.println("1.Crear vehículo de la lista");
                    System.out.println("Introduce matrícula");
                    String matricula = sc.nextLine();
                    System.out.println("Introduce marca");
                    String marca = sc.nextLine();
                    System.out.println("Introduce tamaño del depósito");
                    double deposito = sc.nextDouble();
                    System.out.println("Introduce modelo");
                    String modelo = sc.nextLine();
                    
                    Vehiculo v = new Vehiculo(matricula,marca,deposito,modelo);
                    vehiculos.add(v);
                    System.out.println("--Vehículo añadido a la lista--");
                    break;
                case 2:
                    System.out.println("2.Borrar vehículo de la lista");
                    System.out.println("Introduce la matrícula del vehículo a eliminar");
                    String matriculaBorrar = sc.nextLine();
                    Iterator it = vehiculos.iterator();
                    while(it.hasNext()){
                    Vehiculo e  = (Vehiculo) it.next();
                        if(e.getMatricula().equals(matriculaBorrar)){
                            it.remove();
                        }
                    }
                    System.out.println("-Vehículo eliminado de la lista--");
                    break;
                case 3:
                    System.out.println("3.Mostrar vehículos");
                    
                    for(Vehiculo ve : vehiculos){
                        System.out.println(ve);
                    }
                    
                    break;
                case 4:
                    System.out.println("4.Escribir la lista de vehículos en un fichero");
                    System.out.println("Introduce el nombre del fichero");
                    String ficheroEscribir = sc.nextLine();
                    escribirLista(ficheroEscribir,vehiculos);
                    break;
                case 5:
                    System.out.println("5.Añadir vehículos del fichero a la lista");
                    System.out.println("Introduce el nombre del fichero");
                    String ficheroLeer = sc.nextLine();
                    ArrayList<Vehiculo> vehiculosFichero = leerVehiculos(ficheroLeer);
                    
                    
                    
                    break;
                case 6: 
                    System.out.println("6.Sustituir la lista actual por los vehículos del fichero");
                    System.out.println("Introduce el nombre del fichero");
                    break;
                case 0:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
                
                
            }
            
            
        } while (opcion != 0);
        
        
        
    }
    
    
}
