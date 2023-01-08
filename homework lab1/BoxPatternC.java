import java.util.Scanner;

public class BoxPatternC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        for (int row = 1; row < size; row++){
            for (int col = 1; col < size; col++){
                if (row == 1 || row == size - 1 || row + col == size){
                    System.out.print("# ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
