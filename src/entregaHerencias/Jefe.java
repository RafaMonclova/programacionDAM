/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaHerencias;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Jefe extends Empleado{
    
    protected boolean despacho;
    protected Secretario secretarioSupervisa;
    protected ArrayList<Vendedor> listaVendedores;
    protected Coche coche;
    

    public Jefe(boolean despacho, Secretario secretarioSupervisa, ArrayList listaVendedores, Coche coche, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.secretarioSupervisa = secretarioSupervisa;
        this.listaVendedores = listaVendedores;
        this.coche = coche;
    }

    
    @Override
    public double liquidoAPercibir(){
        return salario * 0.2;
    }
    
    @Override
    public void imprimir(){
        
        System.out.println("-------JEFE DE ZONA------");    
        super.imprimir();
        
        System.out.println("DESPACHO "+despacho);
        System.out.println("SECRETARIO: ");
        System.out.println("================================");
        secretarioSupervisa.imprimir();
        System.out.println("================================");
        System.out.println("LISTA DE VENDEDORES: ");
        System.out.println("================================");
        for(Empleado v : listaVendedores){
            v.imprimir();
        }
        System.out.println("================================");
        
        System.out.println();
        
        System.out.println("----DATOS DEL VEHÍCULO------");
        System.out.println(coche);
        
       
    }
    
    public void cambiarSecretario(boolean despacho, int fax,String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario){
        
        Secretario s = new Secretario(despacho, fax, nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        setSecretarioSupervisa(s);
    }
    
    public void cambiarCoche(String matricula, String marca,String modelo){
        
        this.coche = new Coche(matricula,marca,modelo);
        
    }
    
    public void altaVendedor(Coche coche, int movil, String areaVenta, double porcentajeComision, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario){
        

        Vendedor v = new Vendedor(coche, movil, areaVenta, porcentajeComision, nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        if(listaVendedores.contains(v)){
            System.out.println("Error, ya existe un vendedor con ese DNI");
        }
        else
            listaVendedores.add(v);
        
    }
    
    public void bajaVendedor(String DNI){
        
        Iterator<Vendedor> it = listaVendedores.iterator();
        
        while(it.hasNext()){
            
            Vendedor actual = it.next();
            if(actual.getDNI().equals(DNI)){
                listaVendedores.remove(actual);
            }
            
        }
        
    }

    public boolean isDespacho() {
        return despacho;
    }

    public void setDespacho(boolean despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretarioSupervisa() {
        return secretarioSupervisa;
    }

    public void setSecretarioSupervisa(Secretario secretarioSupervisa) {
        this.secretarioSupervisa = secretarioSupervisa;
    }

    public ArrayList getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ArrayList listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
    
    
}
