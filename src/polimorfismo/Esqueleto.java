
package polimorfismo;

/**
 *
 * @author rafa
 */
public class Esqueleto extends EnemigoBase{
    
    public Esqueleto(){
        super.vida = 3;
    }
    
    public Esqueleto(int vida){
        super.vida = vida;
    }
    
    public void estado(){
        System.out.println("Soy esqueleto con vida "+vida);
    }
    
}
