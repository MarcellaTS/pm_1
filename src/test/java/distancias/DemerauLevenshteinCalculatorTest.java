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
public class DemerauLevenshteinCalculatorTest {
    
    public DemerauLevenshteinCalculatorTest() {
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
     * Test of DistanciaEntrePalavras method, of class DemerauLevenshteinCalculator.
     */
    @Test
    public void testDistanciaEntrePalavras() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "a";
        String palavra_dois = "as";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 1;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDistanciaEntrePalavras2() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "a";
        String palavra_dois = "asa";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 2;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDistanciaEntrePalavras3() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "preocupar";
        String palavra_dois = "ocupar";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 3;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDistanciaEntrePalavras4() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "idealizado";
        String palavra_dois = "ideal";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 5;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDistanciaEntrePalavras5() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "gostoso";
        String palavra_dois = "gostosa";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 1;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDistanciaEntrePalavras6() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "cola";
        String palavra_dois = "cone";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 2;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDistanciaEntrePalavras7() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "embaixador";
        String palavra_dois = "embaixatriz";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 4;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDistanciaEntrePalavras8() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "embaixatriz";
        String palavra_dois = "embaixador";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 4;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDistanciaEntrePalavras9() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "desleal";
        String palavra_dois = "lealdade";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 5;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDistanciaEntrePalavras10() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "";
        String palavra_dois = "as";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 2;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDistanciaEntrePalavras11() {
        System.out.println("DistanciaEntrePalavras");
        String palavra_um = "amarelo";
        String palavra_dois = "";
        DemerauLevenshteinCalculator instance = new DemerauLevenshteinCalculator();
        int expResult = 7;
        int result = instance.DistanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
