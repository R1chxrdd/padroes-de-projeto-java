package projeto.decorator;

public class CachorroQuenteSalsicha implements CachorroQuente {

    private float preco;

    public CachorroQuenteSalsicha() {
    }

    public CachorroQuenteSalsicha(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Cachorro-Quente Salsicha";
    }
}