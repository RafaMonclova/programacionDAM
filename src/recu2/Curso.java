/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recu2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class Curso {
    
    private String identificadorCurso;
    private Alumno[] alumnos;

    public Curso(){
        
        identificadorCurso = "CursoSinNombre";
        alumnos = new Alumno[30];
        
    }
    
    public Curso(String identificadorCurso, int numAlumnos) {
        this.identificadorCurso = identificadorCurso;
        alumnos = new Alumno[numAlumnos];
    }

    public String getIdentificadorCurso() {
        return identificadorCurso;
    }

    public void setIdentificadorCurso(String identificadorCurso) {
        this.identificadorCurso = identificadorCurso;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
    
    public void introducirAlumno(){
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < alumnos.length; i++) {
            
            System.out.println("ALUMNO "+(i+1));
            System.out.println("Introduce nombre");
            String nombre = sc.nextLine();
            System.out.println("Introduce edad");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Es repetidor?");
            boolean repetidor = sc.nextBoolean();
            Alumno a = new Alumno(nombre,edad,repetidor);
            System.out.println("Introduce sus asignaturas");
            a.pedirAsignaturaTeclado();
            alumnos[i] = a;
        }
        
        
    }
    
    
    //Imprime un mapa de Asignatura,Lista de alumnos
    public void crearInformeAsignaturas(){
        
        Map<String,ArrayList<Alumno>> mapa = new HashMap<>();
            
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[i].getAsignaturas().size();j++) {
                
                //Se rellena la lista de alumnos de la asignatura recibida (alumnos[i].getAsignaturas().get(j))
                ArrayList<Alumno> alumnosDeLaAsignatura = alumnosDeAsignatura(alumnos[i].getAsignaturas().get(j));
                
                //Se añade la entrada al mapa
                mapa.put(alumnos[i].getAsignaturas().get(j), alumnosDeLaAsignatura);
                    
            } 
        }
        
        
        
        Iterator it = mapa.keySet().iterator();
        while(it.hasNext()){
            String key  = (String) it.next();
            ArrayList<Alumno> value = mapa.get(key);
            
            System.out.println("Asignatura: "+key +"\n"+ "Alumno: "+value+"\n");
                 
            
        }
            
            
              
            
    }
    
    //Devuelve una lista de alumnos que tienen la asignatura recibida por parametro
    public ArrayList<Alumno> alumnosDeAsignatura(String a){
        
        ArrayList<Alumno> asignaturasAlumno = new ArrayList();
        
        for (int i = 0; i < alumnos.length; i++) {
            
            for (int j = 0; j < alumnos[i].getAsignaturas().size();j++) {
                
                if(alumnos[i].getAsignaturas().get(j).equals(a)){
                    asignaturasAlumno.add(alumnos[i]);
                }
                    
                
                
            }
            
            
        }
        
        return asignaturasAlumno;
        
    } 
     
        
        
    public void mostrar(){
        
        for (int i = 0; i < alumnos.length; i++) {
            
            alumnos[i].mostrarDatos();
            
        }
        
    }
        
        
    
    public static void main(String[] args){
        
        Curso curso = new Curso("DAM",3);
        
        //curso.introducirAlumno();
        
        Alumno a1 = new Alumno("A1",24,false);
        Alumno a2 = new Alumno("A2",32,true);
        Alumno a3 = new Alumno("A3",12,false);
        
        System.out.println("ALUMNO 1");
        a1.pedirAsignaturaTeclado();
        System.out.println("ALUMNO 2");
        a2.pedirAsignaturaTeclado();
        System.out.println("ALUMNO 3");
        a3.pedirAsignaturaTeclado();
        
        Alumno[] arrayAlumnos = new Alumno[3];
        arrayAlumnos[0] = a1;
        arrayAlumnos[1] = a2;
        arrayAlumnos[2] = a3;
        curso.setAlumnos(arrayAlumnos);
        
        curso.mostrar();
        curso.crearInformeAsignaturas();
        
        
    }
    
}
