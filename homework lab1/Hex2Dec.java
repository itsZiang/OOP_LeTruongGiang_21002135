import java.util.Scanner;

public class Hex2Dec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String str = sc.next();
        String str_uppercase = str.toUpperCase();

        int check = 0;

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            if (!Character.isLetter(str.charAt(charIdx)) && !Character.isDigit(str.charAt(charIdx))){
                check++;
                break;
            }
            else if((str_uppercase.charAt(charIdx) < 'A' || str_uppercase.charAt(charIdx) > 'F') && (str_uppercase.charAt(charIdx) < '0' || str_uppercase.charAt(charIdx) > '9')){
                check++;
                break;
            }
        }
        if (check == 0){
            int result = 0;
            int decimal;
            for (int charIdx = 0; charIdx < str.length(); charIdx++){
                char ch = str.charAt(charIdx);
                if (Character.isLetter(str.charAt(charIdx))) decimal = Integer.parseInt(String.valueOf(ch), 16);
                else decimal = ch - '0';
                result += decimal*Math.pow(16,str.length()-(charIdx+1));
            }
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", str, result);
        }
        else System.out.printf("error: invalid hexadecimal string \"%s\"", str);
    }
}
