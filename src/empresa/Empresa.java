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
public class Empresa {
    
    public static void main(String[] args){
        
        Trabajador t1 = new Director("Directivo",800);
        Trabajador t2 = new Trabajador("Trabajador",400);
        
        Trabajador[] arrayTrabajadores = new Trabajador[2];
        
        arrayTrabajadores[0] = t1;
        arrayTrabajadores[1] = t2;
        
        t2.setHorasExtras(10);
        
        System.out.println(CostoPersonal.costoDelPersonal(arrayTrabajadores));
        
        
        
    }
    
    
}
