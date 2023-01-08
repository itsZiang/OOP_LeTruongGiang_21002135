import java.util.Scanner;

public class HillPatternB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int numRows = sc.nextInt();
        int numCols = 2 * numRows - 1;

        for (int row = 1; row <= numRows; row++){
            for (int col = 1; col <= numCols; col++){
                if (col <= numRows && row <= col){
                    System.out.print("# ");
                }
                else if (col > numRows && col + row <= 2 * numRows){
                    System.out.print("# ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
