package com.patterns.bridge;

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void operation() {
        super.operation();
    }
}
