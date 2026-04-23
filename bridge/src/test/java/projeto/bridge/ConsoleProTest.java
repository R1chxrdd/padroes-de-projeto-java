package projeto.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsoleProTest {

    @Test
    void deveRetornarPrecoProComControleComFio() {
        Controle controle = new ControleComFio();
        ConsolePro console = new ConsolePro(3500.0f);
        console.setControle(controle);
        assertEquals(3500.0f, console.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoProComControleSemFio() {
        Controle controle = new ControleSemFio();
        ConsolePro console = new ConsolePro(3500.0f);
        console.setControle(controle);
        assertEquals(3850.0f, console.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoProComControleElite() {
        Controle controle = new ControleElite();
        ConsolePro console = new ConsolePro(3500.0f);
        console.setControle(controle);
        assertEquals(4375.0f, console.calcularPrecoFinal(), 0.01f);
    }
}