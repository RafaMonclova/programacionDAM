/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author ed
 */
public class Trabajador {
    private String nombre;
    private double nomina;
    private int horasExtras;
    private int tipoTrabajador;
    public final static int DIRECTOR=0;//podria entrar dentro de tipoTrabajador
    public final static int SUBDIRECTOR=1;

    public Trabajador(String nombre, double nomina) {
        this.nombre = nombre;
        this.nomina = nomina;
        this.horasExtras = 0;
        this.tipoTrabajador = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNomina() {
        return nomina;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipo(int tipo) {
        this.tipoTrabajador = tipo;
    }
}
