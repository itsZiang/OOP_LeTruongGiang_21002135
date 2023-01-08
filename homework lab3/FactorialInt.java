public class FactorialInt {

    public static int factorial(int n) {
        if (n < 0) return -1;
        else if (n == 0) return 1;
        else if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void printValues() {
        int maxValue = Integer.MAX_VALUE;

        for (int i = 1; i <= 20; i++) {
            if (maxValue / factorial(i - 1) < i) {
                System.out.printf("The factorial of %d is out of range", i);
                break;
            } else System.out.printf("The factorial of %d is %d\n", i, factorial(i));
        }
    }

    public static void main(String[] args) {
        printValues();
    }
}
