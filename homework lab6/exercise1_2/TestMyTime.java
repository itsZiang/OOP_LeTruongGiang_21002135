package exercise1.exercise1_2;

public class TestMyTime {
    public static void main(String[] args) {

        MyTime time1 = new MyTime(25, 59, 59);
        System.out.println(time1);

        // Test nextSecond()
        time1.nextSecond();
        System.out.println(time1);

        // Test previousMinute()
        time1.previousMinute();
        System.out.println(time1);

        // Test nextHour()
        time1.nextHour();
        System.out.println(time1);

        // Test setTime()
        time1.setTime(25, 3, 4);
        System.out.println(time1);
        time1.setTime(24, 5, 6);

        // Test setHour()
        time1.setHour(24);
    }
}
