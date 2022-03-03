
package abstractos;

/**
 *
 * @author alumno
 */
abstract public class Figura {
    
    protected String color;
    protected boolean relleno;
    
    
    public Figura(){
        color = "";
        relleno = false;
    }

    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    
    @Override
    public String toString(){
        return "FIGURA. Color: "+color+", Relleno: "+relleno;
    }
    
    abstract public double getArea();
    abstract public double getPerimetro();
}
