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
public class Camion extends VehiculoCarga{

    
    public Camion(){
        super();
    }

    public Camion(int cargaMax, String matricula, int duracionAlquiler) {
        super(cargaMax, matricula, duracionAlquiler);
    }
    
    
    @Override
    public double alquiler() {
        return (50*duracionAlquiler) + (20*cargaMax) + 40;
    }
    
    @Override
    public void recibo(){
        
        System.out.println("------CAMION-------");
        super.recibo();
        
    }
    
    
    
    
}
