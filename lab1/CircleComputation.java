import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double radius;
        double diameter;
        double circumferences;
        double area;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
        sc.close();

        diameter = radius * 2.0;
        circumferences = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;

        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumferences is: %.2f%n", circumferences);
        System.out.printf("Area is: %.2f%n", area);
    }
}
