package repaso;
public class Compra {
    /*
    static final int HARDWARE=0;
    static final int SOFTWARE=1;
    static final int OTRO=2;
    */
    String nomProd;
    //int tipoProd;
    int cant;
    double precioProd;

    public Compra(String nombre, int cantidad, double precio){
        //this.tipoProd=tipo;
        this.cant=cantidad;
        this.nomProd=nombre;
        this.precioProd=precio;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    /*
    public int getTipoProd() {
        return tipoProd;
    }


    public void setTipoProd(int tipoProd) {
        this.tipoProd = tipoProd;
    }
*/
    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }
    
    public double valor(){
        return this.getPrecioProd() * 5.5;
    }
    
    public int puntaje(){
        return 1;
    }
        
}
		