// Classe Funcionario (superclasse)
public class Funcionario {
    private String nome;
    private double salarioBase;
    private double bonus;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularBonus() {
        return this.bonus;
    }

    public double calcularSalario() {
        return salarioBase + calcularBonus();
    }

    public void promover() {
        System.out.println("O funcionário " + nome + " foi promovido!");
    }

    @Override
    public String toString() {
        return nome + " - Salário: " + calcularSalario();
    }
}
