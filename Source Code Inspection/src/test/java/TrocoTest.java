package br.calebe.ticketmachine.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrocoTest {

    private Troco troco;

    @Before
    public void setUp() {
        troco = new Troco(256);
    }

    @Test
    public void testTrocoCalculation() {
        assertEquals(2, troco.papeisMoeda[5].getQuantidade());  
        assertEquals(1, troco.papeisMoeda[4].getQuantidade());  
        assertEquals(0, troco.papeisMoeda[3].getQuantidade());  
        assertEquals(0, troco.papeisMoeda[2].getQuantidade());  
        assertEquals(0, troco.papeisMoeda[1].getQuantidade());  
        assertEquals(3, troco.papeisMoeda[0].getQuantidade());  // 3 x 2
    }

}





