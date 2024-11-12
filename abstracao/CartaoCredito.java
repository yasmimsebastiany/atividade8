// Classe CartaoCredito que implementa FormaPagamento
public class CartaoCredito extends FormaPagamento {

    private String numeroCartao;
    private String validade;

    public CartaoCredito(String numeroCartao, String validade) {
        this.numeroCartao = numeroCartao;
        this.validade = validade;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso no Cartão de Crédito.");
        } else {
            System.out.println("Falha na validação do Cartão de Crédito.");
        }
    }

    @Override
    public boolean validarPagamento() {
        //validação do cartão (exemplo fictício)
        if (numeroCartao.length() == 16 && validade != null) {
            return true;
        }
        return false;
    }
}
