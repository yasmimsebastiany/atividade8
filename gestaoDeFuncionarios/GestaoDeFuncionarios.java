// Classe que gerencia todos os funcionários
import java.util.ArrayList;
import java.util.List;

public class GestaoDeFuncionarios {
    private List<Funcionario> funcionarios;

    public GestaoDeFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularFolhaPagamento() {
        double totalSalarios = 0;
        for (Funcionario f : funcionarios) {
            totalSalarios += f.calcularSalario();
        }
        System.out.println("Total de salários e bônus a pagar: " + totalSalarios);
    }

    public void promoverFuncionario(Funcionario funcionario) {
        funcionario.promover();
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
