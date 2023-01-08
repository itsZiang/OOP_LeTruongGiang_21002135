import java.util.Scanner;

public class SpecialSeries {

    public static double specialSeries(double x, int numTerms) {
        double element = x;
        double result = element;

        for (int i = 1; i <= numTerms - 1; i += 2) {
            element = element * x * x * i / (i + 1);
            result += element / (i + 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x (-1 <= x <= 1): ");
        double x = sc.nextDouble();
        while (x < -1 || x > 1) {
            System.out.print("Enter x (-1 <= x <= 1): ");
            x = sc.nextDouble();
        }
        System.out.print("Enter the number terms: ");
        int numTerms = sc.nextInt();

        System.out.printf("The value of the special series is: %.2f", specialSeries(x, numTerms));
    }
}
