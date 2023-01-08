package exercise1_3;

public class TestMovable {
    public static void main(String[] args) {
        Movable movable = new MovablePoint(1, 2, 3, 4);
        System.out.println(movable);
        movable.moveUp();
        System.out.println(movable);
        movable.moveDown();
        System.out.println(movable);

        MovablePoint movablePoint = (MovablePoint) movable;
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}
