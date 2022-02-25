
package herencia;

/**
 *
 * @author rafa
 */
public class Programador extends Empleado{
    
    
    public Programador(){
        super();
    }

    public Programador(String nombre, String apellidos, String dni, String fechaContrato, double sueldoBase, double baseHorasExtra, int numHorasExtra) {
        super(nombre, apellidos, dni, fechaContrato, sueldoBase, baseHorasExtra, numHorasExtra);
    }
    
    public void pedirVacaciones(){  
        System.out.println("Hay que llegar a la siguiente entrega como sea, hasta entonces nadie puede coger vacaciones");     
    }
    
    public void pedirAumento(){
        System.out.println("El jefe de departamento está de vacaciones inténtelo de nuevo cuando vuelva");
    }
    
    /*
    public void imprimirNomina(){
        super.imprimirNomina();
    }
    */
    
}
