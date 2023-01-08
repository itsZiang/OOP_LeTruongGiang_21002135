package exercise1.exercise1_2;

public class MyTime {

    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        try {
            if (isValidTime(hour, minute, second)) {
                this.hour = hour;
                this.minute = minute;
                this.second = second;
            } else {
                throw new IllegalArgumentException("Invalid hour, minute, or second!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        try {
            if (isValidHour(hour)) {
                this.hour = hour;
            } else throw new IllegalArgumentException("Invalid hour!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid hour!");
        }
    }

    public void setMinute(int minute) {
        try {
            if (isValidMinute(minute)) {
                this.minute = minute;
            } else throw new IllegalArgumentException("Invalid minute!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid minute!");
        }
    }

    public void setSecond(int second) {
        try {
            if (isValidSecond(second)) {
                this.second = second;
            } else throw new IllegalArgumentException("Invalid second!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid second!");
        }
    }

    @Override
    public String toString() {
        String str_hour = String.valueOf(hour);
        String str_minute = String.valueOf(minute);
        String str_second = String.valueOf(second);
        if (this.hour < 10) {
            str_hour = "0" + str_hour;
        }
        if (this.minute < 10) {
            str_minute = "0" + str_minute;
        }
        if (this.second < 10) {
            str_second = "0" + str_second;
        }
        return String.format("%s:%s:%s", str_hour, str_minute, str_second);
    }


    public MyTime nextSecond() {
        second += 1;
        this.updateTime();
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        this.updateTime();
        return this;
    }

    public MyTime nextHour() {
        hour++;
        this.updateTime();
        return this;
    }

    public MyTime previousSecond() {
        second--;
        this.updateTime();
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        this.updateTime();
        return this;
    }

    public MyTime previousHour() {
        hour--;
        this.updateTime();
        return this;
    }

    private boolean isValidTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            return true;
        }
        return false;
    }

    private boolean isValidHour(int hour) {
        if (hour >= 0 && hour <= 23) return true;
        return false;
    }

    private boolean isValidMinute(int minute) {
        if (minute >= 0 && minute <= 59) return true;
        return false;
    }

    private boolean isValidSecond(int second) {
        if (second >= 0 && second <= 59) return true;
        return false;
    }

    private void updateTime() {
        if (second == 60) {
            minute++;
            second = 0;
        }
        if (minute == 60) {
            hour++;
            minute = 0;
        }
        if (hour == 24) {
            hour = 0;
        }
        if (second < 0) {
            minute -= 1;
            second = 59;
        }
        if (minute < 0) {
            hour -= 1;
            minute = 59;
        }
        if (hour < 0) {
            hour = 23;
        }
    }
}
