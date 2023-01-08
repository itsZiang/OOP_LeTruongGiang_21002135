package singleton.pseudocode;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM K66A5");
        foo.query("SELECT * FROM K66A5 WHERE ...");
        foo.query("SELECT * FROM K66A4");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM K66A3");

        System.out.println(foo == bar);
    }
}
