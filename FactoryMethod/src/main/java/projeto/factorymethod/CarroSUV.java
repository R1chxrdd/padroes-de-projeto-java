package projeto.factorymethod;

public class CarroSUV implements ICarro {

    public String receber() {
        return "SUV recebido";
    }

    public String vender() {
        return "SUV vendido";
    }
}