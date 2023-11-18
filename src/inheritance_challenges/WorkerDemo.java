package inheritance_challenges;

public class WorkerDemo {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());

        SalariedEmployee john = new SalariedEmployee("John", "11/11/1958", "03/03/2020",
                35000);
        System.out.println(john);
        System.out.println("John's Paycheck = $" + john.collectPay());
        john.retire();

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021",
                15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
    }
}
