
package listas;
import java.util.*;

public class Oficina {
    
ArrayList<Mueble> mobiliario;

Oficina(){
    
    mobiliario = new ArrayList<>();
    
}

void insertar(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce nombre del mueble: ");
    String nomInsertar = sc.nextLine();
    System.out.println("Introduce marca del mueble: ");
    String marcaInsertar = sc.nextLine();
    System.out.println("Introduce precio del mueble: ");
    double precioInsertar = sc.nextDouble();
    
    //lo crea para añadirlo
    Mueble m = new Mueble(nomInsertar,marcaInsertar,precioInsertar);
    
    mobiliario.add(m);
}

void eliminarPorNombre(String nombreBorrar){
    
    for(int i = 0; i<mobiliario.size();i++){
        if(mobiliario.get(i).getNombre().equals(nombreBorrar)){
            mobiliario.remove(i);
            break; //el break hace que solo borre la primera ocurrencia
        }
    }
    
    
    
}

void mostrar(boolean ascendente){
    
    if(ascendente){//muestra de forma ascendente
        for(Mueble muebleActual: mobiliario){
        
        muebleActual.mostrar();
        
        }
    }
    else{//muestra de forma descendente
        for(int i = mobiliario.size()-1; i>=0;i--){
            mobiliario.get(i).mostrar();
        }
    }
    
    
    
    
}


    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
    
    Oficina miOficina = new Oficina();
    
    System.out.println("1. Insertar");  
    System.out.println("2. Eliminar"); 
    System.out.println("3. Mostrar"); 
    System.out.println("0. SALIR"); 
    
    int opcion;
    
    do{
        System.out.println("Selecciona una opción:");
        opcion = sc.nextInt();
        
        switch(opcion){
            
            case 1:
                System.out.println("1. Insertar"); 
                System.out.println("-----------------------------"); 
                miOficina.insertar();
                    
                break;
            case 2:
                System.out.println("2. Eliminar"); 
                System.out.println("-----------------------------");
                sc.nextLine();
                miOficina.mostrar(true);
                System.out.println("Introduce el nombre del mueble");
                String nombreBorrar = sc.nextLine();
                miOficina.eliminarPorNombre(nombreBorrar);
                
                break;
            case 3:
                System.out.println("3. Mostrar"); 
                System.out.println("Introduce el orden para mostrar. 1 ascendente,2 descendente");
                int orden = sc.nextInt();
                if(orden == 1)
                    miOficina.mostrar(true);
                else
                    miOficina.mostrar(false);          
                
                break;
            case 0:
                System.out.println("SALIENDO..."); 
                break;
            default:
                System.out.println("Selecciona una opción válida(1-3)"); 
                break;
            
        }       
        
    }  while(opcion != 0);
        
        
        
    }
}
