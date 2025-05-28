/*Клас BankAccount:

Зберігає ім’я власника, номер рахунку, баланс.

Методи:

deposit(int amount) — поповнення рахунку.

withdraw(int amount) — зняття коштів.

getBalance() — повертає поточний баланс.

toString() — інформація про рахунок.

Клас Bank:

Масив з рахунками BankAccount[].

Метод addAccount(BankAccount account) — додає новий рахунок.

Метод findAccountByNumber(String accountNumber) — пошук рахунку.

Метод printAllAccounts() — вивід всіх рахунків.

Клас BankApp (точка входу):

У main() створити об’єкти, наповнити їх даними.

Провести кілька операцій (поповнення, зняття, перегляд).

*/


public class Main {
    public static void main(String[] args) {
        BankApplication app = new BankApplication(5);
        Bank bank = new Bank(5);

       /* BankAccount acc1 = new SavingsAccount("Оля", 1000);
        BankAccount acc2 = new SavingsAccount("Іван", 200);

        app.addAccount(acc1);
        app.addAccount(acc2);

        acc1.deposit(500);
        acc2.withdraw(50);

        app.showAllAccounts();*/
    }

}