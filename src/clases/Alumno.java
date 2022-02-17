
package clases;
import java.util.*;

public class Alumno {
   
    String nombre;
    int anioNacimiento;
    
    
    
    String getNombre(){//metodo para obtener el nombre del alumno
        return nombre;
    }
    
    int calculaEdad(){//metodo para obtener edad del alumno
        int resultado;
        resultado = 2021-anioNacimiento;
        return resultado;
           
    }
    
    int calculaEdad(int anioActual){//igual pero le das la edad al llamar al metodo
        int resultado;
        resultado = anioActual-anioNacimiento;
        return resultado;
           
    }
    
    public static void main(String[] args){
        
        Alumno Manuel = new Alumno();
        Manuel.nombre="Manuel";
        Manuel.anioNacimiento=2000;
        
        Alumno Maria = new Alumno();
        Maria.nombre="Maria";
        Maria.anioNacimiento=1990;
        
        System.out.println(Manuel.getNombre());
        System.out.println(Manuel.calculaEdad(2020));
        
        System.out.println("------------------------------------");
        
        System.out.println(Maria.getNombre());
        System.out.println(Maria.calculaEdad());
    }
    
    
       
}



