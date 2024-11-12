// Subclasse Desenvolvedor
public class Desenvolvedor extends Funcionario {
    private double bonusDesenvolvedor;

    public Desenvolvedor(String nome, double salarioBase, double bonusDesenvolvedor) {
        super(nome, salarioBase);
        this.bonusDesenvolvedor = bonusDesenvolvedor;
    }

    @Override
    public double calcularBonus() {
        return bonusDesenvolvedor;
    }

    @Override
    public void promover() {
        super.promover();
        System.out.println("O desenvolvedor " + getNome() + " foi promovido a Líder Técnico!");

        double novoSalarioBase = getSalarioBase() * 1.5; // Aumento de 50% no salário base
        double novoBonus = bonusDesenvolvedor * 1.5; // Aumento de 50% no bônus

        // Atualizando os valores
        System.out.println("Novo salário base: " + novoSalarioBase);
        System.out.println("Novo bônus: " + novoBonus);

        this.setSalarioBase(novoSalarioBase); // Atualizando salário base
        this.bonusDesenvolvedor = novoBonus;  // Atualizando bônus
    }
}
