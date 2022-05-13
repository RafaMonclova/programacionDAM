/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

/**
 *
 * @author alumno
 */
public interface EmpleadoDAO {
    
    public void update(Empleado e);
    public void insert(Empleado e);
    public void delete(int empno);
    public Empleado read(int empno);
    
}
