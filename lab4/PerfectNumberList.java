import java.util.Scanner;

public class PerfectNumberList {

    public static boolean isPerfect(int n) {
        if (n % 2 == 1) return false;

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();

        int countPerfect = 0;
        System.out.println("These numbers are perfect: ");
        for (int i = 1; i <= upperBound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfect++;
            }
        }
        System.out.println();
        double perfectProbability;
        if (countPerfect == 0) perfectProbability = 0;
        else perfectProbability = 100.0 * countPerfect / upperBound;
        System.out.printf("[%d perfect numbers found (%.2f%%)]", countPerfect, perfectProbability);
        System.out.println("\n");

        int count = 0;
        System.out.println("These numbers are neither deficient nor perfect: ");
        for (int i = 1; i <= upperBound; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        double probability;
        if (count == 0) probability = 0;
        else probability = 100.0 * count / upperBound;
        System.out.printf("[%d numbers found (%.2f%%)]\n", count, probability);
    }
}
