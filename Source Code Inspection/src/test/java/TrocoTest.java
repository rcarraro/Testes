package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TrocoTest {

    private Troco troco;

    @Before
    public void setUp() {
        troco = new Troco(256);
    }

    @Test
    public void testTrocoCalculation() {
        troco = new Troco(256);
        assertEquals(2, troco.papeisMoeda[5].getQuantidade());  
    }

}





