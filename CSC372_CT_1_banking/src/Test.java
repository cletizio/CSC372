public class Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        CheckingAccount checkingAcct = new CheckingAccount();
        account.setFirstName("Tom");
        account.setLastName("Smith");
        account.setAccountID(16752);
        account.deposit(10);
        account.withdrawal(10);
        account.accountSummary();
        checkingAcct.processWithdrawal(10);
        checkingAcct.accountSummary();
    }
}