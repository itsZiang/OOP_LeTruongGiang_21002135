package exercise1_6;


public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat1");
        cat1.greets();
        Dog dog1 = new Dog("dog1");
        dog1.greets();
        BigDog bigDog1 = new BigDog("bigDog1");
        bigDog1.greets();

        Animal animal1 = new Cat("animal1");
        animal1.greets();
        Animal animal2 = new Dog("animal2");
        animal2.greets();
        Animal animal3 = new BigDog("animal3");
        animal3.greets();
//        Animal animal4 = new Animal();

        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
//        Cat cat2 = (Cat) animal2;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}
