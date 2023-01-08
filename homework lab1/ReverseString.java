import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();
        char ch;
        String reverseString = "";

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            ch = str.charAt(charIdx);
            reverseString = ch+reverseString;
        }
        System.out.printf("The reverse of the String \"%s\" is \"%s\".", str, reverseString);

    }
}
