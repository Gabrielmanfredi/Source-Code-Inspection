/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class TicketMachineTest {

    public TicketMachineTest() {
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
    public void inserirTest() {
        TicketMachine tm = new TicketMachine(10);
        try {
            tm.inserir(5);
        } catch (PapelMoedaInvalidaException ex) {
            Logger.getLogger(TicketMachineTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(tm.getSaldo(), 5);
    }

    @Test
    public void imprimirTest() throws PapelMoedaInvalidaException, SaldoInsuficienteException {

        TicketMachine tm2 = new TicketMachine(5);
        
        tm2.inserir(10);
        
        System.out.println(tm2.imprimir());
        assertEquals("R$10", tm2.imprimir());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
