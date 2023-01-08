import java.util.Scanner;

public class PhoneKeyPad {
    public static int getNumber(char uppercaseLetter) {
        int number = switch (uppercaseLetter) {
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            default -> 0;
        };
        return number;
    }

    public static int get_number(char uppercaseLetter){
        int number;
        if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C'){
            number = 2;
        }
        else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F'){
            number = 3;
        }
        else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I'){
            number = 4;
        }
        else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L'){
            number = 5;
        }
        else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O'){
            number = 6;
        }
        else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S'){
            number = 7;
        }
        else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V'){
            number = 8;
        }
        else if (uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y' || uppercaseLetter == 'Z'){
            number = 9;
        }
        else number = 0;
        return number;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string to convert in phone keypad: ");
        String stringVal = in.next();

        for (int i = 0; i < stringVal.length(); i++) {
            if (Character.isLetter(stringVal.charAt(i)))
                System.out.print(getNumber(Character.toUpperCase(stringVal.charAt(i))));
            else
                System.out.print(stringVal.charAt(i));
        }
    }
}
