package com.patterns.decorator;

public class ConcreteComponent extends AbstractComponent {
    @Override
    public void execute() {
        System.out.println("ConcreteComponent.execute()");
    }
}
