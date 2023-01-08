import java.util.Scanner;

public class MagicSum {
    public static boolean hasEight(int number) {
        while (number % 10 > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SENTINEL = -1;
        int number;
        int sum = 0;

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = sc.nextInt();
        while (number != SENTINEL) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();
            if (hasEight(number)) sum += number;
        }
        System.out.print("The magic sum is: " + sum);
    }

}
