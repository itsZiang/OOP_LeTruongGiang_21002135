package exercise1.exercise1_3;

import exercise1.exercise1_2.MyTime;

public class MyDate {

    private int year;
    private int month;
    private int day;
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year >= 1 && year <= 9999 && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            if (month == 2 && isLeapYear(year)) {
                return day <= 29;
            }
            return day <= DAYS_IN_MONTHS[month - 1];
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int centuryCode = 0;
        switch ((year / 100) % 4) {
            case 1 -> centuryCode = 4;
            case 2 -> centuryCode = 2;
            case 3 -> centuryCode = 0;
            case 0 -> centuryCode = 6;
        }
        int yearLastTwoDigit = year - (year / 100) * 100;
        int yearCode = yearLastTwoDigit / 4;
        int monthCode = 0;
        switch (month) {
            case 3, 11 -> monthCode = 3;
            case 4, 7 -> monthCode = 6;
            case 5 -> monthCode = 1;
            case 6 -> monthCode = 4;
            case 8 -> monthCode = 2;
            case 9, 12 -> monthCode = 5;
            case 10 -> monthCode = 0;
        }
        if (!isLeapYear(year)) {
            switch (month) {
                case 1 -> monthCode = 0;
                case 2 -> monthCode = 3;
            }
        } else {
            switch (month) {
                case 1 -> monthCode = 6;
                case 2 -> monthCode = 2;
            }
        }
        return (centuryCode + yearLastTwoDigit + yearCode + monthCode + day) % 7;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        try {
            if (!isValidDate(year, month, day)) throw new IllegalArgumentException("Invalid year, month, or day!");
            else {
                this.year = year;
                this.month = month;
                this.day = day;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year, month, or day!");
        }
    }

    public void setYear(int year) {
        try {
            if (isValidDate(year, this.month, this.day)) {
                this.year = year;
            } else throw new IllegalArgumentException("Invalid year!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year!");
        }
    }

    public void setMonth(int month) {
        try {
            if (isValidDate(this.year, month, this.day)) {
                this.month = month;
            } else throw new IllegalArgumentException("Invalid month!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid month!");
        }
    }

    public void setDay(int day) {
        try {
            if (isValidDate(this.year, this.month, day)) {
                this.day = day;
            } else throw new IllegalArgumentException("Invalid day!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day!");
        }
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s %d", DAYS[getDayOfWeek(year, month, day)], day, MONTHS[month - 1], year);
    }

    public MyDate nextDay() {
        day++;
        this.updateDate();
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month == 2 && !isValidDate(year, month, day)) {
            if (isLeapYear(year)) {
                day = 29;
            } else day = 28;
        }
        this.updateDate();
        return this;
    }

    public MyDate nextYear() {
        year++;
        this.updateDate();
        return this;
    }

    public MyDate previousDay() {
        day--;
        this.updateDate();
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month == 2 && isValidDate(year, month, day)) {
            if (isLeapYear(year)) {
                day = 29;
            } else day = 28;
        }
        if (!isValidDate(year, month, day)) {
            day--;
        }
        this.updateDate();
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (month == 2 && !isValidDate(year, month, day)) {
            if (isLeapYear(year)) {
                day = 29;
            } else day = 28;
        }
        this.updateDate();
        return this;
    }

    private void updateDate() {
        if (month == 2 && isLeapYear(this.year)) {
            if (day == 30) {
                month++;
                day = 1;
            }
        } else if (day == DAYS_IN_MONTHS[month - 1] + 1) {
            month++;
            day = 1;
        }
        if (month == 13) {
            year++;
            month = 1;
        }
        if (year == 10000) {
            year = 1;
        }
        if (day == 0) {
            day = DAYS_IN_MONTHS[month - 1];
            month--;
        }
        if (month == 0) {
            year--;
            month = 12;
        }
        if (year == 0) {
            year = 9999;
        }
    }
}
