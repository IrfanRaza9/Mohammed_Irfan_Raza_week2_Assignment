package week2;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.displayBalance();
        account.deposit(500);
        account.displayBalance();
        account.withdraw(200);
        account.displayBalance();
    }
}
