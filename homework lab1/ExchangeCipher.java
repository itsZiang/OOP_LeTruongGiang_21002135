import java.util.Scanner;

public class ExchangeCipher {

    public static char exchange(char uppercaseLetter){
        return (char)(int)(155-(int)uppercaseLetter);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the plaintext string: ");
        String str = sc.next().toUpperCase();

        char ch;
        String result = "";

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            ch = exchange(str.charAt(charIdx));
            result += ch;
        }
        System.out.printf("The ciphertext string is: %s", result);
    }
}
