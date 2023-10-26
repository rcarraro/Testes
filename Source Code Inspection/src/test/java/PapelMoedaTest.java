package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PapelMoedaTest {

    private PapelMoeda papelMoeda;

    @Before
    public void setUp() {
        papelMoeda = new PapelMoeda(50,2);  
    }
}
