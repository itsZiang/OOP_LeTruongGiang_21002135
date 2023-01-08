import java.util.Scanner;

public class TestPalindromePhrase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String str = sc.nextLine();
        String str_uppercase = str.toUpperCase();

        char ch;
        String reverse = "";
        String phrase = "";

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            if (Character.isLetter(str_uppercase.charAt(charIdx))){
                ch = str_uppercase.charAt(charIdx);
                reverse = ch + reverse;
                phrase = phrase + ch;
            }
        }
        if(phrase.equals(reverse)){
            System.out.printf("\"%s\" is a palindrome", str);
        }
        else System.out.printf("\"%s\" is not a palindrome", str);

    }

}
