public class PaymentFacade {
    private PaymentStrategy paymentStrategy;
    private TransactionManager transactionManager;

    public PaymentFacade() {
        this.transactionManager = TransactionManager.getInstance();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
            transactionManager.recordTransaction("Paid " + amount + " using " + paymentStrategy.getClass().getSimpleName());
        } else {
            System.out.println("Payment strategy not set.");
        }
    }
}
