package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TrocoTest {

    private Troco troco;
    protected PapelMoeda[] papeisMoeda;
  
    @Before
    public void setUp() {
        troco = new Troco(256);  
    }
      class TrocoIteratorTeste implements Iterator<PapelMoeda> {
        
        @Test
        public void testTroco() throws PapelMoedaInvalidaException {
          assertEquals(2, troco.papeisMoeda[5].getQuantidade());
          assertEquals(1, troco.papeisMoeda[4].getQuantidade());
          assertEquals(0, troco.papeisMoeda[3].getQuantidade());
          assertEquals(0, troco.papeisMoeda[2].getQuantidade());
          assertEquals(1, troco.papeisMoeda[1].getQuantidade());
          assertEquals(1, troco.papeisMoeda[0].getQuantidade());
        }
    }
}
