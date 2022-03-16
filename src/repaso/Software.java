/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author alumno
 */
public class Software extends Compra{

    public Software(String nombre, int cantidad, double precio) {
        super(nombre, cantidad, precio);
    }
    
    @Override
    public double valor(){
        return super.getPrecioProd() * 21;
    }
    
}
