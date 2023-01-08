public class GreatestCommonDivisor {

    public static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(15, 5));
        System.out.println(gcd(99, 88));
        System.out.println(gcd(3456, 1233));
        System.out.println(gcd(15, 0));
    }
}
