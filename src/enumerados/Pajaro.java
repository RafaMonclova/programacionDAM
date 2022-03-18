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
public class Pajaro extends Animal{

    public Pajaro(String nombre) {
        super(nombre, "Passer domesticus");
        super.alimentacion = Alimentacion.omnivoro;
    }
    
    
    @Override
    public String ruido() {
        return "Pio pio";
    }
    
}
