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
public class AcronymTest {
    
    public AcronymTest() {
    }

    /**
     * Test of get method, of class Acronym.
     */
    /*@Test
    public void testGet() {
        System.out.println("get");
        Acronym instance = new Acronym();
        String expResult = "";
        String result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newAcronym method, of class Acronym.
     */
    @Test
    public void testNewAcronym() {
        System.out.println("newAcronym");
        String phrase = "Hola mundo";
        Acronym instance = new Acronym();
        String expResult = "HhM";
        String result = instance.newAcronym(phrase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
