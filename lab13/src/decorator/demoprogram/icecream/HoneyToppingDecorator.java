package decorator.demoprogram.icecream;

public class HoneyToppingDecorator extends ToppingDecorator {
    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " + honey";
    }
}
