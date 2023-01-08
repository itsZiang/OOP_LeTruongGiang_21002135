public class DateUtil {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0 && year % 4 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) return false;
        else if (month < 1 || month > 12) return false;
        else {
            if (month == 1 && day >= 1 && day <= 31) return true;
            else if (month == 2) {
                if (isLeapYear(year) && day >= 1 && day <= 29) return true;
                else if (!isLeapYear(year) && day >= 1 && day <= 28) return true;
            } else {
                if (month <= 7) {
                    return (month % 2 == 1 && day >= 1 && day <= 31) || (month % 2 == 0 && day >= 1 && day <= 30);
                }
                return (month % 2 == 1 && day >= 1 && day <= 30) || (month % 2 == 0 && day >= 1 && day <= 31);
            }
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

    public static String toString(int year, int month, int day) {
        String day_of_week = "";
        switch (getDayOfWeek(year, month, day)) {
            case 0 -> day_of_week = "Sunday";
            case 1 -> day_of_week = "Monday";
            case 2 -> day_of_week = "Tuesday";
            case 3 -> day_of_week = "Wednesday";
            case 4 -> day_of_week = "Thursday";
            case 5 -> day_of_week = "Friday";
            case 6 -> day_of_week = "Saturday";
        }
        String str_month = "";
        switch (month) {
            case 1 -> str_month = "Jan";
            case 2 -> str_month = "Feb";
            case 3 -> str_month = "Mar";
            case 4 -> str_month = "Apr";
            case 5 -> str_month = "May";
            case 6 -> str_month = "Jun";
            case 7 -> str_month = "Jul";
            case 8 -> str_month = "Aug";
            case 9 -> str_month = "Sep";
            case 10 -> str_month = "Oct";
            case 11 -> str_month = "Nov";
            case 12 -> str_month = "Dec";
        }
        return day_of_week + " " + day + " " + str_month + " " + year;
    }

    public static void main(String[] args) {
        System.out.println(toString(2012, 2, 14));
    }
}
