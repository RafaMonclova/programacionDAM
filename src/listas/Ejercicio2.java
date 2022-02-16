package listas;

import java.util.*;




public class Ejercicio2 {
    
    
    
    static int Mayor(LinkedList lista){
        
        int mayor = Integer.MIN_VALUE;
        Iterator<Integer> it = lista.iterator();
        
        while(it.hasNext()){
            int num = it.next();
            if(num > mayor){
                mayor = num;
            }
        }
        return mayor;
  
    }
    
    
    
    public static void main(String[] args) {

        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<Integer> lista2 = new LinkedList<>();
        LinkedList<Integer> lista3 = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            int aleatorio = (int) (Math.random() * 1500);
            lista1.add( aleatorio);
            

        }
        System.out.println(lista1);

        for (int i = 0; i < 20; i++) {
            int aleatorio = (int) (Math.random() * 1500);
            lista2.add( aleatorio);

        }
         System.out.println(lista2);
         
         /*
         if (lista2.contains(lista1.get(0))){
              System.out.println((lista1.get(0))); 
               System.out.println("está en las dos listas");
         }
         else
         {
              System.out.println((lista1.get(0))); 
               System.out.println("solo esa en la primera");
         }
         */
         
         Iterator<Integer> it = lista1.iterator();
         
         Iterator<Integer> it2 = lista2.iterator();
         
        while(it.hasNext() && it2.hasNext() ){
            int num = it.next();
            int num2 = it2.next();
            if(num>num2)
                lista3.add(num);
                else
                lista3.add(num2);
        }
        
                
        
        System.out.println(lista3);

}


}
