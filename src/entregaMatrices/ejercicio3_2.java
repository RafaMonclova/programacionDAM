/*
3 Implementa una miniaplicación reserva de cine.
En la aplicación tendremos una array bidemensional Sala de tamaño 6x6. En cada posición del array guardaremos el nombre de la
persona que realiza la reserva del asiento, (si una persona reserva 3 asientos aparecerá su nombre 3 veces), en caso de que el 
asiento no esté reservado el valor será cadena vacía. El sistema buscará asientos consecutivos en la misma fila para reservar 
y los mostrará al usuario. Posteriormente el usuario elegirá fila y asiento de comienzo (para reservarlo hay que volver a comprobar
que cabe porque el usuario podría elegir cualquiera )
Ejemplo:
Introduce tu nombre:
Justin Chang
Introduce el número de asientos a reservar (mínimo 1):
4
Opciones disponibles:
Fila 1 asientos del 1 al 4
Fila 1 asientos del 2 al 5
Fila 1 asientos del 3 al 6
Fila 5 asientos del 2 al 5
Fila 6 asientos del 1 al 4
Fila elegida.
5
Asiento de comienzo:
2
Reserva realizada  Justin Chang4 
 */
package entregaMatrices;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class ejercicio3_2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [][] sala = new String [6][6];
        for (int i = 0; i < sala.length; i++){ // Se rellena la matriz con cadenas vacías
            for (int j = 0; j < sala[i].length; j++){
                sala[i][j] = "";
            }
        }
        boolean completa = false; // El menú se repetirá hasta que la sala esté completa
        boolean opciones = false; // Solo de haber opciones disponibles se permitirá escoger fila y asiento
        do{
            System.out.println("BIENVENIDO AL CINE\n------------------");
            for(int i = 0; i < sala.length;i++){ // Se muestra el estado actual de las reservas
                System.out.print(i + 1 + " -"); // Se utiliza el +1 con el fin de hacer la aplicación más entendible para el usuario
                for(int j = 0; j < sala[i].length; j++){
                    System.out.print(" " + (j + 1) + "." + sala[i][j]);
                }
                System.out.println();
            }
            System.out.println("Introduce tu nombre:");
            String nombre = sc.nextLine();
            System.out.println("Introduce el número de asientos a reservar (mínimo 1)");
            int asientos_a_reservar = sc.nextInt(); sc.nextLine();
            System.out.println("Opciones disponibles:");
            for (int i = 0; i < sala.length; i++){ //Para mostrar las opciones disponibles se recorren todos los asientos
                for (int j = 0; j < sala[i].length; j++){ // Siguiendo el ejemplo solo las mostrará dentro de una misma fila
                    if (sala[i][j].equals("")){ // En el momento que encuentre un asiento vacío
                        int contador = 0; // Inicializa un contador que sume los asientos disponibles consecutivos
                        do{ // Comienza un bucle para comprobarlo                           
                            if (sala[i][j+contador].equals("")){
                                contador++;
                            } else { // Si aún no ha cumplido la condición y encuentra un asiento reservado se da por imposible como opción
                                break;
                            }                        
                        }while(contador < asientos_a_reservar && contador + j < sala[j].length); // Mientras el contador sea menor que los asientos que se desean o el contador + la posición del primer asiento superen la longitud de la fila
                        if (contador == asientos_a_reservar){ // Solo si el contador alcanza el número de asientos a reservar se imprimirá como una opción válida
                            System.out.println("Fila " + (i + 1) + " asientos del " + (j+1) + " al " + (j+asientos_a_reservar));
                            opciones = true;
                        }
                    }           
                }
            }
            if (opciones){
                System.out.println("Selecciona fila:");
                int filaElegida = sc.nextInt() - 1;
                System.out.println("Selecciona asiento de comienzo:");
                int asientoElegido = sc.nextInt() - 1; sc.nextLine();
                boolean validacion = true; // Se valida que la reserva sea correcta
                for (int i = asientoElegido; i < (asientoElegido + asientos_a_reservar); i++){  // Al conocer la fila en la que queremos realizar la reserva solo es necesario recorrer esta
                    if (!sala[filaElegida][i].equals("")){ 
                        System.out.println("ERROR, unos de los sitios está ocupado"); // De no serla imprimirá un mensaje de error   
                        validacion = false;
                        break;
                    }
                }
                if (validacion){ // De ser correcta se realiza la reserva asignando el nombre del usuario a los asientos
                    for (int i = asientoElegido; i < (asientoElegido + asientos_a_reservar); i++){
                        sala[filaElegida][i] = nombre;
                        sala[filaElegida][i] = nombre;
                    }
                    System.out.println("Reserva realizada " + nombre);
                }
            } else {
                System.out.println("No existen opciones para ese número de asientos"); 
            }           
            for (int i = 0; i < sala.length; i++){ // Un nuevo bucle para comprobar si quedan asientos libres.
                for (int j = 0; j < sala[i].length; j++){
                    if (sala[j][i].equals("")){
                        completa = false;
                        break;
                    } else {
                        completa = true;
                    }
                }
            }           
        } while (!completa);
    }
    
}