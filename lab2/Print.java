public class Assignment_23 {

    public static void print(int[] array) {
        if (array.length == 0) System.out.print("[]");
        else if (array.length > 1) {
            System.out.printf("[%d, ", array[0]);
            for (int i = 1; i < array.length; i++) {
                if (i == array.length - 1) System.out.printf("%d]", array[i]);
                else System.out.printf("%d, ", array[i]);
            }
        } else System.out.printf("[%d]", array[0]);
    }

    public static void print(float[] array) {
        if (array.length == 0) System.out.print("[]");
        else if (array.length > 1) {
            System.out.printf("[%f, ", array[0]);
            for (int i = 1; i < array.length; i++) {
                if (i == array.length - 1) System.out.printf("%f]", array[i]);
                else System.out.printf("%f, ", array[i]);
            }
        } else System.out.printf("[%f]", array[0]);
    }

    public static void print(double[] array) {
        if (array.length == 0) System.out.print("[]");
        else if (array.length > 1) {
            System.out.printf("[%f, ", array[0]);
            for (int i = 1; i < array.length; i++) {
                if (i == array.length - 1) System.out.printf("%f]", array[i]);
                else System.out.printf("%f, ", array[i]);
            }
        } else System.out.printf("[%f]", array[0]);
    }

    public static void main(String[] args) {
        print(new int[]{1, 2, 4, 5});
        System.out.println();
        print(new double[]{1, 2, 4, 5});
        System.out.println();
        print(new float[]{1, 2, 4, 5});
    }
}
