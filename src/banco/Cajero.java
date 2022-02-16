
package banco;
import java.util.*;

public class Cajero {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    Cliente cliente1 = new Cliente(987654,1200);
    Cliente cliente2 = new Cliente();
    
    System.out.println("CAJERO AUTOMÁTICO");
    System.out.println("-----------------------------------------------");
    System.out.println("1. Consultar/modificar datos personales");
    System.out.println("2. Ingresar nómina");
    System.out.println("3. Consultar datos bancarios");
    System.out.println("4. Sacar dinero");
    System.out.println("5. Modificar contraseña");
    System.out.println("6. SALIR");
    
    System.out.println("Introduce una opción:");
    
    int opcion = sc.nextInt();
    switch(opcion){
        
        case 1:
            System.out.println("1. Consultar/modificar datos personales");
            System.out.println("DNI: "+cliente1.getDNI());
            System.out.println("SUELDO: "+cliente1.getSueldo());
            
            System.out.println("¿Desea cambiar los datos?");
            char opcion1 = sc.next().charAt(0);
            if(opcion1 == 's'){
                System.out.println("Introduzca DNI:");
                cliente1.setDNI(sc.nextInt());
                System.out.println("Introduzca Sueldo:");
                cliente1.setSueldo(sc.nextInt());
            }
        break;
        
        case 2:
            System.out.println("2. Ingresar nómina");
            cliente1.ingresarNomina();
            System.out.println("Sueldo ingresado con éxito");
            System.out.println(cliente1.getCuenta().getSaldo());
        break;
        
        case 3:
            System.out.println("3. Consultar datos bancarios");
            cliente1.getCuenta().mostrarDatos(sc.nextInt());
        break;
        
        case 4:
           System.out.println("4. Sacar dinero");
           int saldoRetirar = sc.nextInt();
           if (saldoRetirar > cliente1.getCuenta().getSaldo()){
               System.out.println("ERROR, no puedes retirar más del saldo propio");
           } else{
               System.out.println("Introduzca DNI: ");
               int dniSacar = sc.nextInt();
               System.out.println("Introduzca Contraseña: ");
               int contraseñaSacar = sc.nextInt();
               cliente1.sacarDinero(dniSacar, contraseñaSacar);
           }
        break;
        
        case 5:
            System.out.println("5. Modificar contraseña");
            System.out.println("Introduzca su contraseña actual");
            int contraseñaActual = sc.nextInt();
            cliente1.getCuenta().modificarContraseña(contraseñaActual);
        break;
        
        case 6:
            System.out.println("¡Hasta la próxima!");
            break;
            
        default:
            System.out.println("Opción inválida");
    }
    
    
    
    
    
    
    
}

   
}
