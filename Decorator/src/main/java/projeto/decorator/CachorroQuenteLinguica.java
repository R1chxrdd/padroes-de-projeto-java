package projeto.decorator;

public class CachorroQuenteLinguica implements CachorroQuente {

    private float preco;

    public CachorroQuenteLinguica() {
    }

    public CachorroQuenteLinguica(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Cachorro-Quente Linguiça";
    }
}