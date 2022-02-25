
package herencia;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class CartaEspañola extends CartaGenerica{
    
    public CartaEspañola(){
        super();
    }
    
    public CartaEspañola(int numero, String palo){
        
        super(numero,palo);
        
    }
    
    
    public void setNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 12");
        int nuevoNumero = sc.nextInt();
        while(nuevoNumero < 1 || nuevoNumero > 12){
            System.out.println("Introduce un número entre 1 y 12");
            nuevoNumero = sc.nextInt();  
        }
    
        super.setNumero(nuevoNumero);
    }
    
    
    public void setPalo(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un palo");
        String nuevoPalo = sc.nextLine(); 
            while(!nuevoPalo.equals("Oros") && !nuevoPalo.equals("Espadas") && !nuevoPalo.equals("Copas") && !nuevoPalo.equals("Bastos")){
                System.out.println("Introduce un palo: Oros,Espadas,Copas,Bastos");
                nuevoPalo = sc.nextLine();  
            }
    
        super.setPalo(nuevoPalo);    
    }
    
    @Override
    public String toString(){
        
        String salida = "";
        switch(super.getNumero()){
                
            case 10:
                salida = "La carta es la sota de "+super.getPalo();
            break;
            case 11:
                salida = "La carta es el caballo de "+super.getPalo();
            break;
            case 12:
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
            
            case 10:
                System.out.println("La carta es la sota de "+super.getPalo());
            break;
            case 11:
                System.out.println("La carta es el caballo de "+super.getPalo());
            break;
            case 12:
                System.out.println("La carta es el rey de "+super.getPalo());
            break;
            
            default:
                System.out.println("La carta es el "+super.getNumero()+" de "+super.getPalo());
            break;    
        }
        
    }
    
}
