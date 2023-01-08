import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Octal string: ");
        String str = sc.next();

        int check = 0;

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            if (Character.isLetter(str.charAt(charIdx)) || str.charAt(charIdx) < '0' || str.charAt(charIdx) > '7'){
                check++;
                break;
            }
        }

        if (check == 0){
            int result = 0;
            int decimal;
            for (int charIdx = 0; charIdx < str.length(); charIdx++){
                char ch = str.charAt(charIdx);
                decimal = ch - '0';
                result += decimal*Math.pow(8,str.length()-(charIdx+1));
            }
            System.out.printf("The equivalent decimal number for octal \"%s\" is: %d", str, result);
        }
        else System.out.printf("error: invalid octal string \"%s\"", str);
    }
}
