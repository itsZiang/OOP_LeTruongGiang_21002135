package singleton.ball;

public class DemoBall {
    public static void main(String[] args) {
        Ball ball = Ball.getInstance("red");
        System.out.println(ball.getColor());

        Ball ball2 = Ball.getInstance("green");
        System.out.println(ball2.getColor());

        Ball ball3 = Ball.getInstance("green");
        System.out.println(ball3 == ball2);
    }
}
