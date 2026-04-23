package projeto.decorator;

public class Bacon extends CachorroQuenteDecorator {

    public Bacon(CachorroQuente cachorroQuente) {
        super(cachorroQuente);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeAdicional() {
        return "Bacon";
    }
}