package factorymethod.demoprogram;

public class FruitFactory {
    Fruit provideFruit(String name) throws Exception {
        return switch (name) {
            case "apple" -> new Apple();
            case "orange" -> new Orange();
            case "banana" -> new Banana();
            default -> throw new Exception("No matching fruit could be provided");
        };
    }
}