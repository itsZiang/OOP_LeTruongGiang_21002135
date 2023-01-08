import java.util.Scanner;

public class RadixN2Dec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radix: ");
        int radix = sc.nextInt();
        System.out.print("Enter the string: ");
        String str = sc.next();
        String str_uppercase = str.toUpperCase();

        int check = 0;

        for (int charIdx = 0; charIdx < str.length(); charIdx++){
            if(radix>=10){
                if (!Character.isLetter(str.charAt(charIdx)) && !Character.isDigit(str.charAt(charIdx))){
                    check++;
                    break;
                }
                else if((str_uppercase.charAt(charIdx) < 'A' || str_uppercase.charAt(charIdx) > (char)('F'-16+radix)) && (str_uppercase.charAt(charIdx) < '0' || str_uppercase.charAt(charIdx) > '9')){
                    check++;
                    break;
                }
            }
            else{
                if (Character.isLetter(str.charAt(charIdx)) || str.charAt(charIdx) < '0' || str.charAt(charIdx) > (char)(radix-1+'0')){
                    check++;
                    break;
                }
            }
        }
        if (check == 0){
            int result = 0;
            int decimal;
            for (int charIdx = 0; charIdx < str.length(); charIdx++){
                char ch = str.charAt(charIdx);
                if (Character.isLetter(str.charAt(charIdx))) decimal = Integer.parseInt(String.valueOf(ch), 16);
                else decimal = ch - '0';
                result += decimal*Math.pow(radix,str.length()-(charIdx+1));
            }
            System.out.printf("The equivalent decimal number \"%s\" is: %d", str, result);
        }
        else System.out.printf("error: invalid string \"%s\"", str);
    }

}
