package exercise1.exercise1_6;

public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance += amount;
        return balance;
    }

    public int debit(int amount){
        if (amount <= balance){
            balance -= amount;
            return balance;
        }
        else return -1;
    }

    public int transferTo(Account account, int amount){
        if (amount <= this.balance){
            account.balance += amount;
            this.balance -= amount;
            return balance;
        }
        else return -1;
    }

    @Override
    public String toString() {
        if (balance < 0){
            return "Amount exceeded balance";
        }
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
