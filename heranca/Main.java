public class Main {
    public static void main(String[] args) {
        // Criando objetos das subclasses
        Funcionario gerente = new Gerente("Carlos", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Ana", 4000);

        gerente.trabalhar();
        desenvolvedor.trabalhar();

        System.out.println("Bônus do gerente " + gerente.nome + ": R$" + gerente.calcularBonus());
        System.out.println("Bônus do desenvolvedor " + desenvolvedor.nome + ": R$" + desenvolvedor.calcularBonus());
    }
}
