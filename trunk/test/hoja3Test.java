/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JayPiCastillo
 */
public class hoja3Test {
    
    public hoja3Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class hoja3.
     */


    /**
     * Test of sortingOne method, of class hoja3.
     */
    @Test
    public void testSortingOne() {
        System.out.println("sortingOne");
        int n = 10;
        boolean which = false;
        int[] expResult = new int[n];
        for(int a=0;a<n;a++)
            expResult[a]=a;
        
        int[] result = hoja3.sortingOne(n, which);
        assertEquals(expResult[0], result[0]);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of printMatriz method, of class hoja3.
     */
    @Test
    public void testPrintMatriz() {
        System.out.println("printMatriz");
        int[] gummybear = new int[10];
        boolean which = false;
        hoja3.printMatriz(gummybear, which);
        assertEquals(gummybear.length,10);
        // TODO review the generated test code and remove the default call to fail.
    }
}
