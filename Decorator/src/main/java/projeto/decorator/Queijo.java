package projeto.decorator;

public class Queijo extends CachorroQuenteDecorator {

    public Queijo(CachorroQuente cachorroQuente) {
        super(cachorroQuente);
    }

    public float getPercentualPreco() {
        return 15.0f;
    }

    public String getNomeAdicional() {
        return "Queijo";
    }
}