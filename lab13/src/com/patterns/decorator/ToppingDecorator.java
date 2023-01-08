package com.patterns.decorator;

public abstract class ToppingDecorator extends Pizza{
    protected Pizza pizza;

    public abstract String getDescription();
}
