
package arrays;
import java.util.*;

public class vectores12 {

int vector[];

vectores12(){
    
    vector = new int[50];
    for(int i = 0; i < vector.length;i++){
        
        vector[i] = (int)(Math.random()*100);
                
    }
          
}   
    
    
vectores12(int tamaño){
    
    vector= new int[tamaño];
    for(int i = 0; i < vector.length;i++){
        
        vector[i] = (int)(Math.random()*100);
               
    }
           
}    
    
void mostrarVector(){
        
    for(int i = 0; i < vector.length;i++){
        
        System.out.println(vector[i]);
             
    }
    
}

void mostrarNuevo(){
  
     System.out.println(Arrays.toString(vector));
     //vector.toString();
}

void mostrarVectorInverso(){
        
    for(int i = vector.length-1; i>=0;i--){
        
        System.out.println(vector[i]);
             
    }
    
}

int mostrarMenor(){
    int menor = Integer.MAX_VALUE;
    
    for(int i = 0; i < vector.length;i++){
        if(vector[i] < menor){
            menor = vector[i];
        }
        
             
    }
    
    return menor;
}

int mostrarMayor(){
    int mayor = Integer.MIN_VALUE;
    
    for(int i = 0; i < vector.length;i++){
        if(vector[i] > mayor){
            mayor = vector[i];
        }
        
             
    }
    
    return mayor;
}

void compruebaNumero(int numero){
    boolean existe = false;
    for(int i = 0; i < vector.length;i++){
        
        if(vector[i] == numero){
            existe = true;
            break;
        }
       
    }
    
    //return existe;
    if(existe){
        System.out.println("El número "+numero+" existe en el vector");
    }
    else{
        System.out.println("El número "+numero+" NO existe en el vector");
    }
    
    
}

void cambiaValor(int numero, int posicion){
    
    vector[posicion] = numero;
    
    
}

void sustituir(int num1, int num2){
    
    for(int i = 0; i < vector.length;i++){
        
        if(vector[i] == num1){
            vector[i] = num2;
        }
             
    }
    
}

void intercambiar(int posicion1, int posicion2){
    
    int aux = 0;
    
    vector[posicion1] = aux;
    vector[posicion2] = vector[posicion1];
    vector[posicion2] = aux;
    
        
}

void ordenar(){
  
     Arrays.sort(vector);
     System.out.println("Vector ordenado correctamente");
     
}
    
}
