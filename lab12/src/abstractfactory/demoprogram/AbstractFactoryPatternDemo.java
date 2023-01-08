package abstractfactory.demoprogram;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory nonRoundShapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = nonRoundShapeFactory.getShape("rectangle");
        shape1.draw();
        Shape shape2 = nonRoundShapeFactory.getShape("square");
        shape2.draw();
        AbstractFactory roundShapeFactory = FactoryProducer.getFactory(true);
        Shape shape3 = roundShapeFactory.getShape("rectangle");
        shape3.draw();
        Shape shape4 = roundShapeFactory.getShape("square");
        shape4.draw();

    }
}