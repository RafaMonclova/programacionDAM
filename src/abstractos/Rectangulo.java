
package abstractos;

/**
 *
 * @author alumno
 */
public class Rectangulo extends Figura implements Printable{

    protected double ancho;
    protected double alto;
    
    public Rectangulo(){
        super();
        ancho = 0;
        alto = 0;
    }

    public Rectangulo(double ancho, double alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(double ancho, double alto, String color, boolean relleno) {
        super(color, relleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
     
    
    @Override
    public double getArea() {
        return ancho * alto;
    }

    @Override
    public double getPerimetro() {
        return ancho*2 + alto*2;
    }
    
    @Override
    public String toString(){
        return "RECTANGULO. AREA:"+getArea()+", PERIMETRO: "+getPerimetro();
    }

    @Override
    public void printScreen() {
        System.out.println("ALTO: "+alto);
        System.out.println("ANCHO: "+ancho);
        System.out.println("AREA: "+getArea());
        System.out.println("PERIMETRO: "+getPerimetro());
    }
    
}
