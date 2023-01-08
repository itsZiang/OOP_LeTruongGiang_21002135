import java.util.Scanner;

public class NumberSystemConversion {

    public static int radix2Dec(int radix, String str) {
        str = str.toUpperCase();

        int check = 0;

        for (int charIdx = 0; charIdx < str.length(); charIdx++) {
            if (radix >= 10) {
                if (!Character.isLetter(str.charAt(charIdx)) && !Character.isDigit(str.charAt(charIdx))) {
                    check++;
                    break;
                } else if ((str.charAt(charIdx) < 'A' || str.charAt(charIdx) > (char) ('F' - 16 + radix)) && (str.charAt(charIdx) < '0' || str.charAt(charIdx) > '9')) {
                    check++;
                    break;
                }
            } else {
                if (Character.isLetter(str.charAt(charIdx)) || str.charAt(charIdx) < '0' || str.charAt(charIdx) > (char) (radix - 1 + '0')) {
                    check++;
                    break;
                }
            }
        }
        if (check == 0) {
            int result = 0;
            int decimal;
            for (int charIdx = 0; charIdx < str.length(); charIdx++) {
                char ch = str.charAt(charIdx);
                if (Character.isLetter(str.charAt(charIdx))) decimal = Integer.parseInt(String.valueOf(ch), 16);
                else decimal = ch - '0';
                result += decimal * Math.pow(radix, str.length() - (charIdx + 1));
            }
            return result;
        }
        return -1;
    }

    public static String dex2Radix(int radix, int number) {
        String result = "";

        while (number > 0) {
            int remain = number % radix;
            number = number / radix;
            if (remain < 9) {
                String s = String.valueOf(remain);
                result = s + result;
            } else {
                switch (remain) {
                    case 10 -> result = "A" + result;
                    case 11 -> result = "B" + result;
                    case 12 -> result = "C" + result;
                    case 13 -> result = "D" + result;
                    case 14 -> result = "E" + result;
                    case 15 -> result = "F" + result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String str = sc.next();
        System.out.print("Enter the input radix: ");
        int inputRadix = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outputRadix = sc.nextInt();
        System.out.printf("\"%s\" in radix %d is \"%s\" in radix %d", str, inputRadix, dex2Radix(outputRadix, radix2Dec(inputRadix, str)), outputRadix);
    }
}
