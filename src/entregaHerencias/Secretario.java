/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaHerencias;

/**
 *
 * @author alumno
 */
public class Secretario extends Empleado{
    
    private boolean despacho;
    private int fax;

    
    public Secretario(boolean despacho, int fax, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }
    
    @Override
    public void imprimir(){
        
        System.out.println("-------SECRETARIO------");    
        super.imprimir();
        
        System.out.println("DESPACHO: "+despacho);
        System.out.println("FAX: "+fax);
        
        
    }
    
    @Override
    public double liquidoAPercibir(){
        return salario * 0.05;
    }

    public boolean isDespacho() {
        return despacho;
    }

    public void setDespacho(boolean despacho) {
        this.despacho = despacho;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    
    
    
    
    
}
