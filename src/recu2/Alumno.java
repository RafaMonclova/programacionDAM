/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recu2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class Alumno {
    
    private String nombre;
    private int edad;
    private boolean repetidor;
    private ArrayList<String> asignaturas = new ArrayList();
    
    public Alumno(){
        
        this.nombre = "";
        this.edad = 0;
        this.repetidor = false;
        this.asignaturas = new ArrayList();
    }

    public Alumno(String nombre, int edad, boolean repetidor) {
        this.nombre = nombre;
        this.edad = edad;
        this.repetidor = repetidor;
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

    public boolean isRepetidor() {
        return repetidor;
    }

    public void setRepetidor(boolean repetidor) {
        this.repetidor = repetidor;
    }

    public ArrayList<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<String> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    public void añadirAsignatura(String asignatura){
        
        asignaturas.add(asignatura);
        
    }
    
    public void eliminarAsignatura(String asignatura){
        
        Iterator it = asignaturas.iterator();
        
        while(it.hasNext()){
            String a  = (String) it.next();
            if(a.equals(asignatura)){
                    it.remove();
            }
        }
        
    }
    
    public void mostrarDatos(){
        
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edad);
        System.out.println("REPETIDOR: "+repetidor);
        System.out.println("---ASIGNATURAS---");
        
        Iterator it = asignaturas.iterator();
        
        while(it.hasNext()){
            String a  = (String) it.next();
            System.out.println(a);
        }
        
        System.out.println("--------------");
        
    }
    
    public void pedirAsignaturaTeclado(){
        
        Scanner sc = new Scanner(System.in);

        
        char opcion;
        do {
            
            System.out.println("Desea introducir una asignatura? s/n");

            opcion = sc.next().charAt(0);
            sc.nextLine();
            switch(opcion){
                default:
                    System.out.println("Introduce el nombre de la asignatura");
                    String asignatura = sc.nextLine();
                    asignaturas.add(asignatura);
                break;  
                case 'n':
                    System.out.println("Saliendo...");
                break;    
            }
            
            
            
        } while (opcion != 'n');
        
        
    }
    
    public void pedirAlumnoTeclado(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce nombre");
        String nombre = sc.nextLine();
        setNombre(nombre);
        System.out.println("Introduce edad");
        int edad = sc.nextInt();
        setEdad(edad);
        System.out.println("Es repetidor?");
        boolean repetidor = sc.nextBoolean();
        setRepetidor(repetidor);
        System.out.println("Introduce las asignaturas:");
        pedirAsignaturaTeclado();
        
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
