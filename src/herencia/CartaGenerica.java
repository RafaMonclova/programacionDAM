
package herencia;

/**
 *
 * @author rafa
 */
public class CartaGenerica {
    
    private int numero;
    private String palo;

    public CartaGenerica(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    public CartaGenerica(){
        numero = 0;
        palo = "";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    public String toString(){
        return "La carta es el "+numero+" de "+palo;
    }
    
    public void mostrarCarta(){
        System.out.println("La carta es el "+numero+" de "+palo);
    }
    
}
