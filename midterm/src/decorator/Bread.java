package decorator;

public abstract class Bread {
    String description = "Bread";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
