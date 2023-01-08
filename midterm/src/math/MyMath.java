package math;

import java.io.FileWriter;
import java.math.BigInteger;

public class MyMath {
    public MyMath() {
    }

    public static double cos(double x) {
        double err = 1e-12;
        double cos = 1;
        double phanso = 1;
        int i = 2;
        while (Math.abs(phanso) > err) {
            phanso = -phanso * x * x / i / (i - 1);
            cos += phanso;
            i += 2;
        }
        return cos;
    }

    public static double exp(double x) {
        double err = 1e-12;
        double exp = 1;
        double phanso = 1;
        int i = 1;
        while (Math.abs(phanso) > err) {
            phanso = phanso * x / i;
            exp += phanso;
            i++;
        }
        return exp;
    }

    public static String decimalTo(String in, int outRadix) {
        BigInteger dec = new BigInteger(in);
        String res = "";
        while (dec.compareTo(BigInteger.ZERO) > 0) {
            int tmp = Integer.parseInt(dec.mod(new BigInteger(outRadix + "")).toString());
            if (tmp < 10) {
                res = tmp + res;
            } else {
                res = (char) (tmp + 55) + res;
            }
            dec = dec.divide(new BigInteger(outRadix + ""));
        }
        return res;
    }

    public static String toDecimal(String in, int inRadix) {
        in = in.toUpperCase();
        BigInteger res = new BigInteger("0");
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                res = res.multiply(new BigInteger(inRadix + "")).add(new BigInteger(d + ""));

            } else if (c >= 'A' && c <= 'F') {
                int d = c - 'A' + 10;
                res = res.multiply(new BigInteger(inRadix + "")).add(new BigInteger(d + ""));
            }
        }
        return res + "";
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        if (outRadix == 10) {
            return toDecimal(in, inRadix);
        }
        if (inRadix == 10) {
            return decimalTo(in, outRadix);
        }
        String dec = toDecimal(in, inRadix);
        System.out.println(dec);
        return decimalTo(dec, outRadix);
    }


    public static void main(String[] args) {
        String result = "e^(2.2) * cos(3.3) = " + exp(2.2) * cos(3.3) + "\n";
        result += "using java libraries: " + Math.exp(2.2) * Math.cos(3.3) + "\n\n";
        result += "123456789123456789 in 13 to 8: " + toRadix("123456789123456789", 13, 8) + "\n";
        System.out.println(result);

        try {
            FileWriter fileWriter = new FileWriter("MyMath1234.txt");
            fileWriter.write(result);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Can't write to file!");
            e.printStackTrace();
        }
    }
}
