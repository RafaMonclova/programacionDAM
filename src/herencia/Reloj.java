
package herencia;

/**
 *
 * @author rafa
 */
public class Reloj {
    
    private int hora;
    private int minuto;
    private int segundo;
    
    public Reloj(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    
    public Reloj(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public void setTime(int hora, int minuto, int segundo){
        
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        
    }
    
    public void display(){
        
        System.out.println("Son las "+hora+":"+minuto+":"+segundo);
        
    }
    
    public void tictac(){
        
        while (segundo >= 3600){
            hora++;
            segundo = segundo - 3600;
        }

        while (segundo >= 59){
            minuto++;
            segundo = segundo - 60;
        }
    
    segundo += 1;
        
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    
    
    
    
}
