
package clases;
import java.util.*;

public class Motocicleta {


int caballosPotencia=0;
int velocidadPunta=0;
String letrasMatricula="";
int numMatricula=0;


void setCaballosPotencia(int NuevocaballosPotencia){
    
    caballosPotencia=NuevocaballosPotencia;
    
}

void getCaballosPotencia(){
    
    System.out.println(caballosPotencia);
    
}

void setVelocidadPunta(int NuevoVelocidadPunta){
    
    velocidadPunta= NuevoVelocidadPunta;
    
}

void getVelocidadPunta(){
    
    System.out.println(velocidadPunta);
    
}

void setLetrasMatricula(String NuevoletrasMatricula){
    
    letrasMatricula = NuevoletrasMatricula;
    
}

void getLetrasMatricula(){
    
    System.out.println(letrasMatricula);
    
}

void setNumMatricula(int NuevoNumMatricula){
    
    numMatricula=NuevoNumMatricula;
    
}

void getNumMatricula(){
    
    System.out.println(numMatricula);
    
}

Motocicleta(int velocidadInicial, int caballosInicial, String letrasMatriculaInicial, int numMatriculaInicial){
    
    velocidadPunta=velocidadInicial;
    caballosPotencia = caballosInicial;
    letrasMatricula=letrasMatriculaInicial;
    numMatricula=numMatriculaInicial;
    
}

Motocicleta(){
    
}

void mostrarMatricula(){
    String matriculaOficial=""+numMatricula+letrasMatricula;
    
    System.out.println("La matrícula completa es : "+matriculaOficial);
    
}


public static void main(String[] args){
    
    Motocicleta moto = new Motocicleta(40,80,"ABC",1234);
    Motocicleta moto2 = new Motocicleta();
    
    
    System.out.println("MOTO 1");
    moto.getVelocidadPunta();
    moto.getCaballosPotencia();
    moto.getLetrasMatricula();
    moto.getNumMatricula();
    
    moto.mostrarMatricula();
    
    System.out.println("----------------------------------------");
    
    System.out.println("MOTO 2");
    
    //Los set introducen el valor, luego se imprimen con get
    moto2.setVelocidadPunta(60);
    moto2.setCaballosPotencia(200);
    moto2.setLetrasMatricula("QWE");
    moto2.setNumMatricula(7896);
    
    moto2.getVelocidadPunta();
    moto2.getCaballosPotencia();
    moto2.getLetrasMatricula();
    moto2.getNumMatricula();
    
    moto2.mostrarMatricula();
}


    
}
