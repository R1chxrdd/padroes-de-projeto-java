package projeto.observer;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Produto extends Observable {

    private String nome;
    private String categoria;
    private float preco;

    public Produto(String nome, String categoria, float preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public void entrarPromocao() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preco=" + preco +
                '}';
    }
}