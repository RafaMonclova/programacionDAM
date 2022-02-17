/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class ejercicio3_7Test {
    
    public ejercicio3_7Test() {
    }

    /**
     * Test of Numero_elevado method, of class ejercicio3_7.
     */
    @Test
    public void testNumero_elevado() {
        System.out.println("Numero_elevado");
        int x = 2;
        int z = 3;
        int expResult = 27;
        int result = ejercicio3_7.Numero_elevado(x, z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
