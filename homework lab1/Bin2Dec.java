import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Binary string: ");
        String str = sc.next();
        int decimalNum = 0;
        int check_number = 0;

        for (int charIdx = 0; charIdx < str.length(); charIdx++) {
            if (!Character.isDigit(str.charAt(charIdx)) || (str.charAt(charIdx) != '0' && str.charAt(charIdx) != '1')) {
                check_number++;
                break;
            }
            else{
                int n = (str.charAt(charIdx) - '0');
                decimalNum += n * Math.pow(2,str.length()-(charIdx+1));
            }
        }
        if (check_number != 0){
            System.out.printf("error: invalid binary string \"%s\"", str);
        }
        else System.out.printf("The equivalent decimal number for binary \"%s\" is: %d", str, decimalNum);

    }
}
