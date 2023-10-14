public class CheckingAccount extends BankAccount {
    private static final double overdraftFee = 30.00;
    private double interestRate;

    public CheckingAccount(){
        super();
        this.interestRate = 0.07;
    }

    public void accountSummary() {
        super.accountSummary();
        System.out.printf("Interest Rate: %.2f%%\n", interestRate);
    }

    public void processWithdrawal(double amount) {
        if (getBalance() - amount < 0) {
            withdrawal(amount + overdraftFee);
            System.out.printf("A $%.2f overdraft fee has been processed.\n", overdraftFee);
            System.out.printf("Current account balance is now $%.2f\n", balance);
        }
        else {
            withdrawal(amount);
        }
    }
}
