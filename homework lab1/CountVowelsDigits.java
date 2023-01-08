import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();
        str = str.toLowerCase();

        int count_digits = 0;
        int count_vowels = 0;

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            if (Character.isDigit(str.charAt(charIdx))) {
                count_digits++;
            }
            else if (str.charAt(charIdx) == 'a' || str.charAt(charIdx) == 'i' || str.charAt(charIdx) == 'o' || str.charAt(charIdx) == 'u' || str.charAt(charIdx) == 'e'){
                count_vowels++;
            }
        }

        System.out.printf("Number of vowels: %d (%.2f%%)\n", count_vowels, count_vowels*1.0*100/str.length());
        System.out.printf("Number of digits: %d (%.2f%%)", count_digits, count_digits*1.0*100/str.length());

    }
}
