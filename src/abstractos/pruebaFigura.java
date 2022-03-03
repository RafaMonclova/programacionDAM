
package abstractos;

/**
 *
 * @author alumno
 */
public class pruebaFigura {
    
    public static void main(String[] args){
        
        Figura f1 = new Circulo(5.5,"ROJO",false);
        System.out.println(f1);
        System.out.println(f1.getArea());
        System.out.println(f1.getPerimetro());
        System.out.println(f1.getColor());
        System.out.println(f1.isRelleno());
        //System.out.println(f1.getRadio()); error, figura no tiene radio
        
        Circulo c1 = (Circulo)f1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimetro());
        System.out.println(c1.getColor());
        System.out.println(c1.isRelleno());
        System.out.println(c1.getRadio());//al castearlo a circulo, ya se puede acceder a getRadio()
        
        //Figura f2 = new Figura(); error, es abstracto
        
        Figura f3 = new Rectangulo(1.0,2.0,"ROJO",false);
        System.out.println(f3);
        System.out.println(f3.getArea());
        System.out.println(f3.getPerimetro());
        System.out.println(f3.getColor());
        //System.out.println(f3.getAlto())); error, figura no tiene alto
        
        Rectangulo r1 = (Rectangulo)f3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getAlto());//al castearlo a rectangulo, ya se puede acceder a getAlto()
        
        Figura f4 = new Cuadrado(6.6);
        System.out.println(f4);
        System.out.println(f4.getArea());
        System.out.println(f4.getColor());
        //System.out.println(f4.getLado()); error, figura no tiene lado
        
        Rectangulo r2 = (Rectangulo)f4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getLado()); error, al castearlo a rectangulo, sigue sin tener lado
        System.out.println(r2.getAlto());
        
        Cuadrado cuad1 = (Cuadrado)r2;
        System.out.println(cuad1);
        System.out.println(cuad1.getArea());
        System.out.println(cuad1.getColor());
        System.out.println(cuad1.getLado());//al castearlo a cuadrado, ya se puede acceder a getLado()
        System.out.println(cuad1.getAlto());
        
        
        
    }
    
    
}
