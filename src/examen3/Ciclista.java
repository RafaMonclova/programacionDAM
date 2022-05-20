/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class Ciclista {
    
    private int numero;
    private String nombre;
    private int edad;
    private String equipo;

    public Ciclista(int numero, String nombre, int edad, String equipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Ciclista{" + "numero=" + numero + ", nombre=" + nombre + ", edad=" + edad + ", equipo=" + equipo + '}';
    }
    
    
    
    
}
