package projeto.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroSedanTest {

    @Test
    void deveReceberSedan() {
        ICarro carro = CarroFactory.obterCarro("Sedan");
        assertEquals("Sedan recebido", carro.receber());
    }

    @Test
    void deveVenderSedan() {
        ICarro carro = CarroFactory.obterCarro("Sedan");
        assertEquals("Sedan vendido", carro.vender());
    }
}