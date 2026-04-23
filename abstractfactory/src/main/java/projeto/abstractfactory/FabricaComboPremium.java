package projeto.abstractfactory;

public class FabricaComboPremium implements FabricaAbstrata {

    public Hamburguer createHamburguer() {
        return new HamburguerPremium();
    }

    public Bebida createBebida() {
        return new BebidaPremium();
    }
}