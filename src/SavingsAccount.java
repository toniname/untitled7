public class SavingsAccount extends BankAccount {
    public SavingsAccount(String owner, double initialBalance) {
        super(owner, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0 ) {
            balance += amount;
        }
        else {
            System.out.println("Ошибка: сумма должна быть больше 0");
        }

    }

    @Override
    public void withdraw(double amount) {
        //ваш код

    }
}

