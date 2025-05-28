/*Клас Bank:

Масив з рахунками BankAccount[].

Метод addAccount(BankAccount account) — додає новий рахунок.

Метод findAccountByNumber(String accountNumber) — пошук рахунку.

Метод printAllAccounts() — вивід всіх рахунків.*/
public class Bank {
    private BankAccount[] accounts;
    private int count;

    public Bank(int capacity) {
        accounts = new BankAccount[capacity];
        count = 0;
    }

    public void addAccount(BankAccount account) {

        if (count < accounts.length) {
            accounts[count] = account;
            count++;
        } else {
            System.out.println("No more space");
        }

    }

    public void findAccountByNumber(String accountNumber) {
        for (BankAccount account1 : accounts) {
            if (account1.getAccountNumber().equals(accountNumber)) {
                System.out.println("Found");
            } else {
                System.out.println("Not found");
            }
        }
    }

    public void printAllAccounts() {

        System.out.println("--- Список рахунків у банку ---");
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }

    }

}
