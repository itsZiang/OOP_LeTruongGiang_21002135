public class Assignment_24 {

    public static String arrayToString(int[] array) {
        String str = "[";
        if (array.length == 0) str += "]";
        else if (array.length == 1) str += array[0] + "]";
        else
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1)
                    str += array[i] + "]";
                else str += array[i] + ", ";
            }
        return str;
    }

    public static void main(String[] args) {
        int[] array = {1};
        System.out.println(arrayToString(array));
    }
}
