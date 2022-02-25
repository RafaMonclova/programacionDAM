
package herencia;

/**
 *
 * @author rafa
 */
public class PruebaCarta {
    
    
    public static void main(String[] args){
        
        CartaGenerica cartaGen = new CartaGenerica();
        CartaEspañola cartaEsp = new CartaEspañola();
        CartaFrancesa cartaFr = new CartaFrancesa();
        
        
        cartaGen.setNumero(4);
        cartaGen.setPalo("Sillas");
        
        cartaEsp.setNumero();
        cartaEsp.setPalo();
        
        cartaFr.setNumero();
        cartaFr.setPalo();
        
        cartaGen.mostrarCarta();
        cartaEsp.mostrarCarta();
        cartaFr.mostrarCarta();
        
        
        
    }
    
    
    
    
}
