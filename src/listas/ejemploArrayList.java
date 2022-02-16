
package listas;
import java.util.*;

public class ejemploArrayList {
    public static void main(String[] args){
        
    
     
     /*
    ArrayList<String> lista = new ArrayList<String>(); 
    lista.add("rafa");
    lista.add("juan");
    lista.add("alberto");
    lista.add("pepe");
    lista.add("manolo");
    
    System.out.println(lista);
    lista.add(1,"Steve");//añade pero no reemplaza
    System.out.println(lista);
    */
     
    ArrayList<Integer> listaNumeros = new ArrayList<Integer>(); 
     
    listaNumeros.add(1);
    listaNumeros.add(2);
    listaNumeros.add(3);
    listaNumeros.add(4);
    listaNumeros.add(5);
    /*
    while(listaNumeros.size() > 0){
        System.out.println(listaNumeros.get(0));
        listaNumeros.remove(0);
    }
    
    while(listaNumeros.size() > 0){
        System.out.println(listaNumeros.get(listaNumeros.size()-1));
        listaNumeros.remove(listaNumeros.size()-1);
    }
    
    /*
    for(int i = 0;i<listaNumeros.size();i++){
        
        System.out.println(listaNumeros.get(i));
        listaNumeros.remove(i);
        
    }
    /*
    for(int i=listaNumeros.size()-1; i>=0 ;i--){
        
        System.out.println(listaNumeros.get(i));
        listaNumeros.remove(i);
        
    }
    */
    
    Iterator<Integer> it = listaNumeros.iterator();
    int media = 0;
    
    while(it.hasNext()){
        
        int numActual = it.next();
        System.out.println(numActual);
        media += numActual;
        
    }
    
    System.out.print("MEDIA: "+media/listaNumeros.size());

    }
}
