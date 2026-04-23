package projeto.bridge;

public abstract class Console {

    protected Controle controle;
    protected float precoBase;

    public Console(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setControle(Controle controle) {
        this.controle = controle;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPrecoFinal();
}