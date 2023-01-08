package exercise1.exercise1_4;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println("Square:"
                + " width=" + square.getWidth()
                + " length=" + square.getLength()
                + " color=" + square.getColor()
                + " filled=" + square.isFilled());
        square.setSide(2.0);
        System.out.println("Square:"
                + " width=" + square.getWidth()
                + " length=" + square.getLength()
                + " color=" + square.getColor()
                + " filled=" + square.isFilled());
        square.setColor("blue");
        System.out.println("Square:"
                + " width=" + square.getWidth()
                + " length=" + square.getLength()
                + " color=" + square.getColor()
                + " filled=" + square.isFilled());
        System.out.println(square);
    }
}
