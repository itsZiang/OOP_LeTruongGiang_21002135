package exercise2.exercise2_2;

public class Cylinder {

    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public Circle getCircle() {
        return base;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public double getArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder[" + base.toString() + ",height=" + height + "]";
    }
}


