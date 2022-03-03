/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author alumno
 */
public class Circulo implements GeometricObject{
    
    protected double radio;
    
    public Circulo(){
        radio = 1;
    }
    
    public Circulo(double radio){
        this.radio = radio;
    
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double getArea() {
        return Math.PI * (radio*radio);
    }
    
    
    
}
