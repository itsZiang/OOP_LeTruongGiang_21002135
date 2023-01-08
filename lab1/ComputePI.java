import java.lang.Math;

public class ComputePI {
    public static void main(String[] args){

        final int MAX_DENOMINATOR = 1000000;
        double sum = 0.0;
        int temp = 0;

        for (double i = 1; i <= MAX_DENOMINATOR; i+= 2){
            sum += 1/i*Math.pow(-1,temp);
            temp++;
        }
        System.out.println(4*sum);
    }
}
