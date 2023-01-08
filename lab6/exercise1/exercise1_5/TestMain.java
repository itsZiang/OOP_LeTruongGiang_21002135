package exercise1.exercise1_5;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        Dog dog = new Dog("dog");
        Dog dog2 = new Dog("con cho khac");
        System.out.println(cat);
        System.out.println(dog);
        cat.greets();
        dog.greets();
        dog.greets(dog2);
    }
}
