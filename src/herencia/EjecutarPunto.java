
package herencia;

/**
 *
 * @author rafa
 */
public class EjecutarPunto {
    public static void main(String[] args){
        
        //Punto2D
        Punto2D p2a = new Punto2D(1,2);
        System.out.println(p2a);
        Punto2D p2b = new Punto2D();
        System.out.println(p2b);
        
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);
        
        //Punto3D
        Punto3D p3a = new Punto3D(11,12,13);
        System.out.println(p3a);
        Punto3D p3b = new Punto3D();
        System.out.println(p3b);
        
        p3a.setX(21);
        p3a.setY(22);
        p3a.setZ(23);
        System.out.println(p3a);
        
    }
    
    
    
}
