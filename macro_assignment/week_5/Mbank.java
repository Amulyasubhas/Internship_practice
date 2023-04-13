public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds to complete the transaction.");
    }
}

class Mbank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        try {
            account.withdraw(500.0);
            System.out.println("New balance: " + account.checkBalance());
            account.withdraw(700.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
