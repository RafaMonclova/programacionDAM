
package interfaces;

/**
 *
 * @author rafa
 */
public class TestResizableCirculo {
    
    public static void main(String[] args){
        
        ResizableCirculo rc1 = new ResizableCirculo(4);
        
        System.out.println("AREA: "+rc1.getArea());
        System.out.println("PERIMETRO: "+rc1.getPerimetro());
        
        System.out.println("-----");
        System.out.println("Resize 50%");
        System.out.println("-----");
        rc1.resize(50);
        
        System.out.println("AREA: "+rc1.getArea());
        System.out.println("PERIMETRO: "+rc1.getPerimetro());
    }
    
    
    
    
}
