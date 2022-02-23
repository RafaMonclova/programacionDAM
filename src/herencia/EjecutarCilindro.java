
package herencia;

/**
 *
 * @author rafa
 */
public class EjecutarCilindro {
    public static void main(String[] args){
        
        Cilindro c1 = new Cilindro();
        System.out.println("Su radio es: "+c1.getRadio());
        System.out.println("Su altura es: "+c1.getAltura());
        System.out.println("Su color es: "+c1.getColor());
        System.out.println("El área de la base es: "+c1.getArea());
        System.out.println("Su volumen es: "+c1.getVolumen());
        
        Cilindro c2 = new Cilindro(5.0,2.0);
        System.out.println("Su radio es: "+c2.getRadio());
        System.out.println("Su altura es: "+c2.getAltura());
        System.out.println("Su color es: "+c2.getColor());
        System.out.println("El área de la base es: "+c2.getArea());
        System.out.println("Su volumen es: "+c2.getVolumen());
    }
}
