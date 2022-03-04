/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoHerencia;

/**
 *
 * @author alumno
 */
public class Bus extends VehiculoTransporte{

    
    public Bus(){
        super();
    }

    public Bus(int numPlazas, String matricula, int duracionAlquiler) {
        super(numPlazas, matricula, duracionAlquiler);
    }
    
 
    
    @Override
    public double alquiler() {
           
        return (duracionAlquiler*50) + (1.5*numPlazas*duracionAlquiler) + 2*numPlazas;
        
    }
    
    @Override
    public void recibo(){
        System.out.println("-----BUS--------");
        super.recibo();
    }
    
    
    
}
