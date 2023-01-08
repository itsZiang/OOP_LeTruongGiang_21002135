package exercise1.exercise1_1;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger b2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println("add: " + b1.add(b2));
        System.out.println("multiply: " + b1.multiply(b2));
    }
}
