
public abstract class BankAccount implements AccountOperations {
    protected String owner;
    protected double balance;
    protected String AccountNumber;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void deposit(int amount){
        if (amount>=0){balance+=amount;}
        else{System.out.println("Invalid input");}
    }

    public void withdraw(int amount){
        if (amount >= 0 && amount <= balance) {balance-=amount;}
        else{System.out.println("Invalid input");}
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
