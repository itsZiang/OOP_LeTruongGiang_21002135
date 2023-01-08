package sortstrategy;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int count = 0;
        for (int i = 1; i < data.length; ++i) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                count++;
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
            count++;
        }
        return count;
    }
}
