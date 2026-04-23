package projeto.decorator;

public abstract class CachorroQuenteDecorator implements CachorroQuente {

    private CachorroQuente cachorroQuente;

    public CachorroQuenteDecorator(CachorroQuente cachorroQuente) {
        this.cachorroQuente = cachorroQuente;
    }

    public CachorroQuente getCachorroQuente() {
        return cachorroQuente;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.cachorroQuente.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeAdicional();

    public String getDescricao() {
        return this.cachorroQuente.getDescricao() + "/" + this.getNomeAdicional();
    }
}