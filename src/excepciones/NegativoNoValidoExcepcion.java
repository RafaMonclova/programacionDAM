/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author alumno
 */
public class NegativoNoValidoExcepcion extends Exception {

    public NegativoNoValidoExcepcion(String mensaje) {
        super("ERROR"+mensaje);
    }
    
}
