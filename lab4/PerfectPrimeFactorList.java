import java.util.Scanner;

public class PerfectPrimeFactorList {

    public static boolean isPrime(int n) {
        if (n == 2 || n == 1) return true;
        if (n % 2 == 0 || n <= 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPerfectPrimeFactor(int n) {
        if (isPrime(n)) return false;
        int product = 1;
        for (int j = 2; j <= n; j++) {
            if (n % j == 0 && isPrime(j)) {
                product *= j;
            }
        }
        return product == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();

        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int i = 0; i <= upperBound; i++) {
            if (isPerfectPrimeFactor(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();

        double prob;
        if (count == 0) prob = 0;
        else prob = 100.0 * count / upperBound;
        System.out.printf("[%d numbers found (%.2f%%)]", count, prob);
    }
}
