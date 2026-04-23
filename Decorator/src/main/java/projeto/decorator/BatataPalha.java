package projeto.decorator;

public class BatataPalha extends CachorroQuenteDecorator {

    public BatataPalha(CachorroQuente cachorroQuente) {
        super(cachorroQuente);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }

    public String getNomeAdicional() {
        return "Batata Palha";
    }
}