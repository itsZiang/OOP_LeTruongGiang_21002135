package exercise1.exercise1_7;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        MyComplex myComplex1 = new MyComplex(real1, imag1);

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();
        MyComplex myComplex2 = new MyComplex(real2, imag2);
        System.out.println();

        System.out.println("Number 1 is: (" + myComplex1 + ")");
        if (myComplex1.isReal()){
            System.out.println("(" + myComplex1 + ")" + " is a pure real number");
        }
        else System.out.println("(" + myComplex1 + ")" + " is NOT a pure real number");
        if (myComplex1.isImaginary()){
            System.out.println("(" + myComplex1 + ")" + " is a pure imaginary number");
        }
        else System.out.println("(" + myComplex1 + ")" + " is NOT a pure imaginary number");

        System.out.println();

        System.out.println("Number 2 is: (" + myComplex2 + ")");
        if (myComplex2.isReal()){
            System.out.println("(" + myComplex2 + ")" + " is a pure real number");
        }
        else System.out.println("(" + myComplex2 + ")" + " is NOT a pure real number");
        if (myComplex2.isImaginary()){
            System.out.println("(" + myComplex2 + ")" + " is a pure imaginary number");
        }
        else System.out.println("(" + myComplex2 + ")" + " is NOT a pure imaginary number");
        System.out.println();

        if (myComplex1.equals(myComplex2)){
            System.out.println("(" + myComplex1 + ")" + " is equal to (" + myComplex2 + ")");
        }
        else System.out.println("(" + myComplex1 + ")" + " is NOT equal to (" + myComplex2 + ")");

        MyComplex myComplex3 = myComplex1.addNew(myComplex2);
        System.out.println("(" + myComplex1 + ")" + " +" + " (" + myComplex2 + ") = " + "(" + myComplex3 + ")");


    }
}
