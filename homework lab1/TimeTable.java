import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        for (int row = -1; row <= size; row++){
            if (row == -1){
                System.out.printf("%-3s|", "*");
            }
            else if (row == 0){
                System.out.print("-----");
            }
            else if (row > 0){
                System.out.printf("%-3d|", row);
            }

            for (int col = 1; col <= size; col++){
                if (row == -1){
                    System.out.printf("%4d", col);
                    continue;
                }
                else if (row == 0){
                    System.out.print("----");
                    continue;
                }
                System.out.printf("%4d", row * col);
            }

            System.out.println();
        }
    }
}
