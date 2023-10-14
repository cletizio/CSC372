public class CheckingAccount extends BankAccount {
    private static final double overdraftFee = 30.00;

    public CheckingAccount(){
    }

    public void accountSummary() {
        double interestRate = 0.07;
        System.out.printf("Interest Rate: %.2f%%\n", interestRate);
    }

    public void processWithdrawal(double amount) {
        if (balance <= 0) {
            balance -= amount + overdraftFee;
            System.out.printf("A $%.2f overdraft fee has been processed.\n", overdraftFee);
            System.out.printf("Current account balance is now $%.2f\n", balance);
        }
    }
}
