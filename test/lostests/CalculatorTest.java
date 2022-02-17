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
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    /*@Test
    public void testAdd() {
        System.out.println("add");
        int number1 = 4;
        int number2 = 3;
        int expResult = 7;
        int result = Calculator.add(number1, number2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");   ESTO COMENTADO O FALLA
    }

    /**
     * Test of sub method, of class Calculator.
     */
    /*@Test
    public void testSub() {
        System.out.println("sub");
        int number1 = 5;
        int number2 = 4;
        int expResult = 5;
        int result = Calculator.sub(number1, number2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class Calculator.
     */
    /*@Test
    public void testMul() {
        System.out.println("mul");
        int number1 = 1;
        int number2 = 1;
        int expResult = 1;
        int result = Calculator.mul(number1, number2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divInt method, of class Calculator.
     */
    /*@Test
    public void testDivInt() {
        System.out.println("divInt");
        int number1 = 42;
        int number2 = 2;
        int expResult = 21;
        int result = Calculator.divInt(number1, number2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divReal method, of class Calculator.
     */
    @Test
    public void testDivReal() {
        System.out.println("divReal");
        int number1 = 5;
        int number2 = 5;
        double expResult = 1.0;
        double result = Calculator.divReal(number1, number2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
