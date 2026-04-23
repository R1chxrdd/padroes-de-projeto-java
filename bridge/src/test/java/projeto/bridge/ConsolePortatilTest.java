package projeto.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsolePortatilTest {

    @Test
    void deveRetornarPrecoPortatilComControleComFio() {
        Controle controle = new ControleComFio();
        ConsolePortatil console = new ConsolePortatil(1800.0f);
        console.setControle(controle);
        assertEquals(1800.0f, console.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPortatilComControleSemFio() {
        Controle controle = new ControleSemFio();
        ConsolePortatil console = new ConsolePortatil(1800.0f);
        console.setControle(controle);
        assertEquals(1980.0f, console.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPortatilComControleElite() {
        Controle controle = new ControleElite();
        ConsolePortatil console = new ConsolePortatil(1800.0f);
        console.setControle(controle);
        assertEquals(2250.0f, console.calcularPrecoFinal(), 0.01f);
    }
}