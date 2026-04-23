package projeto.decorator;

public class CachorroQuenteMisto implements CachorroQuente {

    private float preco;

    public CachorroQuenteMisto() {
    }

    public CachorroQuenteMisto(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Cachorro-Quente Misto";
    }
}