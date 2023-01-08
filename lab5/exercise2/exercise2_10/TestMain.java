package exercise2.exercise2_10;

public class TestMain {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 5);
        MyPoint point2 = new MyPoint(2, 4);

        System.out.println(point1);

        MyRectangle rectangle = new MyRectangle(point1, point2);
        System.out.println(rectangle);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}