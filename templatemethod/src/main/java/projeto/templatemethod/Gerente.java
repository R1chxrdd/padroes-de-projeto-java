package projeto.templatemethod;

public class Gerente extends Funcionario {

    public float calcularBonus() {
        return getSalarioBase() * 0.25f;
    }

    @Override
    public String getTipo() {
        return "Gerente";
    }
}