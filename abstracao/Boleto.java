// Classe Boleto que implementa FormaPagamento
public class Boleto extends FormaPagamento {

    private String numeroBoleto;

    public Boleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso via Boleto.");
        } else {
            System.out.println("Falha na validação do Boleto.");
        }
    }

    @Override
    public boolean validarPagamento() {
        //validação do boleto (exemplo fictício)
        if (numeroBoleto.length() == 10) {
            return true;
        }
        return false;
    }
}
