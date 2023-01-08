package com.patterns.bridge;

public class App {
    public static void main(String[] args) {
        Implementation implementation = new ConcreteImplementation();
        Abstraction abstraction = new RefinedAbstraction(implementation);
        abstraction.operation();
    }
}
