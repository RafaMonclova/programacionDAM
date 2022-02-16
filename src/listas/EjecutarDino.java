/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjecutarDino {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Dino arrayDino[] = new Dino[5];
    
//crear los dinosaurios en el Array
    
    for(int i = 0;i<arrayDino.length;i++){
        System.out.println("Introduce el nombre del dino");
        String nombre = sc.nextLine();
        System.out.println("Introduce el peso del dino");
        double peso = sc.nextDouble();
        System.out.println("Introduce los años que lleva extinto del dino");
        int años = sc.nextInt();
        sc.nextLine();
        arrayDino[i] = new Dino(nombre,peso,años);
    }
    
    //crar lista y copiar el Array
    
    List<Dino> listaDino;
   
    listaDino= new ArrayList<>(Arrays.asList(arrayDino));
    /*
    for(int i = 0;i<arrayDino.length;i++){
         listaDino.add(arrayDino[i]);
     }
    */
    
    
    for(Dino dinoActual: listaDino){
        dinoActual.mostrarDatos();
    }
    
    
    for(int i = 0;i<2;i++){
        System.out.println("Introduce el nombre del dino");
        String nombre = sc.nextLine();
        System.out.println("Introduce el peso del dino");
        double peso = sc.nextDouble();
        System.out.println("Introduce los años que lleva extinto del dino");
        int años = sc.nextInt();
        sc.nextLine();
        listaDino.add(new Dino(nombre,peso,años));
    } 
    
    for(Dino dinoActual: listaDino){
        dinoActual.mostrarDatos();
    }
    
    for(int i = 0;i<3;i++){
        int posFinal = listaDino.size()-1;
        listaDino.remove(posFinal);
    }
    
    for(Dino dinoActual: listaDino){
        dinoActual.mostrarDatos();
    }
    
}
    
}
