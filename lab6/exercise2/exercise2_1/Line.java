package exercise2.exercise2_1;

public class Line {

    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginX);
        end = new Point(endX, endY);
    }

    @Override
    public String toString() {
//        return String.format("Point 1: (%d, %d)\nPoint 2: (%d, %d)", begin.getX(), begin.getY()
//                            , end.getX(), end.getY());
        int a = begin.getY() - end.getY();
        int b = end.getX() - begin.getX();
        int c = -begin.getX() * (begin.getY() - end.getY())
                + begin.getY() * (end.getY() - begin.getX());
        return String.format("Line: %dx + %dy + %d = 0", a, b, c);
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getX();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setX(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        return Math.sqrt((begin.getX() - end.getX()) * (begin.getX() - end.getX())
                + (begin.getY() - end.getY()) * (begin.getY() - end.getY()));
    }

    public double getGradient() {
        return Math.atan2(Math.abs(begin.getY()) - Math.abs(end.getY())
                , Math.abs(begin.getX()) - Math.abs(end.getX()));
    }
}
