import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = sc.next();

        String str_uppercase = str.toUpperCase();
        int check = 0;

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            if (!Character.isLetter(str_uppercase.charAt(charIdx)) && !Character.isDigit(str_uppercase.charAt(charIdx))){
                check++;
                break;
            }
            else if((str_uppercase.charAt(charIdx) < 'A' || str_uppercase.charAt(charIdx) > 'F') && (str_uppercase.charAt(charIdx) < '0' || str_uppercase.charAt(charIdx) > '9')){
                check++;
                break;
            }
        }
        if (check == 0) System.out.printf("\"%s\" is a hex string", str);
        else System.out.printf("\"%s\" is NOT a hex string", str);
    }
}
