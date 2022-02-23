
package herencia;

/**
 *
 * @author rafa
 */
public class TestAlarma {
    
    public static void main(String[] args){
        
        RelojAlarma miAlarma = new RelojAlarma();
        
        miAlarma.setTime(18, 35, 23);
        miAlarma.setAlarm(18, 52);
        
        int incremento = 1000;
        
        while(incremento > 0){
            miAlarma.tictac();
            incremento--;
            miAlarma.display();
        }
        
    }
    
    
    
    
    
}
