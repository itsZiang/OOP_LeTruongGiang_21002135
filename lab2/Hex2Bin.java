import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String input = sc.next();
        String str = input.toUpperCase();
        String hex = "0123456789ABCDEF";

        final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101",
                "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

        int check = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F')) {
                check++;
            }
        }

        if (check == 0) {
            System.out.printf("The equivalent binary for hexadecimal \"%s\" is: ", input);
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < hex.length(); j++) {
                    if (str.charAt(i) == hex.charAt(j)) {
                        System.out.print(HEX_BITS[j] + " ");
                    }
                }
            }
        } else System.out.print("Invalid input string.");
    }
}
