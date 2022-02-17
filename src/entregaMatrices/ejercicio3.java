//EJERCICIO 3
//RAFAEL MONCLOVA SUANO
package entregaMatrices;
import java.util.*;
/**
 * 
 * @author Rafa
 * @version 1.0
 */
public class ejercicio3 {
    
    //Matriz que almacena las butacas de la sala
    String[][] salaCine;
    
    //Constructor para crear una sala de 6x6 butacas
    /**
     * Crea un objeto de la clase ejercicio3, cuyo atributo es salaCine (matriz de 6x6)
     */
    public ejercicio3(){
        
        salaCine = new String[6][6];
        
    }
    
    //Devuelve el array de la sala de cine
    /**
     * Método que devuelve el atributo salaCine
     * @return Devuelve la matriz de la sala de cine
     */
    public String[][] getArrayCine(){
        return salaCine;
    }
    
    
    /**
     * Pide nombre y número de asientos por teclado y asigna el nombre del cliente a los asientos pedidos
     */
    public void reserva(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el número de asientos a reservar (mínimo 1): ");
        int numAsientos = sc.nextInt();
        
        //Cuenta asientos vacios en cada fila
        int contadorVacios = 0;
        //Muestra los asientos restantes de cada fila, esta variable se resetea por cada vuelta del bucle para comprobar cada fila
        int contadorVaciosMostrar = 0;
        for(int i = 0; i < salaCine.length;i++){
            for(int j = 0; j < salaCine[i].length;j++){
            
            //Incrementa los contadores si los asientos están vacios    
            if(salaCine[i][j] == null){
                
                contadorVacios++;
                contadorVaciosMostrar++;
                
            }
                       
            }
        
        //Muestra y resetea el contador de asientos vacios que se muestra por cada fila    
        System.out.println("Fila "+i+",Libres: "+contadorVaciosMostrar);
        contadorVaciosMostrar = 0;
                                    
        }
        
        System.out.println("Seleccione la fila:");
        int fila = sc.nextInt();
        
        for(int i = 0;i<salaCine.length;i++){
            for(int j = 0; j < numAsientos;j++){
                
                //Preguntamos si hay más asientos vacios en la fila seleccionada que asientos pedidos
                if(contadorVacios >= numAsientos){
                    salaCine[fila][j] = nombre;
                    contadorVacios--;
                }
                
                            
            }
        }
        
        System.out.println("Reserva realizada:");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("FILA: "+fila);
        System.out.println("ASIENTOS: "+numAsientos);
        
    }
    
    
    /**
     * Muestra la matriz con las reservas de cada cliente
     */
    public void mostrar(){
        for(int i = 0;i<salaCine.length;i++){
            for(int j = 0; j < salaCine[i].length;j++){
                
                System.out.print(salaCine[i][j]+" ");
                
                            
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    //Creamos el objeto 
    ejercicio3 cine = new ejercicio3();    
    
    char opcion;
    cine.reserva();
    //Preguntamos si queremos realizar varias reservas
    do{
        System.out.println("Desea hacer otra reserva? s/n");
        opcion = sc.next().charAt(0);
        
        if(opcion == 's'){
            cine.reserva();
        }
        
        
    }while(opcion != 'n');
    
    //Mostramos la sala con las reservas
    cine.mostrar();
    }
}
