
package repaso;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class ejercicio2 {
    
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,String> trabajadores = new HashMap();
        
        
        int opcion;
        
        do{
            System.out.println("Introduce una opción:");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                
                case 1:
                    System.out.println("1.Nuevo trabajador");
                    System.out.println("Introduce el NIF del nuevo trabajador:");
                    String nif = sc.nextLine();

                        if(trabajadores.containsKey(nif)){
                            System.out.println("ERROR, ese NIF ya esta en el mapa");
                        }
                        else
                            System.out.println("Introduce nombre:");
                            String nombre = sc.nextLine();
                            trabajadores.put(nif, nombre);       
                    
                break;
                case 2:
                    System.out.println("2.Buscar trabajador por NIF");
                    System.out.println("Introduce NIF para buscar trabajador:");
                    String nifBuscar = sc.nextLine();

                        if(trabajadores.containsKey(nifBuscar)){
                            System.out.println(trabajadores.get(nifBuscar));
                        }
                        else
                            System.out.println("ERROR, no existe un trabajador con ese NIF");
                              
                    
                break;
                case 3:
                    System.out.println("3.Buscar trabajador por nombre");
                    System.out.println("Introduce nombre para buscar trabajador:");
                    String nombreBuscar = sc.nextLine();
                    boolean aparece = false;
                    Iterator it = trabajadores.keySet().iterator();
                    while(it.hasNext()){
                    String key  = (String) it.next();
                    
                        if(trabajadores.get(key).equals(nombreBuscar)){
                            aparece = true;
                            System.out.println(key);
                        }
                        
                    }
                    if(!aparece)
                            System.out.println("ERROR, no existe trabajador con ese nombre");
                break;
                case 4:
                    System.out.println("4.Modificar trabajador");
                    System.out.println("Introduce nif del trabajador a modificar: ");
                    String nifModificar = sc.nextLine();
                    
                    if(trabajadores.containsKey(nifModificar)){
                        trabajadores.remove(nifModificar);
                        
                        System.out.println("Introduce el nuevo nombre");
                        String nuevoNombre = sc.nextLine();
                        trabajadores.put(nifModificar, nuevoNombre);
                    }
                    else
                        System.out.println("ERROR, no existe el trabajador");
                break;
                case 5:
                    System.out.println("5.Mostrar datos de todos los trabajadores");
                    Iterator it2 = trabajadores.keySet().iterator();
                        while(it2.hasNext()){
                        String key  = (String) it2.next();
                        System.out.println("NIF: "+key + ", NOMBRE: "+trabajadores.get(key));
                    }
                break;
                case 0:
                    System.out.println("SALIENDO...");
                break;    
                default:
                    System.out.println("Introduce una opcion válida(1,2,3,4,5,0)");
                break;
                
            }
            
            
        }while(opcion != 0);
        
        
    }
    
    
}
