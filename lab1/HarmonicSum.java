public class HarmonicSum {
    public static void main(String[] args){

        final int MAX_DENOMINATOR = 5;
        double sum = 0.0;

        for (double i = 1; i <= MAX_DENOMINATOR; i++){
            sum += 1/i;    
        }
        System.out.println("harmonic(" + MAX_DENOMINATOR + ") = " + sum);
    }
}