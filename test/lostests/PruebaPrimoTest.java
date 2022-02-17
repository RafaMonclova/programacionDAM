/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lostests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class PruebaPrimoTest {
    
    public PruebaPrimoTest() {
    }

    /**
     * Test of esPrimo method, of class PruebaPrimo.
     */
    @Test
    public void testEsPrimo() {
        System.out.println("esPrimo");
        String numero = "7";
        PruebaPrimo instance = new PruebaPrimo();
        boolean expResult = true;
        boolean result = instance.esPrimo(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PruebaPrimo.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PruebaPrimo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
