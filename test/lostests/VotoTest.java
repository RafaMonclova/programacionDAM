
package lostests;

import org.junit.Test;
import static org.junit.Assert.*;
public class VotoTest {
    
    public VotoTest() {
    }

    /**
     * Test of Comprobar method, of class Voto.
     */
    @Test
    public void testComprobar() {
        System.out.println("Comprobar");
        int edad = 23;
        Voto instance = new Voto();
        String expResult = "puedes votar";
        String result = instance.Comprobar(edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testComprobar2() {
        System.out.println("Comprobar");
        int edad = 18;
        Voto instance = new Voto();
        String expResult = "puedes votar";
        String result = instance.Comprobar(edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testComprobar3() {
        System.out.println("Comprobar");
        int edad = 15;
        Voto instance = new Voto();
        String expResult = "NO puedes votar";
        String result = instance.Comprobar(edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testComprobar4() {
        System.out.println("Comprobar");
        int edad = 17;
        Voto instance = new Voto();
        String expResult = "NO puedes votar";
        String result = instance.Comprobar(edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Voto.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Voto.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
