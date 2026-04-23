package projeto.bridge;

public class ConsolePortatil extends Console {

    public ConsolePortatil(float precoBase) {
        super(precoBase);
    }

    public float calcularPrecoFinal() {
        return this.precoBase * (1 + this.controle.percentualAdicional());
    }
}