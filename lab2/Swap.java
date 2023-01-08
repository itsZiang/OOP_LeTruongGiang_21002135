public class Assignment_29 {

    public static boolean swap(int[] array1, int[] array2){
        if (array1.length == array2.length){
            for (int i = 0; i < array1.length; i++){
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] array1 = {1};
        int[] array2 = {2};

        if (swap(array1,array2)) System.out.println("success!");
        else System.out.println("not success");

        for (int i : array1) System.out.println(i);
    }
}
