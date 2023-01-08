package exercise1_2;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geometricObject1 = new Circle(1);
        System.out.println(geometricObject1);
        System.out.println(geometricObject1.getArea());
        System.out.println(geometricObject1.getPerimeter());

        Circle circle = (Circle) geometricObject1;
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        GeometricObject geometricObject2 = new Rectangle(1, 2);
        System.out.println(geometricObject2);
        System.out.println(geometricObject2.getArea());
        System.out.println(geometricObject2.getPerimeter());

        Rectangle rectangle = (Rectangle) geometricObject2;
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
