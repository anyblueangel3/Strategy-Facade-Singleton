public class Main {
    public static void main(String[] args) {
        PaymentFacade paymentFacade = new PaymentFacade();

        // Usando cartão de crédito
        paymentFacade.setPaymentStrategy(new CreditCardStrategy());
        paymentFacade.pay(100.0);

        // Usando PayPal
        paymentFacade.setPaymentStrategy(new PayPalStrategy());
        paymentFacade.pay(200.0);

        // Usando transferência bancária
        paymentFacade.setPaymentStrategy(new BankTransferStrategy());
        paymentFacade.pay(300.0);
    }
}
