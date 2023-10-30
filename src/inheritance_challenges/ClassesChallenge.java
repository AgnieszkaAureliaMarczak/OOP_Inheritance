package inheritance_challenges;

public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
//        BankAccount bankAccount = new BankAccount("200473", 1000.00,
//                "Amy Smith", "myemail@amy.smith", "(087) 123-4587");
//        bankAccount.setNumber("200473");
//        bankAccount.setBalance(1000.00);
//        bankAccount.setCustomerName("Amy Smith");
//        bankAccount.setCustomerEmail("myemail@amy.smith");
//        bankAccount.setCustomerPhoneNumber("(087) 123-4587");
        bankAccount.depositFundsIntoAccount(500);
        bankAccount.withdrawFundsFromAccount(150);
        BankAccount agasAccount = new BankAccount("Aga", "aga@email.com",
                "56973");
        System.out.println("Account no: " + agasAccount.getNumber() + "; name " + agasAccount.getCustomerName());
    }
}
