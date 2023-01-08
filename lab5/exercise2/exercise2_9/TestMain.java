package exercise2.exercise2_9;

public class TestMain {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 5);
        MyPoint point2 = new MyPoint(5, 5);
        MyPoint point3 = new MyPoint(6, 3);

        System.out.println(point1);

        MyTriangle triangle = new MyTriangle(point1, point2, point3);
        System.out.println(triangle);

        System.out.println(triangle.getType());
        System.out.println("length of the edge is: " + triangle.getPerimeter());
    }
}
