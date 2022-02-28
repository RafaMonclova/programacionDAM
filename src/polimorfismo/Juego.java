
package polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author rafa
 */
public class Juego {
    
    
    public static void main(String[] args){
        
        ArrayList<EnemigoBase> enemigos = new ArrayList();
        
        for(int i = 0;i<10;i++){
            
            int porcentaje = (int)(int)((Math.random()*99)+1);
            
            if(porcentaje <= 34){
                EnemigoBase e = new EnemigoBase();
                enemigos.add(e);
            }
            if(porcentaje >= 35 && porcentaje <= 67){           
                Esqueleto esq = new Esqueleto();
                enemigos.add(esq);             
            }
            if(porcentaje >= 68){
                Ogro o = new Ogro();
                enemigos.add(o);
            }
            
            
        }
        
        int acumulador = 0;
        for(EnemigoBase e : enemigos){         
            e.estado();  
            acumulador += e.getVida();
        }
        
        double media = acumulador/enemigos.size();
        System.out.println("Media de vida: "+media);
        
    }
    
    
}
