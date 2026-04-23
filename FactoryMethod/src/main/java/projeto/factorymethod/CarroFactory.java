package projeto.factorymethod;

public class CarroFactory {

    public static ICarro obterCarro(String carro) {

        Class<?> classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("projeto.factorymethod.Carro" + carro);
            objeto = classe.getDeclaredConstructor().newInstance();

        } catch (Exception ex) {
            throw new IllegalArgumentException("Carro inexistente");
        }

        if (!(objeto instanceof ICarro)) {
            throw new IllegalArgumentException("Carro inválido");
        }

        return (ICarro) objeto;
    }
}