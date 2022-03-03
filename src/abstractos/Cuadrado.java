
package abstractos;

/**
 *
 * @author alumno
 */
public class Cuadrado extends Rectangulo{
    
    public Cuadrado(){
        super();
    }
    
    public Cuadrado(double lado){
        super(lado,lado);
    }

    public Cuadrado(double lado, String color, boolean relleno) {
        super(lado, lado, color, relleno);
    }
    
    public double getLado(){
        return alto;
    }
    
    public void setLado(double lado){
        this.ancho = lado;
        this.alto = lado;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double lado) {
        this.ancho = lado;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double lado) {
        this.alto = lado;
    }
    
    @Override
    public String toString(){
        return "CUADRADO. AREA:"+getArea()+", PERIMETRO: "+getPerimetro();
    }
    
    
    
    
    
}
