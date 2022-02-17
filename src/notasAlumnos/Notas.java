
package notasAlumnos;
import java.util.*;

public class Notas {

int [][] matrizNotas;
String [] asignaturas;
String [] alumnos;


Notas(){
    matrizNotas = new int[30][6];
    alumnos = new String[30];
    asignaturas = new String[6];
    
}

Notas(int numAlumnos, int numAsignaturas){
    matrizNotas = new int[numAlumnos][numAsignaturas];
    alumnos = new String[numAlumnos];
    asignaturas = new String[numAsignaturas];
}
  
void setAsignatura(int posicion, String nombreAsignatura){
    
    asignaturas[posicion] = nombreAsignatura;
         
}

void setAlumno(int posicion, String nombreAlumno){
    
    alumnos[posicion] = nombreAlumno;
      
}

void setNotaAlumnoAsignatura(int posicionAlumno, int posicionAsignatura, int nuevaNota){
    
    matrizNotas[posicionAlumno][posicionAsignatura] = nuevaNota;
    
} 

int getNotaAlumnoAsignatura( int posicionAlumno, int posicionAsignatura){
    
    return matrizNotas[posicionAlumno][posicionAsignatura];
    
}

int[] getNotasAlumno (int posicion){
    
    return matrizNotas[posicion];
    
}

int[] getNotasAlumno (String nombreAlumnoaBuscar){
    
    for(int i = 0; i < alumnos.length;i++){
        if(alumnos[i].equals(nombreAlumnoaBuscar)){
           return matrizNotas[i];
        }
    }
    return matrizNotas[0];
    
}

int[] getNotasAsignatura (int posicion){
    
    for(int i = 0; i < matrizNotas.length;i++){
        for(int j = 0; j < matrizNotas[i].length;j++){
            if(matrizNotas[i][j] == matrizNotas[i][posicion])
                return matrizNotas[i];
        }
    }
    return matrizNotas[0];
    
}

int[] getNotasAsignatura (String nombreAsignaturaaBuscar){
    
    for(int i = 0; i < matrizNotas.length;i++){
        for(int j = 0; j < matrizNotas[i].length;j++){
           if(asignaturas[i].equals(nombreAsignaturaaBuscar)){
           return matrizNotas[i];
                }
        }
        
    }
    return matrizNotas[0];
    
}

int suspensosAlumno(int posicion){
    int contadorSuspensos = 0;
    for(int i = 0;i < matrizNotas[posicion].length;i++){
        if(matrizNotas[posicion][i] < 5){
            contadorSuspensos++;
        }       
        
    } 
    return contadorSuspensos;   
}

int suspensosAsignatura(int posicion){
    int contadorSuspensos = 0;
    
    for(int i = 0; i < matrizNotas.length;i++){
        
        if(matrizNotas[i][posicion] < 5){
            contadorSuspensos++;
        }
               
    } 
    return contadorSuspensos;
}

double mediaAlumno (int posicion){
    double media = 0;
    for(int i = 0; i < matrizNotas[posicion].length;i++){
          
        media = media + matrizNotas[posicion][i];         
    }  
    return media / matrizNotas[posicion].length;
    
}

double mediaAsignatura (int posicion){
    
    double media = 0;
    for(int i = 0; i < matrizNotas.length;i++){
          
        media = media + matrizNotas[i][posicion];         
    }  
    return media / matrizNotas.length;
    
}

void mostrarBoletinClase(){
    
    System.out.print("Asignaturas");
    for(int i = 0; i < asignaturas.length;i++){
        System.out.print(i+" ");
    }
    System.out.println();
    
    for(int i = 0; i < matrizNotas.length;i++){//alumno, filas
        System.out.print(alumnos[i]);
        for(int j = 0; j < matrizNotas[i].length;j++){//asignatura, columnas
            System.out.print(" "+matrizNotas[i][j]+" ");
        }
        System.out.println();
    }
    
    for(int i = 0; i < asignaturas.length;i++){
        System.out.println(i+" "+asignaturas[i]);
    }
    
}

void mostrarBoletinAlumno(int posicion){
    
    System.out.println(alumnos[posicion]);
    
    int [] notasDeAlumno = getNotasAlumno(posicion);
    
    for(int i = 0; i < asignaturas.length;i++){
        System.out.print(asignaturas[i] + " ");
        System.out.println(notasDeAlumno[i]);
    }
    
    System.out.println("Suspensos: "+suspensosAlumno(posicion));
    System.out.println("Media: "+mediaAlumno(posicion));
    
}

void mostrarResumenAsignatura(int posicion){
    
    System.out.println(asignaturas[posicion]);
    int [] notasDeAsignatura = getNotasAsignatura(posicion);
    
    for(int i = 0; i < notasDeAsignatura.length;i++){
        System.out.print(alumnos[i] + " ");
        System.out.println(notasDeAsignatura[i]);
    }
    
    System.out.println("Suspensos: "+suspensosAsignatura(posicion));
    System.out.println("Media: "+mediaAsignatura(posicion));
    
}

int [][] trasponer(){
    int [][] t = new int [matrizNotas[0].length][matrizNotas.length];
    for(int i = 0; i < matrizNotas.length;i++){
        for(int j = 0; j < matrizNotas[i].length;j++){
            t[j][i] = matrizNotas[i][j];
        }
    }
    return t;
}

public static void main(String[] args){
    
    Notas misNotas = new Notas();
    
    misNotas.setAlumno(0, "Rafa");
    misNotas.setAlumno(1, "pepe");
    misNotas.setAlumno(2, "manolo");
    
    misNotas.setAsignatura(0, "Programacion");
    misNotas.setAsignatura(1, "Base de datos");
    misNotas.setAsignatura(2, "FOL");
    misNotas.setAsignatura(3, "Entornos");
    misNotas.setAsignatura(4, "Sistemas informáticos");
    misNotas.setAsignatura(5, "Lenguaje de marcas");
    
    
    
    misNotas.mostrarBoletinClase();
    
}

}

