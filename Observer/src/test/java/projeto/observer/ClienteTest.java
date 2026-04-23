package projeto.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveNotificarUmCliente() {
        Produto produto = new Produto("Notebook", "Eletrônicos", 3500.0f);
        Cliente cliente = new Cliente("Cliente 1");

        cliente.seguir(produto);
        produto.entrarPromocao();

        assertEquals(
            "Cliente 1, promoção disponível em Produto{nome='Notebook', categoria='Eletrônicos', preco=3500.0}",
            cliente.getUltimaNotificacao()
        );
    }

    @Test
    void deveNotificarClientes() {
        Produto produto = new Produto("Mouse", "Periféricos", 150.0f);

        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        cliente1.seguir(produto);
        cliente2.seguir(produto);

        produto.entrarPromocao();

        assertEquals(
            "Cliente 1, promoção disponível em Produto{nome='Mouse', categoria='Periféricos', preco=150.0}",
            cliente1.getUltimaNotificacao()
        );

        assertEquals(
            "Cliente 2, promoção disponível em Produto{nome='Mouse', categoria='Periféricos', preco=150.0}",
            cliente2.getUltimaNotificacao()
        );
    }

    @Test
    void naoDeveNotificarCliente() {
        Produto produto = new Produto("Teclado", "Periféricos", 200.0f);
        Cliente cliente = new Cliente("Cliente 1");

        produto.entrarPromocao();

        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteProdutoCerto() {
        Produto notebook = new Produto("Notebook", "Eletrônicos", 4000.0f);
        Produto monitor = new Produto("Monitor", "Tela", 900.0f);

        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        cliente1.seguir(notebook);
        cliente2.seguir(monitor);

        notebook.entrarPromocao();

        assertEquals(
            "Cliente 1, promoção disponível em Produto{nome='Notebook', categoria='Eletrônicos', preco=4000.0}",
            cliente1.getUltimaNotificacao()
        );

        assertEquals(null, cliente2.getUltimaNotificacao());
    }
}