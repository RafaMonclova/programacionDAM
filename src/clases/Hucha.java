/*
Escribe una aplicación java con una sola clase, llamada 'Hucha'.
 
public class Hucha {
 
    int saldo = 0;
 introducir-
Sacar-
informar  
   public static void main(String[] arg) {
Hucha miHucha= new Hucha();
 
      miHucha.introducir(50);   // Debe meter 50 en la hucha
      miHucha.sacar(20);   // Debe sacar 20 de la hucha
    miHucha.introducir(40);
      miHucha.informar();  // Debe mostrar por pantalla "Hay 30 en la hucha";
   }

 */
package clases;
import java.util.*;
public class Hucha {
    
    int saldo=0;
    
    void introducir(int cantidadAñadir){
        saldo = saldo+cantidadAñadir;

    }
    
    void sacar(int cantidadSacar){
        saldo=saldo-cantidadSacar;

    }
    
    void informar(){
        System.out.println("Su saldo es de: "+saldo);
    }
    
    int getSaldo(){//devuelve saldo fuera de la clase, más correcto
        return saldo;
    }
    
    void setSaldo(int nuevoSaldo){//cambia el saldo, teniendo en cuenta si es negativo
        if(nuevoSaldo>0){
            saldo=nuevoSaldo;
        }
        else{
            System.out.println("EL saldo no puede ser negativo, el saldo no se va a modificar.");
        }
    }
    
    
    public static void main(String[] args) {
        Hucha miHucha = new Hucha();
        
        miHucha.introducir(50);
        miHucha.sacar(20);
        miHucha.introducir(40);
        miHucha.informar();
        miHucha.setSaldo(-40);
    }
    
}
