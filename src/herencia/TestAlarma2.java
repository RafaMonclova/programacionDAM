
package herencia;
import javax.swing.Timer;
/**
 *
 * @author rafa
 */
public class TestAlarma2 {
    public static void main(String[] args){
        
        
        RelojAlarma2 miAlarma2 = new RelojAlarma2();
        
        miAlarma2.setTime(18, 35, 23);
        miAlarma2.setAlarm(18, 52);
        
        int incremento = 1000;
        while(incremento > 0){
            miAlarma2.tictac();
            incremento--;
            miAlarma2.display();
        }
        
    }
}
