public class Fibonacci {

    public static int fibonacci_(int n){
        if (n == 0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        return fibonacci_(n-1) + fibonacci_(n-2);
    }
    public static void main(String[] args){

        System.out.println("The first 20 fibonacci numbers are:");
        double sum = 0;
        int n = 20;

        for (int i = 1; i <= n; i++){
            System.out.print(fibonacci_(i) + " ");
            sum += fibonacci_(i);
        }
        System.out.println();
        System.out.println("The average is " + sum/n);
    }
}