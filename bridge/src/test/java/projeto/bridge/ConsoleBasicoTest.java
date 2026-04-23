package projeto.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsoleBasicoTest {

    @Test
    void deveRetornarPrecoBasicoComControleComFio() {
        Controle controle = new ControleComFio();
        ConsoleBasico console = new ConsoleBasico(2000.0f);
        console.setControle(controle);
        assertEquals(2000.0f, console.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBasicoComControleSemFio() {
        Controle controle = new ControleSemFio();
        ConsoleBasico console = new ConsoleBasico(2000.0f);
        console.setControle(controle);
        assertEquals(2200.0f, console.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBasicoComControleElite() {
        Controle controle = new ControleElite();
        ConsoleBasico console = new ConsoleBasico(2000.0f);
        console.setControle(controle);
        assertEquals(2500.0f, console.calcularPrecoFinal(), 0.01f);
    }
}