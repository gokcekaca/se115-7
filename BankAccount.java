public class BankAccount {
    private String accountID;
    private double balance;

    public BankAccount(String accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    // Setter & Getter
    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String newID) {
        this.accountID = newID;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
            System.out.print("Do you want to go into borrowing?: ");
        }
    }

    public void forceWithdraw(double amount) {
        balance -= amount;
        System.out.println("Borrowing approved. New balance: " + balance);
    }

    // Account details
    public void accountDetails() {
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: " + balance);
    }
}
