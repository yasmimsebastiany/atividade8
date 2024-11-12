public class Main {
    public static void main(String[] args) {
        // Criando os funcionários
        Funcionario f1 = new Gerente("Carlos", 8000, 2000);
        Funcionario f2 = new Desenvolvedor("Alice", 4000, 1000);
        Funcionario f3 = new Estagiario("Pedro", 1500, 300);

        // Criando a gestão de funcionários
        GestaoDeFuncionarios gestao = new GestaoDeFuncionarios();
        gestao.adicionarFuncionario(f1);
        gestao.adicionarFuncionario(f2);
        gestao.adicionarFuncionario(f3);

        // Listando os funcionários
        System.out.println("Lista de Funcionários:");
        gestao.listarFuncionarios();

        // Calculando a folha de pagamento
        gestao.calcularFolhaPagamento();

        // Promovendo o desenvolvedor
        gestao.promoverFuncionario(f2);

        // Listando os funcionários após promoção
        System.out.println("\nLista de Funcionários após Promoção:");
        gestao.listarFuncionarios();
    }
}
