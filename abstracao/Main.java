public class Main {
    public static void main(String[] args) {
        // Criando diferentes formas de pagamento
        FormaPagamento cartaoCredito = new CartaoCredito("1234567890123456", "12/25");
        FormaPagamento boleto = new Boleto("1234567890");
        FormaPagamento pix = new Pix("chavepix123");

        // Simulando pagamentos
        System.out.println("Tentando processar pagamento com Cartão de Crédito:");
        cartaoCredito.processarPagamento(150.00);
        System.out.println();

        System.out.println("Tentando processar pagamento com Boleto:");
        boleto.processarPagamento(50.00);
        System.out.println();

        System.out.println("Tentando processar pagamento com Pix:");
        pix.processarPagamento(200.00);
        System.out.println();
    }
}
