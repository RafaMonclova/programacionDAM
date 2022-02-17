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
public class PersonaTest {
    
    public PersonaTest() {
    }

    /**
     * Test of isMayorDeEdad method, of class Persona.
     */
    @Test
    public void testIsMayorDeEdad() {
        System.out.println("isMayorDeEdad");
        Persona instance = new Persona(20);
        boolean expResult = false;
        boolean result = instance.isMayorDeEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
