package projeto.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroFactoryTest {

    @Test
    void deveRetornarExcecaoParaCarroInexistente() {
       try {
        CarroFactory.obterCarro("Moto");
        fail();
    } catch (IllegalArgumentException e) {
        assertEquals("Carro inexistente", e.getMessage());
    }
}

    @Test
    void deveRetornarExcecaoParaCarroInvalido() {
       try {
        CarroFactory.obterCarro("Luxo");
        fail();
    } catch (IllegalArgumentException e) {
        assertEquals("Carro inválido", e.getMessage());
    }
}
}