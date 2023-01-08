package exercise1.exercise1_8;

public class TestMyPolynomial {

    public static void main(String[] args) {

        MyPolynomial p1 = new MyPolynomial(1, 2, 3, 4, 5);
        MyPolynomial p2 = new MyPolynomial(6, 7, 8, 9);

        System.out.println("Polynomial p1: " + p1);
        System.out.println("Polynomial p2: " + p2);

        MyPolynomial p3 = new MyPolynomial(1, 0, 3);
        System.out.println("Polynomial p5: " + p3);
        System.out.println("Polynomial evaluated with x = 3: " + p3.evaluate(3));

        System.out.println("Sum of polynomials p1 and p2: " + p1.add(p2));

        p1 = new MyPolynomial(1.1, 2.2, 3.3);
        p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("Sum of polynomials p2 and p1: " + p2.add(p1));

        p1 = new MyPolynomial(1.1, 2.2, 3.3);
        p2 = new MyPolynomial(1.1, 2.2, 3.3);
        System.out.println("Multiply of polynomials p1 and p2: " + p1.multiply(p2));
    }
}
