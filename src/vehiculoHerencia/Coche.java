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
public class Coche extends VehiculoTransporte{

    public Coche(){
        super();
    }

    public Coche(int numPlazas, String matricula, int duracionAlquiler) {
        super(numPlazas, matricula, duracionAlquiler);
    }
    

    
    @Override
    public double alquiler() {
        return (duracionAlquiler*50) + (1.5*numPlazas*duracionAlquiler); 
    }
    
    @Override
    public void recibo(){
        
        System.out.println("------COCHE------");
        super.recibo();
      // recibo();
        
    }
    
    
    
}
