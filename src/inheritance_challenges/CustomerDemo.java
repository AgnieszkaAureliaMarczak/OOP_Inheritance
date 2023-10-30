package inheritance_challenges;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Alicia", "alicia@email.com");
        System.out.println("First customer's name: " + firstCustomer.getName() + ", credit limit: " +
                firstCustomer.getCreditLimit() + ", email address: " + firstCustomer.getEmailAddress());
        Customer secondCustomer = new Customer();
        System.out.println("Second customer's name: " + secondCustomer.getName() + ", credit limit: " +
                secondCustomer.getCreditLimit() + ", email address: " + secondCustomer.getEmailAddress());
    }
}
