package adapter.ducksimulator;

public class TurkeySimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();
//        duck.gobble();
        Turkey duckAdapter = new DuckAdapter(duck);
        duckAdapter.gobble();
    }
}
