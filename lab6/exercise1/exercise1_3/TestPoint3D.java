package exercise1.exercise1_3;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point1 = new Point3D();
        Point3D point2 = new Point3D(1, 2, 3);

        System.out.println("Point1:" + " x=" + point1.getX()
                + " y=" + point1.getY()
                + " z=" + point1.getZ());
        System.out.println("Point2:" + " x=" + point2.getX()
                + " y=" + point2.getY()
                + " z=" + point2.getZ());

        point1.setX(1);
        point1.setY(1);
        point1.setZ(1);
        point2.setXYZ(5, 5, 5);
        System.out.println(point1);
        System.out.println(point2);

        float[] p1 = point1.getXYZ();
        for (float i : p1) {
            System.out.print(i + " ");
        }
    }
}
