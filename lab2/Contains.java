public class Assignment_25 {

    public static boolean contains(int[] array, int key){
        for (int j : array) {
            if (j == key) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int key = 5;
        int[] array = {1,2,3,4,5,6};
        System.out.println(contains(array, key));
    }
}
