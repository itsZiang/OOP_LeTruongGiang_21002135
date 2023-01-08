public class Assignment_28 {

    public static int[] copyOf(int[] array) {
        int[] out_arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            out_arr[i] = array[i];
        }
        return out_arr;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] out_arr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i < array.length)
                out_arr[i] = array[i];
            else out_arr[i] = 0;
        }
        return out_arr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] arr = copyOf(array, 6);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
