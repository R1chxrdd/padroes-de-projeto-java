package projeto.factorymethod;

public class CarroHatch implements ICarro {

    public String receber() {
        return "Hatch recebido";
    }

    public String vender() {
        return "Hatch vendido";
    }
}