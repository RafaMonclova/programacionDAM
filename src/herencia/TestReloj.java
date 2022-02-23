
package herencia;

/**
 *
 * @author rafa
 */
public class TestReloj {
    public static void main(String[] args){
        
        Reloj miReloj = new Reloj();
        
        miReloj.setTime(18, 35, 23);
        
        int incremento = 1000;
        
        while(incremento > 0){
            miReloj.tictac();
            incremento--;
            miReloj.display();
        }
        
        
    }
}
