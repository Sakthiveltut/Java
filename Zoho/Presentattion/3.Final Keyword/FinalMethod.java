class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    // Final method to withdraw money from the bank account
    public final void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            System.out.println("Withdrawing $" + amount);
            balance -= amount;
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

/*
class SpecializedBankAccount extends BankAccount {
    // Constructor to initialize the balance
    public SpecializedBankAccount(double initialBalance) {
        super(initialBalance);
    }

    // Attempting to override the final method will result in a compilation error

    @Override
    public void withdraw(double amount) {
        System.out.println("Specialized withdrawal logic here...");
        // ...
        super.withdraw(amount);
    }
 
}

*/

public class FinalMethod{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        System.out.println("Initial balance: $" + account.getBalance());

        account.withdraw(500.0);
	
        account.withdraw(500.0);

        account.withdraw(500.0);

    }
}
