
package entregaHerencias;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class Coche {
    
    
    protected String matricula;
    protected String marca;
    protected String modelo;

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        return "MATRÍCULA: "+matricula + ", MARCA: "+marca+", MODELO: "+modelo;
        
    }
    
}
