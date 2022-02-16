
package banco;
import java.util.*;

public class Cuenta {

int numCuenta;
int saldo;
int contraseña;


Cuenta(){
    numCuenta = 0;
    saldo = 0;
    contraseña = 0;
    
}

Cuenta(int nuevoNumCuenta, int nuevoSaldo, int nuevaContraseña){
    
    numCuenta = nuevoNumCuenta;
    saldo = nuevoSaldo;
    contraseña = nuevaContraseña;
    
}

int getSaldo(){
    return saldo;
}

void getNumCuenta(){
    System.out.println("NÚMERO CUENTA: "+numCuenta);
}


void modificarSaldo(int saldoIngresoRetiro){
    
    saldo = saldo + saldoIngresoRetiro;
}

void generarContraseña(){
    
    int contraseña = (int)(Math.random()*8999 + 1000);
    System.out.println(contraseña);
}

void modificarContraseña(int contraseña){
    
    if(validarContraseña(contraseña)){
        contraseña = (int)(Math.random()*8999 + 1000);
        System.out.println("La nueva contraseña es: "+contraseña);
    }else{
        System.out.println("Contraseña errónea");
    }
}

boolean validarContraseña(int contraseñaProbar){
    
    if(contraseña == contraseñaProbar){
        return true;
    }else{
        return false;
    }
}
  
void mostrarDatos(int contraseñaAcceso){
    
    if(contraseña == contraseñaAcceso){
        getNumCuenta();
        getSaldo();    
    }else{
        System.out.println("Contraseña inválida, acceso denegado");
    }
    
}


public static void main(String[] args){
    
    Cuenta miCuenta = new Cuenta(58409,20,1234);
    
    miCuenta.modificarSaldo(50);
    miCuenta.modificarContraseña(1234);
    //miCuenta.mostrarDatos(1234);
    
}


}
