package exercise2.exercise2_2;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@somewhere.com", 'm');

        Book javaDummy = new Book("Java for dummy", authors, 19.99, 99);

        Book anotherBook = new Book(
                "more Java for dummy"
                , new Author[]{
                new Author("Bruce Eckel", "b.eckel@somewhere.com", 'm')
                , new Author("Paul Tan", "Paul@nowhere.com", 'm')
        }
                , 29.95, 888);

        System.out.println("\nThe book: " + javaDummy);
        System.out.println("The authors are:");
        System.out.println(javaDummy.getAuthorNames());

        System.out.println("\nThe book: " + anotherBook);
        System.out.println("The authors are:");
        System.out.println(anotherBook.getAuthorNames());
    }
}
