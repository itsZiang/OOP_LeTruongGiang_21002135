package exercise1.exercise1_3;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        Point2D point2 = new Point2D(3, 4);

        System.out.println("Point1:" + " x=" + point1.getX()
                + " y=" + point1.getY());
        System.out.println("Point2:" + " x=" + point2.getX()
                + " y=" + point2.getY());

        point1.setX(1);
        point1.setY(1);
        point2.setXY(5, 5);
        System.out.println(point1);
        System.out.println(point2);

        float[] p1 = point1.getXY();
        for (float i : p1) {
            System.out.print(i + " ");
        }
    }
}
