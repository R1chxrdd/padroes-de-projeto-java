package projeto.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CachorroQuenteTest {

    @Test
    void deveRetornarPrecoCachorroQuente() {
        CachorroQuente cachorro = new CachorroQuenteSalsicha(10.0f);
        assertEquals(10.0f, cachorro.getPreco());
    }

    @Test
    void deveRetornarPrecoComBacon() {
        CachorroQuente cachorro = new Bacon(new CachorroQuenteSalsicha(10.0f));
        assertEquals(12.0f, cachorro.getPreco());
    }

    @Test
    void deveRetornarPrecoComQueijo() {
        CachorroQuente cachorro = new Queijo(new CachorroQuenteSalsicha(10.0f));
        assertEquals(11.5f, cachorro.getPreco());
    }

    @Test
    void deveRetornarPrecoComBatataPalha() {
        CachorroQuente cachorro = new BatataPalha(new CachorroQuenteSalsicha(10.0f));
        assertEquals(11.0f, cachorro.getPreco());
    }

    @Test
    void deveRetornarPrecoComBaconMaisQueijo() {
        CachorroQuente cachorro =
                new Bacon(new Queijo(new CachorroQuenteSalsicha(10.0f)));

        assertEquals(13.8f, cachorro.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoBase() {
        CachorroQuente cachorro = new CachorroQuenteSalsicha();
        assertEquals("Cachorro-Quente Salsicha", cachorro.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComBacon() {
        CachorroQuente cachorro =
                new Bacon(new CachorroQuenteSalsicha());

        assertEquals("Cachorro-Quente Salsicha/Bacon",
                cachorro.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCompleta() {
        CachorroQuente cachorro =
                new Bacon(
                    new Queijo(
                        new BatataPalha(
                            new CachorroQuenteLinguica()
                        )
                    )
                );

        assertEquals(
            "Cachorro-Quente Linguiça/Batata Palha/Queijo/Bacon",
            cachorro.getDescricao()
        );
    }
}