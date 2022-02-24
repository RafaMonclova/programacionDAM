package herencia;

/**
 *
 * @author rafa
 */
public class Menu {

    private final double iva = 0.21;
    private double descuento;
    private String principal;
    private int bebida;
    private int postre;

    public Menu() {

        descuento = 0;
        principal = "Otros";
        bebida = 1;
        postre = 1;
    }

    public Menu(String principal, int bebida, int postre) {

        this.principal = principal;
        this.bebida = bebida;
        this.postre = postre;

    }

    public double getIva() {
        return iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public int getBebida() {
        return bebida;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }

    public int getPostre() {
        return postre;
    }

    public void setPostre(int postre) {
        this.postre = postre;
    }
    

    public double importe() {
        double acumulador = 0;

        switch (principal) {
            case "Entrecot":
                acumulador += 15;
                break;
            case "Pez Espada":
                acumulador += 13;
                break;
            case "Carrillada":
                acumulador += 10;
                break;
            case "Dorada":
                acumulador += 20;
                break;
            default:
                acumulador += 13;
                break;
        }
        switch (bebida) {
            case 1:
                acumulador += 1;
                break;
            case 2:
                acumulador += 1.5;
                break;

            default:
                acumulador += 2;
                break;
        }
        switch (postre) {
            case 1:
                acumulador += 2;
                break;
            case 2:
                acumulador += 3;
                break;

            default:
                acumulador += 4;
                break;
        }

        return acumulador;
    }

    public void mostrar() {
        System.out.println("PLATO: "+principal);
        
        switch(postre){
            case 1:
                System.out.println("POSTRE: Fruta");
            break;
            case 2:
                System.out.println("POSTRE: Helado");
            break;    
            default:
                System.out.println("POSTRE: Otros");
        }
        
        switch(bebida){
            case 1:
                System.out.println("BEBIDA: Refresco");
            break;
            case 2:
                System.out.println("BEBIDA: Vino");
            break;    
            default:
                System.out.println("BEBIDA: Otros");
        }
        
        
        System.out.println("-----------------------------------");
        System.out.println("IMPORTE: "+importe());

    }

}
