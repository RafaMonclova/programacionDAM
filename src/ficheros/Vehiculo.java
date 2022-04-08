/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Vehiculo {
    
    private String matricula;
    private String marca;
    private double tamañoDeposito;
    private String modelo;

    public Vehiculo(String matricula, String marca, double tamañoDeposito, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.tamañoDeposito = tamañoDeposito;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamañoDeposito() {
        return tamañoDeposito;
    }

    public void setTamañoDeposito(double tamañoDeposito) {
        this.tamañoDeposito = tamañoDeposito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return matricula + ", "+ marca + ", " + tamañoDeposito + ", " + modelo;
    }
    
    
    
    
}
