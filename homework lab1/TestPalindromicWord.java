import java.util.Scanner;

public class TestPalindromicWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = sc.next();
        String strUppercase = str.toUpperCase();

        char ch;
        String reverse = "";

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            ch = strUppercase.charAt(charIdx);
            reverse = ch + reverse;
        }

        if (reverse.equals(strUppercase)){
            System.out.printf("\"%s\" is a palindrome", str);
        }
        else System.out.printf("\"%s\" is not a palindrome", str);
    }
}
