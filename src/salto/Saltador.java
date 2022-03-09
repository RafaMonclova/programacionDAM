
package salto;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rafa
 */
public class Saltador implements Comparable<Saltador>{
    
    
    private String nombre;
    private int edad;
    private static ArrayList<Salto> records = new ArrayList<Salto>();

    
    public Saltador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        Salto s = new Salto(nombre,0);
        records.add(s);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static ArrayList<Salto> getRecords() {
        return records;
    }

    public static void setRecords(ArrayList<Salto> records) {
        Saltador.records = records;
    }
 
    public int getIndex(String nombre){
        
        for(int i = 0;i<records.size();i++){
            if(records.get(i).getNombre().equals(nombre)){
                return i;
            }
            
        }
        
        return -1;
    }
    
    public void registrarSalto(int distancia){
        
        Salto nuevo = new Salto(nombre,distancia);
        int num = getIndex(nombre);
        
            
        if(records.get(num).compareTo(nuevo)>0){
            records.set(num,nuevo);
        }
            
        
 
        Collections.sort(records);
        
    }

    @Override
    public int compareTo(Saltador s) {
        
        int posObjeto = records.indexOf(this.nombre);
        int posParametro = records.indexOf(s.nombre);
        return posObjeto-posParametro;
        
    }

    
    
    
    
    public void mostrar(){
        
        for(Salto s : records){
            
            System.out.println(s.getNombre());
            System.out.println(s.getDistancia());
            
        }
        
    }
    
    
}
