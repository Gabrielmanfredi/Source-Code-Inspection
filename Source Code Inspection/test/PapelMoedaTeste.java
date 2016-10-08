/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class PapelMoedaTeste {
    
    public PapelMoedaTeste() {
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
    
    @Test
    public void PapelMoeda(){
        PapelMoeda pm = new PapelMoeda(10, 2);
        assertEquals( pm.getQuantidade(), 2);
    }
    
    @Test
    public void valorTest(){
        PapelMoeda pm2 = new PapelMoeda(20, 4);
        assertEquals( pm2.getValor(), 20);
    }
    
    @Test
    public void quantidadeTest(){
        PapelMoeda pm3 = new PapelMoeda(15, 6);
        assertEquals( pm3.getQuantidade(), 6);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
