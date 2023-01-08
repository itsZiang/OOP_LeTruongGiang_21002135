
public class FibonacciInt {

    public static int fibonacci(int n) {
        if (n < 0) return 0;
        else if (n == 0) return 1;
        else if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (fibonacci(i - 2) <= Integer.MAX_VALUE - fibonacci(i - 1)) {
                System.out.printf("F(%d) = %d\n", i, fibonacci(i));
            } else {
                System.out.printf("F(%d) is out of the range of int\n", i);
                break;
            }
        }
    }
}
