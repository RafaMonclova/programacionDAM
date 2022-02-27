
package polimorfismo;

/**
 *
 * @author rafa
 */
public class EnemigoBase {
    
    
    int vida;
    
    public EnemigoBase(){
        vida = 10;
    }
    
    public EnemigoBase(int vida){
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void estado(){
        System.out.println("Soy enemigo con vida "+vida);
    }
    
}
