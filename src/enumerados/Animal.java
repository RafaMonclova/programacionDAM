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
abstract public class Animal{
    
    String nombre;
    String especie;
    Alimentacion alimentacion;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Especie: " + especie +", Alimentación: "+alimentacion+ ", Ruido: "+ruido();
    }
    
    
    
    abstract public String ruido();

    

    
    
    
}
