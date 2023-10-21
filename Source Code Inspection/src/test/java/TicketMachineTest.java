package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class TicketMachineTest {

    private TicketMachine ticketMachine;

    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(50);  
    }

    @Test
    public void testInserirValidQuantia() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(10);  
        assertEquals(10, ticketMachine.getSaldo());
    }

    @Test(expected = PapelMoedaInvalidaException.class)
    public void testInserirInvalidQuantia() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(7);  
    }

    @Test
    public void testImprimirTicketWithSufficientBalance() throws SaldoInsuficienteException,PapelMoedaInvalidaException {
        ticketMachine.inserir(50);  
        String ticket = ticketMachine.imprimir();
        assertEquals("*** R$ 50,00 ****\n", ticket);
        assertEquals(0, ticketMachine.getSaldo());
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void testImprimirTicketWithInsufficientBalance() throws SaldoInsuficienteException,PapelMoedaInvalidaException {
        ticketMachine.inserir(30);  
        ticketMachine.imprimir();
    }
}
