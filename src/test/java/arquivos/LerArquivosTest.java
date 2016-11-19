/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

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
public class LerArquivosTest {
    
    public LerArquivosTest() {
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
     * Test of LerTxt method, of class LerArquivos.
     */
    @Test
    public void testLerTxt() {
        System.out.println("LerTxt");
        String NomeArquivo = "dictionary pt-br.dic";
        LerArquivos instance = new LerArquivos();
        instance.LerTxt(NomeArquivo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LerXml method, of class LerArquivos.
     */
    @Test
    public void testLerXml() throws Exception {
        System.out.println("LerXml");
        String NomeArquivo = "";
        LerArquivos instance = new LerArquivos();
        instance.LerXml(NomeArquivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
