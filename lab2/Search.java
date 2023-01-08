public class Assignment_26 {

    public static int search(int[] array, int key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {1};
        int key = 5;
        System.out.println(search(array, key));
    }
}
