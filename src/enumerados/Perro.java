/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerados;

/**
 *
 * @author alumno
 */
public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre, "Canis familiaris");
        super.alimentacion = Alimentacion.carnivoro;
    }

    
    
    
    @Override
    public String ruido() {
        return "Guau";
    }
    
}
