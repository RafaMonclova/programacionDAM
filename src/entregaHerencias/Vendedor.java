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
public class Vendedor extends Empleado{

    protected Coche coche;
    protected int movil;
    protected String areaVenta;
    protected ArrayList<Cliente> listaClientes = new ArrayList();
    protected double porcentajeComision;

    public Vendedor(Coche coche, int movil, String areaVenta, double porcentajeComision, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario, Empleado supervisor) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario, supervisor);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.porcentajeComision = porcentajeComision;
    }
    
    public Vendedor(Coche coche, int movil, String areaVenta, double porcentajeComision, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.porcentajeComision = porcentajeComision;
    }

    
    @Override
    public void imprimir(){
        
        System.out.println("-------VENDEDOR------");    
        super.imprimir();
        
        System.out.println("TELÉFONO MÓVIL: "+movil);
        System.out.println("ÁREA DE VENTA: "+areaVenta);
        System.out.println("LISTA DE CLIENTES: "+listaClientes);
        System.out.println("COMISIÓN(Porcentaje) "+porcentajeComision);
        
        System.out.println();
        
        System.out.println("----DATOS DEL VEHÍCULO------");
        System.out.println(coche);
        
       
    }
    
    public void altaCliente(String DNI, String nombre, String apellidos, int telefono){
        

        Cliente c = new Cliente(DNI,nombre,apellidos,telefono);
        if(listaClientes.contains(c)){
            System.out.println("Error, ya existe un cliente con ese DNI");
        }
        else
            listaClientes.add(c);
        
    }
    
    public void bajaCliente(String DNI){
        
        Iterator<Cliente> it = listaClientes.iterator();
        
        while(it.hasNext()){
            
            Cliente actual = it.next();
            if(actual.getDNI().equals(DNI)){
                listaClientes.remove(actual);
            }
            
        }
        
    }
    
    public void cambiarCoche(String matricula, String marca,String modelo){
        
        this.coche = new Coche(matricula,marca,modelo);
        
    }
    
    @Override
    public double liquidoAPercibir(){
        return salario * 0.1;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    
    
}
