public class TransactionManager {
    private static TransactionManager instance;

    private TransactionManager() {
    }

    public static synchronized TransactionManager getInstance() {
        if (instance == null) {
            instance = new TransactionManager();
        }
        return instance;
    }

    public void recordTransaction(String details) {
        System.out.println("Transaction recorded: " + details);
    }
}
