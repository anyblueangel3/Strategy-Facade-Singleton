public class BankTransferStrategy implements PaymentStrategy {
    @Override
    public void pay (double amount) {
        System.out.println("Paid " + amount + " using Bank Transfer.");
    }
}
