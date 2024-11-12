// Classe base Funcionario
public class Funcionario {
    protected String nome; 
    protected double salario; 

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.println(nome + " está realizando o trabalho genérico de um funcionário.");
    }

    public double calcularBonus() {
        return 0.0;
    }
}
