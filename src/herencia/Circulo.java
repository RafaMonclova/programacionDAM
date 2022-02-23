
package herencia;

/**
 *
 * @author rafa
 */
public class Circulo {
    
    private double radio;
    private String color;
    
    public Circulo(){
        this.radio = 1.0;
        this.color = "red";
    }
    
    public Circulo(double radio){
        this.radio = radio;
        this.color = "red";
    }
    
    public Circulo(double radio, String color){
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString(){
        return "Circulo[Radio: "+radio+", Color: "+color+" ]";
    }
    
    public double getArea(){
        return radio * radio * Math.PI;
    }
    
}
