import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

        final int SECRET_NUMBER = (int) (Math.random() * 100);
        int count_trials = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Key in your guess:");
        int n = sc.nextInt();
        while (n != SECRET_NUMBER) {
            if (n < SECRET_NUMBER) System.out.println("Try higher");
            else System.out.println("Try lower");
            n = sc.nextInt();
            count_trials++;
        }
        System.out.printf("You got it in %d trials!", count_trials);
        sc.close();
    }
}
