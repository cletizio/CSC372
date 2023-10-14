public class BankAccount {
    protected String firstName;
    protected String lastName;
    protected int accountID;
    protected double balance;

    public void bankAccount() {
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Deposit of $%.2f successful. New balance $%.2f.\n", amount, this.balance);
        } else {
            System.out.println("The deposit was unsuccessful.");
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0) {
            this.balance -= amount;
            System.out.printf("Withdrawal of $%.2f successful. New balance $%.2f%n", amount, this.balance);
        } else {
            System.out.println("Unable to withdraw funds.");
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {

        System.out.println("Account Summary:");
        System.out.printf("Account owner name: %s, %s.\n", lastName, firstName);
        System.out.printf("Account ID number: %d.\n", accountID);
        System.out.printf("Account balance: $%.2f.\n", balance);
    }
}
