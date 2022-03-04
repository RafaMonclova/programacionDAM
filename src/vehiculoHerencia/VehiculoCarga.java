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
abstract public class VehiculoCarga extends Vehiculo{
    
    
    protected int cargaMax;

    public VehiculoCarga(){
        super();
        cargaMax = 0;
    }

    public VehiculoCarga(int cargaMax, String matricula, int duracionAlquiler) {
        super(matricula, duracionAlquiler);
        this.cargaMax = cargaMax;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
    
    @Override
    abstract public double alquiler();
    
    @Override
    public void recibo(){
        
        System.out.println("MATRICULA: "+matricula);
        System.out.println("DURACION: "+duracionAlquiler);
        System.out.println("TARA: "+cargaMax);
        System.out.println("IMPORTE: "+this.alquiler());
        
    }
    
    
    
}
