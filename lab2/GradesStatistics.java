import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        final int NUM_STUDENTS = sc.nextInt();
        int sum = 0;
        int[] grades = new int[NUM_STUDENTS];

        // checking the grade is valid or not
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

        //print grades
        System.out.printf("The grades are: [%d, ", grades[0]);
        for (int i = 1; i < grades.length; i++) {
            if (i == grades.length - 1) System.out.printf("%d]", grades[i]);
            else System.out.printf("%d, ", grades[i]);
        }
        System.out.println();

        // sort
        for (int i = 0; i < grades.length - 1; i++) {
            for (int j = i + 1; j < grades.length; j++) {
                if (grades[i] > grades[j]) {
                    int temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;
                }
            }
        }

        double median;
        if (grades.length % 2 == 1) median = grades[grades.length / 2];
        else median = 1.0*(grades[grades.length / 2 - 1] + grades[grades.length / 2]) / 2;

        double deviation;
        double total = 0;
        for (int i : grades) {
            total += i * i;
        }
        deviation = Math.sqrt(total / NUM_STUDENTS - average * average);

        System.out.printf("The average is: %.2f\n", average);
        System.out.printf("The median is: %.2f\n", median);
        System.out.printf("The minimum is: %d\n", min);
        System.out.printf("The maximum is: %d\n", max);
        System.out.printf("The standard deviation is: %.2f", deviation);
    }
}
