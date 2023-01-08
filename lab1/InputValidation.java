import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        int numberIn;

        do{
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn = scanner.nextInt();

            if ((numberIn >= 0 && numberIn <=10) || (numberIn >= 90 && numberIn <= 100)) {
                isValid = true;
                System.out.println("You have entered: " + numberIn);
            }
            else{
                System.out.println("Invalid input. Try again...");
            }
        }
        while(!isValid);
        scanner.close();
    }
}
