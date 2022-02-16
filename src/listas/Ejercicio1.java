
package listas;
import java.util.*;

public class Ejercicio1 {
    //Atributo, es el ArrayList
    private ArrayList<Integer> atributoLista; 
    
    //COnstructor por defecto que crea la lista
    Ejercicio1(){
        atributoLista = new ArrayList<>(); 
    }
    
    //Muestra la lista, la recorre e imprime
    void mostrarLista(){
        for(int i = 0; i < atributoLista.size();i++){
            System.out.println(atributoLista.get(i));
        }
    }
    
    //Devuelve la lista
    ArrayList<Integer> getLista(){
        return atributoLista;
    }
    
    //Añade un número a la lista del atributo
    void setNumeros(int numero){
        atributoLista.add(numero);
    }
    void addNumero(int numero){
        atributoLista.add(numero);
    }
    
    //Devuelve el mayor de la lista
    int mayor(){
        Iterator<Integer> it = atributoLista.iterator();
        int mayor = Integer.MIN_VALUE;
    
        while(it.hasNext()){
        
            int numActual = it.next();
            System.out.println(numActual);
                if(numActual > mayor){
                    mayor = numActual;
                }
        
            }
        return mayor;
        
    }
    
    //Devuelve el menor de la lista
    int menor(){
        Iterator<Integer> it = atributoLista.iterator();
        int menor = Integer.MAX_VALUE;
    
        while(it.hasNext()){
        
            int numActual = it.next();
            System.out.println(numActual);
                if(numActual < menor){
                    menor = numActual;
                }
        
            }
        return menor;
    }
    
    //Devuelve la media de la lista
    int media(){
        Iterator<Integer> it = atributoLista.iterator();
        int media = 0;
    
        while(it.hasNext()){
        
            int numActual = it.next();
            System.out.println(numActual);
            media += numActual;
        
        }
        return media/atributoLista.size();
    }
    
    //Reemplaza el número introducido en el primer parámetro por el introducido en el segundo
    void reemplazar(int numBuscar, int nNumero){
        Iterator<Integer> it = atributoLista.iterator();
        int contador = 0;
    
        while(it.hasNext()){
        
            int numActual = it.next();
            if(numActual == numBuscar){
                atributoLista.set(contador, nNumero);
                //numActual = nNumero;
               break;
            }
            
                contador++;    
            
        
        }
    }
    void borrarElemento(int posicion){
        atributoLista.remove(posicion);
    }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Objeto cuyo atributo es el ArrayList
    Ejercicio1 objetoaUsar = new Ejercicio1();
    
    //Introduce números en la lista
    System.out.println("Introduce un número: ");
    int num = sc.nextInt();
    objetoaUsar.getLista().add(num);
    char opcion;
    
    //El bucle introduce números siempre que la opción introducida sea 's', sale bucle al escribir 'n'
    do{
        
        System.out.println("Quieres introducir otro número?");
        opcion = sc.next().charAt(0);
        
        if(opcion == 's'){
            System.out.println("Introduce otro número: ");
            num = sc.nextInt();
            objetoaUsar.getLista().add(num);
            //miLista.setNumeros(num); es lo mismo que lo de arriba
        }
           
        
    }while (opcion != 'n');    
    
    System.out.println("1. Mostrar lista");
    System.out.println("2. Mostrar mayor, menor y media");    
    System.out.println("3. Borrar un elemento de una posición concreta"); 
    System.out.println("4. Borrar un elemento de un valor concreto");
    System.out.println("5. Añadir un elemento al final");
    System.out.println("6. Cambiar valor de un elemento por su posición");
    System.out.println("7. Cambiar valor de un elemento por su valor");
    System.out.println("0. SALIR"); 
    
    //Menú con las opciones del programa, cada opción llama a un método del objeto
    int opcion2;
    do{
        System.out.println("Introduzca una opción: ");  
        opcion2 = sc.nextInt();
        
        switch(opcion2){
            
            case 1:
                System.out.println("1. Mostrar lista");
                objetoaUsar.mostrarLista();
                break;
            case 2:
                System.out.println("2. Mostrar mayor, menor y media"); 
                System.out.println("MAYOR:"+objetoaUsar.mayor());
                System.out.println("MENOR:"+objetoaUsar.menor());
                System.out.println("MEDIA:"+objetoaUsar.media());
                break;
            case 3:
                System.out.println("3. Borrar un elemento de una posición concreta"); 
                System.out.println("Introduce la posición del número a eliminar: "); 
                int posEliminar = sc.nextInt();
                objetoaUsar.getLista().remove(posEliminar);
                break;
            case 4:
                System.out.println("4. Borrar un elemento de un valor concreto");
                System.out.println("Introduce el número que quieres eliminar: ");
                int numEliminar = sc.nextInt();
                objetoaUsar.getLista().remove(Integer.valueOf(numEliminar));       
                break;
            case 5:
                System.out.println("5. Añadir un elemento al final");
                System.out.println("Introduce un número para añadir al final: ");
                int numAñadirFinal = sc.nextInt();
                objetoaUsar.addNumero(numAñadirFinal);
                //objetoaUsar.getLista().add( numAñadirFinal);
                break;
            case 6:
                System.out.println("6. Cambiar valor de un elemento por su posición");
                System.out.println("Introduce la posición a modificar: ");
                int posModificar = sc.nextInt();
                System.out.println("Introduce el nuevo valor: ");
                int nValor = sc.nextInt();
                objetoaUsar.getLista().set(posModificar, nValor);               
                break;
            case 7:
                System.out.println("7. Cambiar valor de un elemento por su valor");
                System.out.println("Introduce el número a sustituir: ");
                int numBuscar = sc.nextInt();
                System.out.println("Introduce el nuevo valor: ");
                int nNumero = sc.nextInt();
                objetoaUsar.reemplazar(numBuscar, nNumero);
                break;
            case 0:
                System.out.println("SALIENDO...");
                break;
            default:
                System.out.println("Elige una opción correcta(1-7)");
                break;
        }
        
        
        
    }while(opcion2 != 0);
    
    
   
    
    }
}
