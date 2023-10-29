package inheritance_challenges;

public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setNumber("200473");
        bankAccount.setBalance(1000.00);
        bankAccount.setCustomerName("Amy Smith");
        bankAccount.setCustomerEmail("myemail@amy.smith");
        bankAccount.setCustomerPhoneNumber("(087) 123-4587");
        bankAccount.depositFundsIntoAccount(500);
        bankAccount.withdrawFundsFromAccount(150);
    }
}
