
package herencia;

/**
 *
 * @author rafa
 */
public class RelojAlarma{
    
    private Reloj reloj;
    private int horaAlarma;
    private int minutoAlarma;
    
    public RelojAlarma(){
        
        reloj = new Reloj();
        this.horaAlarma = 0;
        this.minutoAlarma = 0;
    }
    
    public RelojAlarma(int horaAlarma, int minutoAlarma, int hora, int minuto, int segundo){
        
        reloj = new Reloj(hora,minuto,segundo);
        this.horaAlarma = horaAlarma;
        this.minutoAlarma = minutoAlarma;
    }
    
    public void setTime(int hora, int minuto, int segundo){
        
        reloj.setTime(hora, minuto, segundo);
        
    }
    
    public void display(){
        reloj.display();
    }
    
    public void setAlarm(int hora, int minuto){
        this.horaAlarma = hora;
        this.minutoAlarma = minuto;
    }
    
    public void tictac(){
        
        reloj.tictac();
        
        if(reloj.getHora() == horaAlarma && reloj.getMinuto() == minutoAlarma && reloj.getSegundo() == 0){
            
            System.out.println("Alarma sonando!!!");
            
        }
        
    }
    
    
    
    
}
