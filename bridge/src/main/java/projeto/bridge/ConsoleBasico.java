package projeto.bridge;

public class ConsoleBasico extends Console {

    public ConsoleBasico(float precoBase) {
        super(precoBase);
    }

    public float calcularPrecoFinal() {
        return this.precoBase * (1 + this.controle.percentualAdicional());
    }
}