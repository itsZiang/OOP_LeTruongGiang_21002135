import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n%2 == 0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd number");
        }
        System.out.println("Bye!");
        sc.close();
    }
}