import java.util.Scanner;

public class DecipherCaesarCode {

    public static char decipher(char uppercaseLetter){
        return (char)(uppercaseLetter - 3);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a ciphertext string: ");
        String str = sc.next().toUpperCase();
        String result = "";

        char ch;

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            if (str.charAt(charIdx) == 'A')
                ch = 'X';
            else if (str.charAt(charIdx) == 'B')
                ch = 'Y';
            else if (str.charAt(charIdx) == 'C')
                ch = 'Z';
            else
                ch = (char) (int)(decipher(str.charAt(charIdx)));
            result += ch;
        }
        System.out.printf("The plaintext string is: %s", result);
    }
}
