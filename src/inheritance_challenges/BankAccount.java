package inheritance_challenges;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

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
