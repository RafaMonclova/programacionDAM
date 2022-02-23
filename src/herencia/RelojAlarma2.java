
package herencia;

/**
 *
 * @author rafa
 */
public class RelojAlarma2 extends Reloj{
    
    
    private int horaAlarma;
    private int minutoAlarma;
    
    public RelojAlarma2(){
        
        super();
        this.horaAlarma = 0;
        this.minutoAlarma = 0;
        
    }
    
    public void setAlarm(int hora, int minuto){
        
        this.horaAlarma = hora;
        this.minutoAlarma = minuto;
        
    }
    
    @Override
    public void tictac(){
        
        super.tictac();
        if(super.getHora() == horaAlarma && super.getMinuto() == minutoAlarma && super.getSegundo() == 0){
            
            System.out.println("Alarma sonando!!!");
            
        }
    }
    
}
