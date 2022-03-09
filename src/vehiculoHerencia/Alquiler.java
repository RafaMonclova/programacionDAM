/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoHerencia;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Alquiler implements Exportable{
    
    
    private Vehiculo[] pedido;
    String empresa;

    public Alquiler(int numVehiculos) {
        Scanner sc = new Scanner(System.in);
        
        this.pedido = new Vehiculo[numVehiculos];
        
        for(int i = 0;i<pedido.length;i++){
            
            System.out.println("Introduce el tipo de vehiculo:");
            char tipo = sc.next().charAt(0);
            sc.nextLine();
            switch(tipo){
            
                case 'C':
                    System.out.println("Introduce matricula:");
                    String matCoche = sc.nextLine();
                    System.out.println("Introduce duracion del alquiler:");
                    int duracionCoche = sc.nextInt();
                    System.out.println("Introduce plazas:");
                    int plazasCoche = sc.nextInt();
                    Vehiculo coche = new Coche(plazasCoche,matCoche,duracionCoche); 
                    pedido[i] = coche;
                break;
                case 'B':
                    System.out.println("Introduce matricula:");
                    String matBus = sc.nextLine();
                    System.out.println("Introduce duracion del alquiler:");
                    int duracionBus = sc.nextInt();
                    System.out.println("Introduce plazas:");
                    int plazasBus = sc.nextInt();
                    Vehiculo bus = new Bus(plazasBus,matBus,duracionBus); 
                    pedido[i] = bus;
                break;
                case 'F':
                    System.out.println("Introduce matricula:");
                    String matFurgo = sc.nextLine();
                    System.out.println("Introduce duracion del alquiler:");
                    int duracionFurgo = sc.nextInt();
                    System.out.println("Introduce plazas:");
                    int cargaFurgo = sc.nextInt();
                    Vehiculo furgo = new Furgoneta(cargaFurgo,matFurgo,duracionFurgo);
                    pedido[i] = furgo;
                break;
                case 'T':
                    System.out.println("Introduce matricula:");
                    String matCamion = sc.nextLine();
                    System.out.println("Introduce duracion del alquiler:");
                    int duracionCamion = sc.nextInt();
                    System.out.println("Introduce plazas:");
                    int cargaCamion = sc.nextInt();
                    Vehiculo camion = new Furgoneta(cargaCamion,matCamion,duracionCamion); 
                    pedido[i] = camion;
                break;
            
        }
            
            
    }
              
        
    }
    
    public double importeTotal(){
        double total = 0;
        for(int i = 0; i < pedido.length;i++){
            total += pedido[i].alquiler();
        }
        
        return total;
    }
    
    public double importe(int posicion){
        
        return pedido[posicion].alquiler();
        
    }

    @Override
    public void mostrar() {
        
        System.out.println("TOTAL ALQUILER: "+importeTotal());
        
        
        System.out.println("-----------------------");
        System.out.println("Detalle:");
        System.out.println("-----------------------");
        
        for(int i = 0;i<pedido.length;i++){
            
            System.out.println("VEHICULO "+i);
            System.out.println("Información del vehículo:");
            pedido[i].recibo();
                
        }
       
        
        
    }
    
    public static void main(String[] args){
        
        Alquiler a1 = new Alquiler(3);
        
        a1.mostrar();
        
    }
    
    
    
    
}
