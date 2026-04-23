package projeto.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroSUVTest {

    @Test
    void deveReceberSUV() {
        ICarro carro = CarroFactory.obterCarro("SUV");
        assertEquals("SUV recebido", carro.receber());
    }

    @Test
    void deveVenderSUV() {
        ICarro carro = CarroFactory.obterCarro("SUV");
        assertEquals("SUV vendido", carro.vender());
    }
}