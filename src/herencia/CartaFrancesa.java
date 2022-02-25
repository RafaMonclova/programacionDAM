
package herencia;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class CartaFrancesa extends CartaGenerica{
    
    public CartaFrancesa(){
        super();
    }
    
    public CartaFrancesa(int numero, String palo){
        super(numero,palo);
    }
    
    public void setNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 13");
        int nuevoNumero = sc.nextInt();
        while(nuevoNumero < 1 || nuevoNumero > 13){
            System.out.println("Introduce un número entre 1 y 13");
            nuevoNumero = sc.nextInt();  
        }
    
        super.setNumero(nuevoNumero);
    }
    
    void setPalo(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un palo");
        String nuevoPalo = sc.nextLine(); 
            while(!nuevoPalo.equals("Corazones") && !nuevoPalo.equals("Picas") && !nuevoPalo.equals("Rombos") && !nuevoPalo.equals("Treboles")){
                System.out.println("Introduce un palo: Corazones,Picas,Rombos,Treboles");
                nuevoPalo = sc.nextLine();  
            }
    
        super.setPalo(nuevoPalo);    
    }
    
    @Override
    public String toString(){
        
        String salida = "";
        switch(super.getNumero()){
                
            case 11:
                salida = "La carta es la jota de "+super.getPalo();
            break;
            case 12:
                salida = "La carta es la reina de "+super.getPalo();
            break;
            case 13:
                salida = "La carta es el rey de "+super.getPalo();
            break;
            default:
                salida = "La carta es el "+super.getNumero()+" de "+super.getPalo();
            break;    
        }
        return salida;
    }
    
    @Override
    public void mostrarCarta(){
        
        switch(super.getNumero()){
            
            case 11:
                System.out.println("La carta es la jota de "+super.getPalo());
            break;
            case 12:
                System.out.println("La carta es la reina de "+super.getPalo());
            break;
            case 13:
                System.out.println("La carta es el rey de "+super.getPalo());
            break;
            default:
                System.out.println("La carta es el "+super.getNumero()+" de "+super.getPalo());
            break;  
        }
        
    }
    
}
