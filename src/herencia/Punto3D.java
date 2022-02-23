
package herencia;

/**
 *
 * @author rafa
 */
public class Punto3D extends Punto2D{
    
    
    private int z;
    
    public Punto3D(){
        super();
        this.z = 0;
    }
    
    public Punto3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public String toString(){
        return "("+super.getX() + "," + super.getY() + "," + this.z + ")";
    }
    
    
}
