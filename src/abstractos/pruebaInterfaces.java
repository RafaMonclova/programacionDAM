
package abstractos;

/**
 *
 * @author alumno
 */
public class pruebaInterfaces {
    
    public static void main(String[] args){
        
        Circulo c1 = new Circulo(2, "ROJO", false);
        Rectangulo r1 = new Rectangulo(3,4);
        Cuadrado cuad1 = new Cuadrado(2);
        
        System.out.println("CIRCULO");
        c1.printScreen();
        System.out.println("RECTANGULO");
        r1.printScreen();
        System.out.println("CUADRADO");
        cuad1.printScreen();
        
        System.out.println(c1);
        
        
    }
    
}
