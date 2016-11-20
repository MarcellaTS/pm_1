/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marce
 */
public class DamerauLevenshteinTest {
    
    public DamerauLevenshteinTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of computeLevenshteinDistance method, of class DamerauLevenshtein.
     */
    @Test
    public void testComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "a";
        String palavra_dois = "as";
        int expResult = 1;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test2ComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "a";
        String palavra_dois = "asa";
        int expResult = 2;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test3ComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "preocupar";
        String palavra_dois = "ocupar";
        int expResult = 3;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test4ComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "idealizado";
        String palavra_dois = "ideal";
        int expResult = 5;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test5ComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "gostoso";
        String palavra_dois = "gostosa";
        int expResult = 1;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test6ComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "cola";
        String palavra_dois = "cone";
        int expResult = 2;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test7ComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "embaixador";
        String palavra_dois = "embaixatriz";
        int expResult = 4;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test8ComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "embaixatriz";
        String palavra_dois = "embaixador";
        int expResult = 4;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test9ComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "desleal";
        String palavra_dois = "lealdade";
        int expResult = 5;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test10ComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "";
        String palavra_dois = "as";
        int expResult = 2;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     public void test11ComputeLevenshteinDistance() {
        System.out.println("computeLevenshteinDistance");
        String palavra_um = "amarelo";
        String palavra_dois = "";
        int expResult = 7;
        int result = DamerauLevenshtein.computeLevenshteinDistance(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
