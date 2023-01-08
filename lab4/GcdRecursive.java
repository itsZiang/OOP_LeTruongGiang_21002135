public class GcdRecursive {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(6, 3));
        System.out.println(gcd(6, 2));
        System.out.println(gcd(6, 9));
        System.out.println(gcd(9, 6));
        System.out.println(gcd(9, 1));
    }
}
