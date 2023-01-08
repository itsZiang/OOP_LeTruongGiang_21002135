import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();
        int[] items = new int[NUM_ITEMS];


        System.out.print("Enter the value of items (separated by space): ");
        for (int i = 0; i < items.length; i++) {
            items[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.printf("The values are: [%d, ", items[i]);
            } else if (i == items.length - 1) System.out.printf("%s]", items[i]);
            else System.out.printf("%d, ", items[i]);
        }
    }
}
