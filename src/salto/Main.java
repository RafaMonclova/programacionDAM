
package salto;

/**
 *
 * @author rafa
 */
public class Main {
    
    
    public static void main(String[] args){
        
        Saltador s1 = new Saltador("Rafa",24);
        Saltador s2 = new Saltador("Pepe",45);
        Saltador s3 = new Saltador("Alberto",69);
        
        s1.registrarSalto((int)(Math.random()*100)+1);
        s1.registrarSalto((int)(Math.random()*100)+1);
        
        s2.registrarSalto((int)(Math.random()*100)+1);
        s2.registrarSalto((int)(Math.random()*100)+1);
        
        s3.registrarSalto((int)(Math.random()*100)+1);
        s3.registrarSalto((int)(Math.random()*100)+1);
        
        System.out.println(Saltador.getRecords());
        
    }
    
    
}
