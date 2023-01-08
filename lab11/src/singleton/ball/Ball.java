package singleton.ball;

import java.util.HashMap;

public class Ball {
    private String color;
    private static HashMap<String, Ball> map = new HashMap<>();

    private Ball(String color) {
        this.color = color;
    }

    public static Ball getInstance(String color) {
        if (!map.containsKey(color)) {
            map.put(color, new Ball(color));
        }
        return map.get(color);
    }

    public String getColor() {
        return color;
    }
}
