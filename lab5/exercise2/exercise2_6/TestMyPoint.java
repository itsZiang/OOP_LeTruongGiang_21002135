package exercise2.exercise2_6;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint(5, 6);
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance());

        MyPoint point3 = new MyPoint();
        System.out.println(point3);
        point3.setX(8);
        point3.setY(6);

        System.out.println("x is: " + point3.getX());
        System.out.println("y is: " + point3.getY());

        point3.setXY(3, 0);
        System.out.println(point3.getXY()[0]);
        System.out.println(point3.getXY()[1]);
        System.out.println(point3);

        MyPoint point4 = new MyPoint(0, 4);
        System.out.println(point4);

        System.out.println(point3.distance(point4));
        System.out.println(point4.distance(point3));
        System.out.println(point3.distance(5, 6));
        System.out.println(point3.distance());
    }
}

