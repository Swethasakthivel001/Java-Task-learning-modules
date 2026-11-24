
public class BankAccount {
 
    private double balance;
 
    public BankAccount(double balance) {

        this.balance = balance;

    }
 

    public void withdraw(double amount) throws IllegalArgumentException {
 
        if (amount <= 0) {

            throw new IllegalArgumentException("Withdrawal amount must be positive.");

        }
 
        if (amount > balance) {

            throw new IllegalArgumentException("Insufficient account balance.");

        }
 
        balance -= amount;
 
        System.out.println("Withdrawal successful.");

        System.out.println("Remaining balance: " + balance);

    }
 
    public double getBalance() {

        return balance;

    }

}

 