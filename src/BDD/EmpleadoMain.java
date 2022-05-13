/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EmpleadoMain {
    
    public static void main(String[] args){
	
        Scanner sc = new Scanner(System.in);
	
        
        EmpleadoBDD empleados = new EmpleadoBDD();
        
                
        int opcion;
        do {
            System.out.println("1. Mostrar empleados (lista)");
            System.out.println("2. Mostrar datos del empleado dado su id");
            System.out.println("3. Modificar empleado dado su id");
            System.out.println("4. Añadir empleado");
            System.out.println("5. Borrar empleado");
            System.out.println("0. SALIR");
            System.out.println("Introduce opción:");
            opcion = sc.nextInt();
                    
                    switch(opcion){
                        
                        case 1:
                            System.out.println("--1-- \n");
                            
                            for (Empleado e : empleados.listaEmpleados()) {
                                
                                System.out.println(e);
                                
                            }
                            
                            break;
                        case 2:
                            System.out.println("--2-- \n");
                            System.out.println("Introduce el número del empleado a mostrar");
                            int empno = sc.nextInt();
                            System.out.println(empleados.read(empno));
                            break;
                        case 3:
                            System.out.println("--3-- \n");
                            System.out.println("Introduce el número del empleado a modificar");
                            int empnoModificar = sc.nextInt();
                            sc.nextLine();
                            System.out.println("--NUEVOS DATOS--");
                            System.out.println("----------------");
                            System.out.println("Introduce nombre del empleado");
                            String ename = sc.nextLine();
                            System.out.println("Introduce job del empleado");
                            String job = sc.nextLine();
                            System.out.println("Introduce mgr del empleado");
                            int mgr = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Introduce fecha de alta del empleado");
                            String hiredate = sc.nextLine();
                            System.out.println("Introduce salario del empleado");
                            double sal = sc.nextDouble();
                            System.out.println("Introduce comisión empleado");
                            double comm = sc.nextDouble();
                            System.out.println("Introduce num del departamento del empleado");
                            int deptno = sc.nextInt();
                            
                            Empleado eModificar = new Empleado(empnoModificar,ename,job,mgr,hiredate,sal,comm,deptno);
                               
                            empleados.update(eModificar);
                            
                            break;
                        case 4:
                            System.out.println("--4-- \n");
                            
                            break; 
                        case 5:
                            System.out.println("--5-- \n");
                            
                            break;     
                        case 0:
                            System.out.println("SALIENDO...");
                            break;
                        default:
                            System.out.println("Opción inválida(1-6)");
                            break;
                        
                    }
                
                } while (opcion != 0);


	}
    
    
}
