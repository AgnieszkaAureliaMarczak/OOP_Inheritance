package inheritance_challenges;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default email", "Default phone");
        System.out.println("This is an empty constructor.");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phone){
        System.out.println("Account constructor with parameters");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhoneNumber = phone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmail, customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFundsIntoAccount(double amountToDeposit){
        balance += amountToDeposit;
        System.out.println("Depositing $" + amountToDeposit +
                ". Balance after deposit: " + balance);
    }

    public void withdrawFundsFromAccount(double amountToWithdraw){
        if (balance - amountToWithdraw < 0){
            System.out.println("Insufficient funds. You only have $" + balance + "in your account.");
        } else {
            balance -= amountToWithdraw;
            System.out.println("Withdrawal of $" + amountToWithdraw +
                    ". Balance after withdraw: $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
