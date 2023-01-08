import java.util.Scanner;
public class CheckPassFail{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();
        System.out.println("The mark is: " + mark);

        if (0 <= mark && mark <= 100){
            if (mark <= 50){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
            System.out.println("DONE");
        }
        else{
            System.out.println("The mark is a negative number. Please try again?");
        }
        sc.close();
    }
}