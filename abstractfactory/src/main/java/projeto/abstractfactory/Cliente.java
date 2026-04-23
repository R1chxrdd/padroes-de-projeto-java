package projeto.abstractfactory;

public class Cliente {

    private Hamburguer hamburguer;
    private Bebida bebida;

    public Cliente(FabricaAbstrata fabrica) {
        this.hamburguer = fabrica.createHamburguer();
        this.bebida = fabrica.createBebida();
    }

    public String servirHamburguer() {
        return this.hamburguer.servir();
    }

    public String servirBebida() {
        return this.bebida.servir();
    }
}