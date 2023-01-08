package com.patterns.decorator;

public class ConcreteDecorator extends BaseDecorator {
    public ConcreteDecorator(AbstractComponent component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("[ADDITIONAL CODE BLOCK]");
    }
}
