
package compararObjetos;
import java.util.*;

public class Alumno implements Comparable<Alumno> {

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

    public int compareTo(Alumno otroAlumno){
        return this.nombre.compareTo(otroAlumno.nombre);
    }
    
    public String toString(){
        return "Nombre: "+nombre+", "+"Edad: "+edad;
    }


public static void main(String[] args){
     
    
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    int numAlumnos = (int)(Math.random()*10)+10;
    
    for(int i=0;i<numAlumnos;i++){
        
        Alumno a = new Alumno(("alumno"+i),(int)(Math.random()*18)+10);
        listaAlumnos.add((int)(Math.random()*listaAlumnos.size()),a);//añade los alumnos en posiciones aleatorias
    }
    
   
    for(Alumno alumnoActual : listaAlumnos){
        System.out.println(alumnoActual);
        //System.out.println("NOMBRE: "+alumnoActual.getNombre());
        //System.out.println("EDAD: "+alumnoActual.getEdad());
    }
    
    System.out.println("ORDENAMOS...");
    Collections.sort(listaAlumnos);
    
    for(Alumno alumnoActual : listaAlumnos){
        System.out.println(alumnoActual);
        //System.out.println("NOMBRE: "+alumnoActual.getNombre());
        //System.out.println("EDAD: "+alumnoActual.getEdad());
    }
}



    
}
