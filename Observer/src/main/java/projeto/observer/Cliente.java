package projeto.observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void seguir(Produto produto) {
        produto.addObserver(this);
    }

    @Override
    public void update(Observable produto, Object arg) {
        this.ultimaNotificacao =
                this.nome + ", promoção disponível em " + produto.toString();
    }
}