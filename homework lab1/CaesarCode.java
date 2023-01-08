import java.util.Scanner;

public class CaesarCode {

    public static char maHoa(char uppercaseLetter){
        return (char)(uppercaseLetter + 3);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String str = sc.next().toUpperCase();
        String result = "";

        char ch;

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            if (str.charAt(charIdx) == 'X')
                ch = 'A';
            else if (str.charAt(charIdx) == 'Y')
                ch = 'B';
            else if (str.charAt(charIdx) == 'Z')
                ch = 'C';
            else
                ch = (char) (int)(maHoa(str.charAt(charIdx)));
            result += ch;
        }
        System.out.printf("The ciphertext string is: %s", result);
    }
}
