package com.patterns.bridge;

public class Abstraction {
    protected Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public void operation() {
        implementation.operation();
    }
}
