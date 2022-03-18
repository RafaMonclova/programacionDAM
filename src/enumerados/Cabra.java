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
public class Cabra extends Animal{

    public Cabra(String nombre) {
        super(nombre, "Capra aegagrus hircus");
        super.alimentacion = Alimentacion.herbivoro;
    }
    
    
    @Override
    public String ruido() {
        return "Be";
    }
    
}
