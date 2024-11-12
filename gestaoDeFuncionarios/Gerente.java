// Subclasse Gerente
public class Gerente extends Funcionario {
    private double bonusGerente;

    public Gerente(String nome, double salarioBase, double bonusGerente) {
        super(nome, salarioBase);
        this.bonusGerente = bonusGerente;
    }

    @Override
    public double calcularBonus() {
        return bonusGerente;
    }

    @Override
    public void promover() {
        super.promover();
        System.out.println("O gerente " + getNome() + " foi promovido a Diretor!");
    }
}
