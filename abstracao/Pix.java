// Classe Pix que implementa FormaPagamento
public class Pix extends FormaPagamento {

    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso via Pix.");
        } else {
            System.out.println("Falha na validação do Pix.");
        }
    }

    @Override
    public boolean validarPagamento() {
        //validação do Pix (exemplo fictício)
        if (chavePix != null && chavePix.length() > 5) {
            return true;
        }
        return false;
    }
}
