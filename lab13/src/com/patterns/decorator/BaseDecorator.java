package com.patterns.decorator;

public class BaseDecorator extends AbstractComponent {

    private final AbstractComponent component;

    protected BaseDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void execute() {
        component.execute();
    }
}
