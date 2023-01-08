public class Assignment_27 {

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        int check = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (i == j && array1[i] != array2[j]) {
                    check++;
                    break;
                }
            }
        }
        return check == 0;
    }

    public static void main(String[] args) {
        int[] array1 = {2};
        int[] array2 = {2};
        System.out.println(equals(array1, array2));
    }
}
