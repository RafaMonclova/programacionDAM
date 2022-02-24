
package herencia;

/**
 *
 * @author rafa
 */
public class MenuInfantil extends Menu{
    
    private String regalo;
    
    public MenuInfantil(){
        super();
        regalo = "soldado";
    }
    
    public MenuInfantil(String principal, int bebida, int postre, String regalo){
        super(principal,bebida,postre);
        this.regalo = regalo;
    }

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }
    
    @Override
    public double importe(){    
        return 12;     
    }
    
    @Override
    public void mostrar(){
        
        System.out.println("PLATO: "+super.getPrincipal());
        
        switch(super.getPostre()){
            case 1:
                System.out.println("POSTRE: Fruta");
            break;
            case 2:
                System.out.println("POSTRE: Helado");
            break;    
            default:
                System.out.println("POSTRE: Otros");
        }
        
        switch(super.getBebida()){
            case 1:
                System.out.println("BEBIDA: Refresco");
            break;
            case 2:
                System.out.println("BEBIDA: Zumo");
            break;    
            default:
                System.out.println("BEBIDA: Otros");
        }
        
        System.out.println("REGALO: "+regalo);
        
        
        System.out.println("-----------------------------------");
        System.out.println("IMPORTE: "+importe());
        
        
    }
    
}
