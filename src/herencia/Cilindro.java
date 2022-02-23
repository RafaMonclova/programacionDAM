
package herencia;

/**
 *
 * @author rafa
 */
public class Cilindro extends Circulo{
    
    private double altura;
    
    public Cilindro(){
        
        super();//llama el constructor de Circulo()
        this.altura = 1.0;
        
    }
    
    public Cilindro(double altura){
        
        super();//llama el constructor de Circulo()
        this.altura = altura;
        
    }
    
    public Cilindro(double altura, double radio){
        
        super(radio);//llama el constructor de Circulo(double radio)
        this.altura = altura;
        
    }
    
    public Cilindro(double altura, double radio, String color){
        
        super(radio,color);//llama el constructor de Circulo(double radio, String color)
        this.altura = altura;
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getVolumen(){
        return getArea()*altura;
    }
    
    public String toString(){
        return "Esto es un cilindro";
    }
    
}
