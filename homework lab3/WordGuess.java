import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String word = args[0];
        String guess = "";

        for (int i = 0; i < word.length(); i++) {
            guess += "_";
        }

        char[] guessChar = guess.toCharArray();
        int count = 1;

        while (guess.contains("_")) {
            System.out.print("Key in one character or your guess word: ");
            String ch = sc.next();
            if (ch.equals(word)) {
                count++;
                break;
            }
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch.charAt(0)) {
                    guessChar[i] = ch.charAt(0);
                }
            }
            guess = String.valueOf(guessChar);
            System.out.printf("Trial %d: %s\n", count, guess);
            count++;
        }
        System.out.println("Congratulation!");
        System.out.printf("You got in %d trials", count - 1);
    }
}
