package projeto.abstractfactory;

public class FabricaComboInfantil implements FabricaAbstrata {

    public Hamburguer createHamburguer() {
        return new HamburguerInfantil();
    }

    public Bebida createBebida() {
        return new BebidaInfantil();
    }
}