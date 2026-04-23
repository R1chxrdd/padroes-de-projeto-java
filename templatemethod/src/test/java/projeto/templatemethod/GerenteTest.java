package projeto.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveRetornarBonusGerente() {
        Gerente gerente = new Gerente();
        gerente.setSalarioBase(4000.0f);

        assertEquals(1000.0f, gerente.calcularBonus());
    }

    @Test
    void deveRetornarSalarioFinalGerente() {
        Gerente gerente = new Gerente();
        gerente.setSalarioBase(4000.0f);

        assertEquals(5000.0f, gerente.calcularSalarioFinal());
    }

    @Test
    void deveRetornarInformacoesGerente() {
        Gerente gerente = new Gerente();
        gerente.setId(2);
        gerente.setNome("Marcos");
        gerente.setSalarioBase(4000.0f);

        assertEquals(
            "Gerente{id=2, nome='Marcos', salarioFinal=5000.0}",
            gerente.getInfo()
        );
    }
}