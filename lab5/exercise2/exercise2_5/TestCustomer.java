package exercise2.exercise2_5;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Nguyen", 'm');
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getId());
        System.out.println("name is: " + customer1.getName());
        System.out.println("gender is: " + customer1.getGender());
    }
}
