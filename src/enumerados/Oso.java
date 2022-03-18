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
public class Oso extends Animal{

    public Oso(String nombre) {
        super(nombre, "Ursus arctos");
        super.alimentacion = Alimentacion.omnivoro;
    }
    
    @Override
    public String ruido() {
        return "Grrr";
    }

    
    
    
}
