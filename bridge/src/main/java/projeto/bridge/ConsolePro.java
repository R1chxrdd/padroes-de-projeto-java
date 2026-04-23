package projeto.bridge;

public class ConsolePro extends Console {

    public ConsolePro(float precoBase) {
        super(precoBase);
    }

    public float calcularPrecoFinal() {
        return this.precoBase * (1 + this.controle.percentualAdicional());
    }
}