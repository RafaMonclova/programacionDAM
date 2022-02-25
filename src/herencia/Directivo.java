
package herencia;

/**
 *
 * @author rafa
 */
public class Directivo extends Empleado{
    
    private double plusDireccion;
    private double dietas;
    private String cargo;
    
    public Directivo(){
        super();
        plusDireccion = 0;
        dietas = 0;
        cargo = "";
    }

    public Directivo(String nombre, String apellidos, String dni, String fechaContrato, double sueldoBase, double baseHorasExtra, int numHorasExtra, double plusDireccion, double dietas, String cargo) {
        super(nombre, apellidos, dni, fechaContrato, sueldoBase, baseHorasExtra, numHorasExtra);
        this.plusDireccion = plusDireccion;
        this.dietas = dietas;
        this.cargo = cargo;
    }
    
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo() + plusDireccion + dietas;
    }
    
    public void imprimirNomina(){
        
        System.out.println("PLUS DIRECCIÓN: "+plusDireccion);
        System.out.println("DIETAS: "+dietas);
        System.out.println("CARGO: "+cargo);
    }
    
    
    
    
}
