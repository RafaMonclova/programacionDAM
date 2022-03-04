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
public class ResizableCirculo extends Circulo implements Resizable{

    
    public ResizableCirculo(double radio){
        super(radio);
    }
    
    @Override
    public void resize(double porcentaje) {
        super.radio = super.radio * porcentaje / 100;
    }
    
    
    
    
}
