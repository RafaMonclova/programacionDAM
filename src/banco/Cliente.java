
package banco;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
    
int DNI;
int sueldo;
Cuenta cuenta;    
    
    
Cliente(){
    DNI = 0;
    sueldo = 0;
    cuenta = new Cuenta();
}  
    
Cliente(int nuevoDNI, int nuevoSueldo){
    DNI = nuevoDNI;
    //setDNI(nuevoDNI); --> con esto compruebas que es válido al iniciarlo
    sueldo =  nuevoSueldo;
    cuenta = new Cuenta(nuevoDNI, nuevoDNI, 0);//numero de cuenta y contraseña valen DNI
}      
    
    
void setDNI(int nuevoDNI){
 
    if(DNI<99999999 && DNI >= 10000000){
            DNI=nuevoDNI;
        }else{
            System.out.println("DNI INVALIDO");
        }  
}    
    
void setSueldo(int nuevoSueldo){
    sueldo = nuevoSueldo;
}      
    
int getDNI(){
    return DNI;
}    
    
int getSueldo(){
    return sueldo;
}   

Cuenta getCuenta(){
    return cuenta;
}
    
void ingresarNomina(){
    
    cuenta.modificarSaldo(sueldo);
}    

void sacarDinero(int DNI, int contraseña){
    Scanner sc = new Scanner(System.in);
    
    if(cuenta.validarContraseña(contraseña)){
        System.out.println("Introduzca cantidad a retirar");
        int retiroDinero = sc.nextInt();
        cuenta.modificarSaldo(-retiroDinero);
        System.out.println("Su saldo es de: "+cuenta.getSaldo());
        
    }else{
        System.out.println("ERROR contraseña incorrecta, acceso denegado");
    }
}
    



}
