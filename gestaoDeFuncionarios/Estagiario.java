// Subclasse Estagiario
public class Estagiario extends Funcionario {
    private double bonusEstagiario;

    public Estagiario(String nome, double salarioBase, double bonusEstagiario) {
        super(nome, salarioBase);
        this.bonusEstagiario = bonusEstagiario;
    }

    @Override
    public double calcularBonus() {
        return bonusEstagiario;
    }

    @Override
    public void promover() {
        super.promover();
        System.out.println("O estagiário " + getNome() + " foi promovido a Desenvolvedor Júnior!");
    }
}
