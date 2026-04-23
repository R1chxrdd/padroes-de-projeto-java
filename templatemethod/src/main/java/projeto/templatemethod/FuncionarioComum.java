package projeto.templatemethod;

public class FuncionarioComum extends Funcionario {

    public float calcularBonus() {
        return getSalarioBase() * 0.10f;
    }
}