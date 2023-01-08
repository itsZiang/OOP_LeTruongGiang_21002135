package strategy.sort;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        Random random = new Random();
        int n = random.nextInt(10, 21);
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = random.nextInt(0, n * 2);
        }

        SortStrategy sortStrategy = SortStrategy.getInstance();
        SortStrategy st1 = SortStrategy.getInstance();
        System.out.println("with getInstance(): " + (st1 == sortStrategy));

        String result = "";

        // bubble sort
        sortStrategy.setSortee(new BubbleSort());
        int[] arr = original.clone();
        result += "Using Bubble Sort Algorithm:\nBefore sorting: " + Arrays.toString(arr) + "\nAfter sorting: ";
        int numberOfSwaps = sortStrategy.sort(arr);
        result += Arrays.toString(arr) + "\nNumber of swap: " + numberOfSwaps + "\n\n";

        // selection sort
        sortStrategy.setSortee(new SelectionSort());
        arr = original.clone();
        result += "Using Selection Sort Algorithm:\nBefore sorting: " + Arrays.toString(arr) + "\nAfter sorting: ";
        numberOfSwaps = sortStrategy.sort(arr);
        result += Arrays.toString(arr) + "\nNumber of swap: " + numberOfSwaps + "\n\n";

        // insertion sort
        sortStrategy.setSortee(new InsertionSort());
        arr = original.clone();
        result += "Using Insertion Sort Algorithm:\nBefore sorting: " + Arrays.toString(arr) + "\nAfter sorting: ";
        numberOfSwaps = sortStrategy.sort(arr);
        result += Arrays.toString(arr) + "\nNumber of swap: " + numberOfSwaps;

        System.out.println(result);

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.

        try {
            FileWriter fileWriter = new FileWriter("SortStrategy1234.txt");
            fileWriter.write(result);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Can't write to file!");
            e.printStackTrace();
        }
    }
}
