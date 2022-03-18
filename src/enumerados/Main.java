/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animales = new ArrayList();
    
        for(int i = 0;i<10;i++){
            
            int porcentaje = (int)((Math.random()*99)+1);
            
            if(porcentaje <= 25){
                Animal perro = new Perro("Perro");
                animales.add(perro);
            }
            if(porcentaje >= 26 && porcentaje <= 50){
                Animal cabra = new Cabra("Cabra");
                animales.add(cabra);
            }
            if(porcentaje >= 51 && porcentaje <= 75){
                Animal oso = new Oso("Oso");
                animales.add(oso);
            }
            if(porcentaje >= 76){
                Animal pajaro = new Pajaro("Pajaro");
                animales.add(pajaro);
            }
            
        }
        
        //Collections.sort(animales);
        
        for(Animal a : animales){
            System.out.println(a.getNombre());
        }
        
        
        int posicion = (int)((Math.random()*9)+1);
        
        System.out.println("El animal que hace este ruido -> "+animales.get(posicion).ruido() + " es...(Diga la especie)");
        String respuesta = sc.nextLine();
        
        if(animales.get(posicion).getEspecie().equals(respuesta)){
            System.out.println("Enhorabuena! Has acertado, el animal es: "+animales.get(posicion).getNombre());
        }
        else
            System.out.println("Has fallado, la especie es: "+animales.get(posicion).getEspecie());
        
    }
    
    
}
