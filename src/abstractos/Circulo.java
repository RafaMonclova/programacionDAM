
package abstractos;

/**
 *
 * @author alumno
 */
public class Circulo extends Figura implements Printable{
    
    
    protected double radio;

    public Circulo(){
        super();
        radio = 1;
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(double radio, String color, boolean relleno) {
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double getArea() {
        return Math.PI * (radio*radio);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    @Override
    public String toString(){
        return "CIRCULO. AREA:"+getArea()+", PERIMETRO: "+getPerimetro()+super.toString();
    }

    @Override
    public void printScreen() {
        //System.out.println(this); imprime toString
        System.out.println("RADIO: "+radio);
        System.out.println("AREA: "+getArea());
        System.out.println("PERIMETRO: "+getPerimetro());
    }
    
    
}
