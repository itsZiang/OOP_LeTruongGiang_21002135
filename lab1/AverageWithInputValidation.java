import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        final int NUM_STUDENTS = 3;

        int numberIn;
        boolean isValid;
        int sum = 0;
        double average;

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {

            isValid = false;
            do{
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                numberIn = sc.nextInt();

                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                }
                else{
                    System.out.println("Invalid input, try again...");
                }
            }
            while(!isValid);
            sc.close();
            
            sum +=  numberIn;
        }
        average = sum / ((double) NUM_STUDENTS);
        System.out.printf("The average is: %.2f", average);
    }
}
