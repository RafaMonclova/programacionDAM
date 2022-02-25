
package herencia;

/**
 *
 * @author rafa
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private String dni;
    
    public Persona(){
        nombre = "";
        apellidos = "";
        dni = "";
    }

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + '}';
    }
    
    public void mostrar_info(){
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDOS: "+apellidos);
        System.out.println("DNI: "+dni);
    }
    
    
}
