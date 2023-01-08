import java.util.Scanner;

public class PrimeList {

    public static boolean isPrime(int n) {
        if (n == 2 || n == 1) return true;
        if (n % 2 == 0 || n <= 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int upperBound = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        double prob;
        if (count == 0) prob = 0;
        else prob = 100.0 * count / upperBound;
        System.out.printf("[%d primes found (%.2f%%)]", count, prob);
    }
}
