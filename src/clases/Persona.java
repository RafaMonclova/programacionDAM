package clases;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    
    String nombre = "";
    int edad = 0;
    String dni = "";
    
    void setNombre(String NuevoNombre){
        boolean Correcto=true;
        String valoresCorrectos="ñáéíóú ";
        String valoresCorrectos2="ñáéíóú abcdefghijklmnñopqrstuvwxyz";
        /*
        for (int i=0;i<NuevoNombre.length();i++){
         if ( NuevoNombre.charAt(i) >='a' && NuevoNombre.charAt(i)<='z' ||NuevoNombre.charAt(i)=='ñ'){
             
         }
        }
        */
        
        for (int i=0;i<NuevoNombre.length();i++){
          if ( ! valoresCorrectos2.contains(""+NuevoNombre.charAt(i))){
              Correcto=false; 
              break;
          }
              
        }
        
        if (Correcto)
            nombre = NuevoNombre;
        else
            System.out.print("nombre Inválido"); 
        
    }
    
    void setDni(String NuevoDni){
        Pattern pat = Pattern.compile("^\\d{8}[A-Z]$");
        Matcher mat = pat.matcher(NuevoDni);
        String letraCorrectaDNI="TRWAGMYFPDXBNJZSQVHLCKE";
         int numeroDNI=Integer.parseInt(NuevoDni.substring(0, 7));
      
        if(mat.matches() && letraCorrectaDNI.charAt(numeroDNI%23)==NuevoDni.charAt(8) ){
            dni = NuevoDni;
        }
        else{
            System.out.print("DNI Inválido");
        }
        
    }
    
    void setEdad(int NuevaEdad){
        edad=NuevaEdad;
    }
    
    void getNombre(){
        
        System.out.println(nombre);
        
    }
    
    void getEdad(){
        
        System.out.println(edad);;
        
    }
    
    void getDNI(){
        
        System.out.println(dni);;
        
    }
    
    
    public static void main(String[] args){
        
        Persona manolo = new Persona();
        manolo.setNombre("Manu");
        manolo.setEdad(19);
        manolo.setDni("4884848Y");
        manolo.getDNI();
        manolo.getEdad();
        manolo.getNombre();
        
        
        
    }
    
    
    
    
}