import java.util.Scanner;

public class HillPatternD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int numRows = 2*n - 1;
        int numCols = 2*n - 1;

        for (int row = 1; row <= numRows; row++){
            for (int col = 1; col <= numCols; col++){
                if (row <= n && col <= n && row + col <= n + 1){
                    System.out.print("# ");
                }
                else if (row <= n && col >= n && row <= col - n + 1){
                    System.out.print("# ");
                }
                else if (row >= n && col <= n && col <= row - n + 1){
                    System.out.print("# ");
                }
                else if (row >= n && col >= n && col + row >= 3*n - 1){
                    System.out.print("# ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
