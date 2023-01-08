package com.patterns.decorator;

public abstract class Pizza {
    protected String description = "Basic Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
