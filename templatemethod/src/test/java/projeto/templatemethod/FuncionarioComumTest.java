package projeto.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveRetornarBonusFuncionario() {
        FuncionarioComum funcionario = new FuncionarioComum();
        funcionario.setSalarioBase(2000.0f);

        assertEquals(200.0f, funcionario.calcularBonus());
    }

    @Test
    void deveRetornarSalarioFinalFuncionario() {
        FuncionarioComum funcionario = new FuncionarioComum();
        funcionario.setSalarioBase(2000.0f);

        assertEquals(2200.0f, funcionario.calcularSalarioFinal());
    }

    @Test
    void deveRetornarInformacoesFuncionario() {
        FuncionarioComum funcionario = new FuncionarioComum();
        funcionario.setId(1);
        funcionario.setNome("Carlos");
        funcionario.setSalarioBase(2000.0f);

        assertEquals(
            "Funcionario{id=1, nome='Carlos', salarioFinal=2200.0}",
            funcionario.getInfo()
        );
    }
}