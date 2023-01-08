import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        for(int row = 0; row < size; row++){
            for (int col = 0; col < size; col++){
                System.out.print("# ");
            }
            System.out.println("");
        }
    }
}
