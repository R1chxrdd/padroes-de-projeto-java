package projeto.factorymethod;

public class CarroSedan implements ICarro {

    public String receber() {
        return "Sedan recebido";
    }

    public String vender() {
        return "Sedan vendido";
    }
}