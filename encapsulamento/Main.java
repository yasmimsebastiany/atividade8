import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando um produto com valores padrão
        Produto produto = new Produto("Camiseta", 50.0, 10);

        // Exibindo informações iniciais do produto
        produto.mostrarInformacoes();

        while (true) {
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1. Alterar o preço");
            System.out.println("2. Alterar a quantidade em estoque");
            System.out.println("3. Aplicar desconto");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    System.out.print("Digite o novo preço: R$");
                    double novoPreco = scanner.nextDouble();
                    produto.setPreco(novoPreco);
                    break;

                case 2:
                    System.out.print("Digite a nova quantidade em estoque: ");
                    int novaQuantidade = scanner.nextInt();
                    produto.setQuantidadeEmEstoque(novaQuantidade);
                    break;

                case 3:
                    System.out.print("Digite a porcentagem de desconto: ");
                    double desconto = scanner.nextDouble();
                    try {
                        produto.aplicarDesconto(desconto);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }

            // Exibe as informações finais após a alteração
            produto.mostrarInformacoes();
        }
    }
}
