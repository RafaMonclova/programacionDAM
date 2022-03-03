/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author alumno
 */
public class Director extends Trabajador{
    
    public Director(String nombre, double nomina){
        super(nombre,nomina);
        
    }
    
    @Override
    public double coste(){
        return this.getNomina();
    }
    
}
