package projeto.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroHatchTest {

    @Test
    void deveReceberHatch() {
        ICarro carro = CarroFactory.obterCarro("Hatch");
        assertEquals("Hatch recebido", carro.receber());
    }

    @Test
    void deveVenderHatch() {
        ICarro carro = CarroFactory.obterCarro("Hatch");
        assertEquals("Hatch vendido", carro.vender());
    }
}