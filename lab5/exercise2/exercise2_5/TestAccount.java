package exercise2.exercise2_5;

public class TestAccount {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Nguyen", 'm');
        Account account1 = new Account(10, customer1, 100.0);
        System.out.println("id is: " + account1.getId());
        System.out.println("customer is: " + account1.getCustomer());
        System.out.println("balance is: " + account1.getBalance());
        System.out.println("Customer's name is: " + account1.getCustomerName());
        account1.deposit(50);
        System.out.println(account1);
        account1.withdraw(500);
        System.out.println(account1);

    }
}
