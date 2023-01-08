import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        sc.close();

        System.out.print("The reverse is: ");
        while (number > 0) {
            System.out.print( number % 10 + " ");
            number = number / 10;
        }
    }
}