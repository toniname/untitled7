public class BankApplication {
    private BankAccount[] accounts;
    private int count;

    public BankApplication(int maxAccounts) {
        accounts = new BankAccount[maxAccounts];
        count = 0;
    }
    public void addAccount(BankAccount account) {
        // Add the given account to the array of accounts.
    }

    public void showAllAccounts() {
        // Print all accounts in the array.
    }
}
