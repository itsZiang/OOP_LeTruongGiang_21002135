public class BinarySearch {

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx > toIdx) {
            return false;
        } else {
            int midIdx = (fromIdx + toIdx) / 2;
            if (key == array[midIdx]) return true;
            else if (array[midIdx] > key) return binarySearch(array, key, fromIdx, midIdx - 1);
            else return binarySearch(array, key, midIdx + 1, toIdx);
        }
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(array, 1));
        System.out.println(binarySearch(array, 3));
        System.out.println(binarySearch(array, 5));
        System.out.println(binarySearch(array, 8));
    }
}
