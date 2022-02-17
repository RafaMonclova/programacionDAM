
package clases;
import java.util.*;

public class Alumno2 {

String dni;
int edad;
int nota1;
int nota2;
int nota3;
int notaFinal = 0;

Alumno2(String nuevoDNI, int nuevoEdad){
    
    dni = nuevoDNI;
    edad = nuevoEdad;
    nota1 = -1;
    nota2 = -1;
    nota3 = -1;
}

Alumno2(){
    dni = "";
    edad = 0;
    nota1 = -1;
    nota2 = -1;
    nota3 = -1;
}

void setDNI(String nuevoDni){
    dni = nuevoDni;
}

void setEdad(int nuevoEdad){
    edad = nuevoEdad;
}

void setNota1(int nuevaNota1){
    nota1 = nuevaNota1;
}

void setNota2(int nuevaNota2){
    nota2 = nuevaNota2;
}

void setNota3(int nuevaNota3){
    nota3 = nuevaNota3;
}

void getDNI(){
    System.out.println(dni);
}

void getEdad(){
    System.out.println(edad);
}

void getNota1(){
    System.out.println(nota1);
}

void getNota2(){
    System.out.println(nota2);
}

void getNota3(){
    System.out.println(nota3);
}

void getTrimestre(int trimestre){//recibe un numero, depende del numero devuelve nota1,nota2,nota3
    switch (trimestre){
        
        case 1:
            System.out.println(nota1);
            break;
        case 2:
            System.out.println(nota2);
            break;
        case 3:
            System.out.println(nota3);
            break;    
        default:
            System.out.println("Trimestre no encontrado, selecciona 1,2,3");
    }
}

int notaFinal(){
    
    return notaFinal = (nota1+nota2+nota3)/3;
       
}

void informeAlumno(){
    
    System.out.println("DNI: "+ dni);
    System.out.println("EDAD: "+ edad);
    System.out.println("NOTA PRIMER TRIMESTRE: "+nota1);
    System.out.println("NOTA SEGUNDO TRIMESTRE: "+nota2);
    System.out.println("NOTA TERCER TRIMESTRE: "+nota3);
    System.out.println("NOTA FINAL: "+notaFinal());
}




public static void main(String[] args){
    
    Alumno2 defecto = new Alumno2("12345678A", 18);
    Alumno2 Rafa = new Alumno2();
    
    System.out.println("DEFECTO");
    /*
    defecto.getDNI();
    defecto.getEdad();
    defecto.getTrimestre(1);
    defecto.getTrimestre(2);
    defecto.getTrimestre(3);
    */
    defecto.informeAlumno();
    
    System.out.println("--------------------------------------");
    
    System.out.println("RAFA");
    Rafa.setDNI("44569123D");
    Rafa.setEdad(24);
    Rafa.setNota1(10);
    Rafa.setNota2(9);
    Rafa.setNota3(8);
    /*
    Rafa.getDNI();
    Rafa.getEdad();
    Rafa.getTrimestre(1);
    Rafa.getTrimestre(2);
    Rafa.getTrimestre(3);
*/
    Rafa.informeAlumno();
}



    
}
