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
public class LevenshteinTest {
    
    public LevenshteinTest() {
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
     * Test of DistanciaLevenshtein method, of class Levenshtein.
     */
    @Test
    public void testDistanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "a";
        String palavra_dois = "as";
        Levenshtein instance = new Levenshtein();
        int expResult = 1;
        int result = instance.DistanciaLevenshtein(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test2DistanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "a";
        String palavra_dois = "asa";
        Levenshtein instance = new Levenshtein();
        int expResult = 2;
        int result = instance.DistanciaLevenshtein(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test3DistanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "preocupar";
        String palavra_dois = "ocupar";
        Levenshtein instance = new Levenshtein();
        int expResult = 3;
        int result = instance.DistanciaLevenshtein(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test4DistanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "idealizado";
        String palavra_dois = "ideal";
        Levenshtein instance = new Levenshtein();
        int expResult = 5;
        int result = instance.DistanciaLevenshtein(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test5DistanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "gostoso";
        String palavra_dois = "gostosa";
        Levenshtein instance = new Levenshtein();
        int expResult = 1;
        int result = instance.DistanciaLevenshtein(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test6DistanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "cola";
        String palavra_dois = "cone";
        Levenshtein instance = new Levenshtein();
        int expResult = 2;
        int result = instance.DistanciaLevenshtein(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test7DistanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "embaixador";
        String palavra_dois = "embaixatriz";
        Levenshtein instance = new Levenshtein();
        int expResult = 4;
        int result = instance.DistanciaLevenshtein(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test8DistanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "embaixatriz";
        String palavra_dois = "embaixador";
        Levenshtein instance = new Levenshtein();
        int expResult = 4;
        int result = instance.DistanciaLevenshtein(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
