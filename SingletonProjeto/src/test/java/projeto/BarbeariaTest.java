package projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarbeariaTest {

    @Test
    public void deveRetornarNomeBarbearia() {

        Barbearia.getInstance().setNomeBarbearia("Corte Fino");

        assertEquals("Corte Fino",
                Barbearia.getInstance().getNomeBarbearia());
    }

    @Test
    public void deveRetornarClienteAtual() {

        Barbearia.getInstance().setClienteAtual("Carlos");

        assertEquals("Carlos",
                Barbearia.getInstance().getClienteAtual());
    }
}