package exercise2.exercise2_10;

public class MyRectangle {
    private MyPoint v1;
    private MyPoint v2;

    public MyRectangle(MyPoint v1, MyPoint v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
    }

    @Override
    public String toString() {
        return "MyRectangle[" +
                v1.toString() + "," +
                v2.toString() +
                "]";
    }

    public double getArea() {
        int x3 = v1.getX();
        int y3 = v2.getY();
        MyPoint v3 = new MyPoint(x3, y3);
        int x4 = v2.getX();
        int y4 = v1.getY();
        MyPoint v4 = new MyPoint(x3, y3);
        return v3.distance(v1) * v4.distance(v2);
    }

    public double getPerimeter() {
        int x3 = v1.getX();
        int y3 = v2.getY();
        MyPoint v3 = new MyPoint(x3, y3);
        int x4 = v2.getX();
        int y4 = v1.getY();
        MyPoint v4 = new MyPoint(x3, y3);
        return 2 * v3.distance(v1) + 2 * v4.distance(v2);
    }
}
