public class SumAverageRunningInt{
    public static void main(String[] args){

        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = 1; number <= 100; number++){
            sum += number;
        }

        int numbers_of_numbers = UPPERBOUND - LOWERBOUND + 1;
        average = ((double) sum) / numbers_of_numbers;
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is: " + average); 
    }
}