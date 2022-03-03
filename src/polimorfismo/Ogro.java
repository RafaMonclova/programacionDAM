
package polimorfismo;

/**
 *
 * @author rafa
 */
public class Ogro extends EnemigoBase{
    
    public Ogro(){
        super.vida = 50;
    }
    
    public Ogro(int vida){
        super.vida = vida;
    }
    
    @Override
    public void estado(){
        System.out.println("Soy ogro con vida "+vida);
    }
    
    
}
