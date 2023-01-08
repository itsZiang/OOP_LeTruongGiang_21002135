import java.util.Scanner;

public class TrigonometricSeries {

    public static double sin(double x, int numTerms) {
        x = x * 0.01745329252;
        double element = x;
        double result = element;

        int k = 1;
        for (int i = 1; i <= numTerms; i += 2) {
            element = element * x * x / ((i + 1) * (i + 2));
            result += element * Math.pow(-1, k);
            k++;
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        x = x * Math.PI / 180;
        double element = 1;
        double result = element;

        int k = 1;
        for (int i = 1; i <= numTerms; i += 2) {
            element = element * x * x / ((i + 1) * i);
            result += element * Math.pow(-1, k);
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number x (degrees): ");
        double x = sc.nextDouble();
        System.out.print("Enter the number terms (integer): ");
        int numTerms = sc.nextInt();

        System.out.printf("The value of sin(%.2f) is: %.3f\n", x, sin(x, numTerms));
        System.out.printf("The value of cos(%.2f) is: %.3f", x, cos(x, numTerms));

        sc.close();
    }
}
