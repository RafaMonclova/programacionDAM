
package herencia;

/**
 *
 * @author rafa
 */
public class TestAlarma2 {
    
    //temporizador
    public static void delaySegundos(){
        
        try{
            Thread.sleep(1300);
        }catch(InterruptedException e){};
        
    }
    
    public static void main(String[] args){
        
       
        RelojAlarma2 miAlarma2 = new RelojAlarma2();
        
        miAlarma2.setTime(18, 35, 23);
        miAlarma2.setAlarm(18, 52);
        
        int incremento = 10;
        while(incremento > 0){
            
            delaySegundos();
            miAlarma2.tictac();
            incremento--;
            miAlarma2.display();
        }
        
    }
}
