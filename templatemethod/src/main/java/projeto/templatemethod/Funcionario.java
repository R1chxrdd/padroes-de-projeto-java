package projeto.templatemethod;

public abstract class Funcionario {

    private int id;
    protected String nome;
    private float salarioBase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularBonus();

    public float calcularSalarioFinal() {
        return this.salarioBase + this.calcularBonus();
    }

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", salarioFinal=" + this.calcularSalarioFinal() +
                '}';
    }
}