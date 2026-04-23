package projeto;

public class Barbearia {

    private static Barbearia instance = new Barbearia();

    private String nomeBarbearia;
    private String clienteAtual;

    private Barbearia() {
    }

    public static Barbearia getInstance() {
        return instance;
    }

    public String getNomeBarbearia() {
        return this.nomeBarbearia;
    }

    public void setNomeBarbearia(String nomeBarbearia) {
        this.nomeBarbearia = nomeBarbearia;
    }

    public String getClienteAtual() {
        return this.clienteAtual;
    }

    public void setClienteAtual(String clienteAtual) {
        this.clienteAtual = clienteAtual;
    }
}
