public class Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setFirstName("Tom");
        account.setLastName("Smith");
        account.setAccountID(16752);
        account.deposit(10);
        account.withdrawal(10);
        account.accountSummary();
        System.out.println();

        CheckingAccount checkingAcct = new CheckingAccount();
        checkingAcct.setFirstName("Jack");
        checkingAcct.setLastName("Johnson");
        checkingAcct.setAccountID(7635);
        checkingAcct.processWithdrawal(10);
        checkingAcct.accountSummary();
    }
}