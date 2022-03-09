/*
Crearemos una clase Saltador con:

String Nombre:

Int  Edad:

Una lista
de saltos que denominaremos records:
está lista se recomiendo que sea estática. Tendrá una entrada por cada saltador
con su mejor salto. Estará ordenada de mayor a menor

registrarSalto(distancia):
 si es un nuevo record para el saltador
se sustituye su entrada en la lista y se reordena

Int ComparreTo
(Saltador) compara los saltadores
según su record, a mayor  distancia de
record está clasificado antes.

Añade los
contructores  y métodos ToString ,
mostrar, get y set que creas oportuno
 */
package saltos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author robertruhe
 */
public class Saltador implements Comparable<Saltador> {
    private String Nombre;
    private int Edad;
    private static ArrayList<Salto> records = new ArrayList<Salto>();
   
    public Saltador(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }
    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public static ArrayList<Salto> getRecords() {
        return records;
    }
   
    public void registrarSalto(int distancia){
        Salto nuevoSalto = new Salto(Nombre, distancia);
        boolean aparece = false;
        for(int i = 0; i < records.size(); i++){
            if (records.get(i).getNombre().equals(Nombre)){
                aparece = true;
                if (records.get(i).compareTo(nuevoSalto) > 0){
                    //records.set(i, nuevoSalto);
                    records.get(i).setDistancia(distancia);
                   
                }
            }
        }
        if (!aparece){
            records.add(nuevoSalto);
        }
        Collections.sort(records);
    }
    /*
    public String cadenaRecords(){
        String devolver="";
         for(Salto miSalto : records){
             devolver+=miSalto+"";
             
         }
         return devolver;
    }
      */      
    @Override
    public int compareTo(Saltador saltador){
        int distancia1=0;
        int distancia2=0;
           for(int i = 0; i < records.size(); i++){
               if (records.get(i).getNombre().equals(Nombre)){
                    distancia1=records.get(i).getDistancia();
               }
               if (records.get(i).getNombre().equals(saltador.Nombre)){
                    distancia2=records.get(i).getDistancia();
               }
               
           }
        return distancia2-distancia1;
    }
}
