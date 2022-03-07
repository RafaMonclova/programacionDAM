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
abstract public class VehiculoTransporte extends Vehiculo{
    
    protected int numPlazas;
    
    public VehiculoTransporte(){
        super();
        numPlazas = 0;
    }

    public VehiculoTransporte(int numPlazas, String matricula, int duracionAlquiler) {
        super(matricula, duracionAlquiler);  
        this.numPlazas = numPlazas;
    
        
    } 

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    
    @Override
    abstract public double alquiler();
    
    @Override
    public void recibo(){
        
        System.out.println("MATRICULA: "+matricula);
        System.out.println("DURACION: "+duracionAlquiler);
        System.out.println("PLAZAS: "+numPlazas);
        System.out.println("IMPORTE: "+this.alquiler());
        
    }
    
}
