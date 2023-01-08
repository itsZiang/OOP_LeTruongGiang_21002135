package exercise1_8;

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

        Movable movable3 = new MovableRectangle(1, 2, 3, 4, 5, 6);
        System.out.println(movable3);
        movable3.moveUp();
        System.out.println(movable3);
        movable3.moveDown();
        System.out.println(movable3);

        MovableRectangle movableRectangle = (MovableRectangle) movable3;
        System.out.println(movableRectangle);
        movableRectangle.moveLeft();
        System.out.println(movableRectangle);
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
    }
}
