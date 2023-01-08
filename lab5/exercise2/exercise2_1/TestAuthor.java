package exercise2.exercise2_1;

public class TestAuthor {

    public static void main(String[] args) {
        Author author1 = new Author("Nguyen Van A", "nguyenvana@yaheo.com", 'm');
        System.out.println(author1);

        author1.setEmail("home@yameo.com");

        System.out.println("name is: " + author1.getName());
        System.out.println("gender is: " + author1.getGender());
        System.out.println("email is: " + author1.getEmail());
    }
}
