import java.util.Scanner;

public class Assignment_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        final int NUM_STUDENTS = sc.nextInt();
        int sum = 0;
        int[] grades = new int[NUM_STUDENTS];

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
            boolean isValid = false;
            do {
                System.out.print("Enter the grade (0-100) for student " + studentNo + ": ");
                grades[studentNo - 1] = sc.nextInt();

                if (grades[studentNo - 1] >= 0 && grades[studentNo - 1] <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            }
            while (!isValid);

            sum += grades[studentNo - 1];
        }
        double average = sum * 1.0 / NUM_STUDENTS;

        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (max < grades[i]) {
                max = grades[i];
            }
        }

        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (min > grades[i]) {
                min = grades[i];
            }
        }
        System.out.printf("The average is: %.2f\n", average);
        System.out.printf("The minimum is: %d\n", min);
        System.out.printf("The maximum is: %d", max);
    }
}
