public class RunningNumberLength {

    public static int numOfDigits(int n) {
        String str = n + "";
        return str.length();
    }

    public static int len(int n) {
        if (n == 1) return 1;
        return len(n - 1) + numOfDigits(n);
    }

    public static void main(String[] args) {
        System.out.println(len(1));
        System.out.println(len(2));
        System.out.println(len(3));
        System.out.println(len(9));
        System.out.println(len(10));
        System.out.println(len(11));
    }
}
