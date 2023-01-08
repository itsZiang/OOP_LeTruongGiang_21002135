package exercise2.exercise2_2;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + cylinder1.getCircle().getRadius()
                + " height=" + cylinder1.getHeight()
                + " base area=" + cylinder1.getArea()
                + " volume=" + cylinder1.getVolume()
                + " color=" + cylinder1.getCircle().getColor());
    }
}
