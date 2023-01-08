package exercise1_4;

public class TestMovable {
    public static void main(String[] args) {
        Movable movable1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(movable1);
        movable1.moveUp();
        System.out.println(movable1);
        movable1.moveDown();
        System.out.println(movable1);

        MovablePoint movablePoint = (MovablePoint) movable1;
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);

        Movable movable2 = new MovableCircle(1, 2, 3, 4, 5);
        System.out.println(movable2);
        movable2.moveUp();
        System.out.println(movable2);
        movable2.moveDown();
        System.out.println(movable2);

        MovableCircle movableCircle = (MovableCircle) movable2;
        System.out.println(movableCircle);
        movableCircle.moveLeft();
        System.out.println(movableCircle);
        movableCircle.moveRight();
        System.out.println(movableCircle);
    }
}
