package exercise2.exercise2_9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                v1.toString() + "," +
                v2.toString() + "," +
                v3.toString() + "," +
                "]";
    }

    public double getPerimeter() {
        return v1.distance(v2);
    }

    public String getType() {
        double dis1 = v1.distance(v2);
        double dis2 = v2.distance(v3);
        double dis3 = v3.distance(v1);

        if (v1 == v2 && v2 == v3 && v3 == v1) {
            return "Equilateral";
        } else if (v1 == v2 && v2 != v3 || v2 == v3 && v3 != v1 || v3 == v1 && v1 != v2) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}

