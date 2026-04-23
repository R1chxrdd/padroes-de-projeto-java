package projeto.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveServirHamburguerInfantil() {
        FabricaAbstrata fabrica = new FabricaComboInfantil();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Hambúrguer Infantil", cliente.servirHamburguer());
    }

    @Test
    void deveServirBebidaInfantil() {
        FabricaAbstrata fabrica = new FabricaComboInfantil();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Refrigerante", cliente.servirBebida());
    }

    @Test
    void deveServirHamburguerPremium() {
        FabricaAbstrata fabrica = new FabricaComboPremium();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Hambúrguer Premium", cliente.servirHamburguer());
    }

    @Test
    void deveServirBebidaPremium() {
        FabricaAbstrata fabrica = new FabricaComboPremium();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Suco Natural", cliente.servirBebida());
    }
}