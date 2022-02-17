
package javaapplication1;
import java.util.*;

public class cadenas3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        for(;;){//do while 
            System.out.println("Escriba su contraseña");
            String contraseña=sc.nextLine();
            System.out.println("Repita su contraseña");
            String confirmacion=sc.nextLine();
            if(contraseña.equals(confirmacion)){
                System.out.println("Contraseñas correctas");
                break;
            }else{
                System.out.println("ERROR, escriba las contraseñas de nuevo");
            }
        }
    }
}
