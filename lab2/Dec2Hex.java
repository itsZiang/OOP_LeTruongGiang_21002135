import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        String result = "";

        while (number > 0) {
            int remain = number % 16;
            number = number / 16;
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
        System.out.print("The equivalent hexadecimal number is " + result);
        sc.close();
    }
}
