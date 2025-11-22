import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int n = 300;
        int[] arr = new int[n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(401) - 200;
        }

        System.out.println("Початковий масив:");
        System.out.println(Arrays.toString(arr));

        int i = 0;
        while (i < n) {

            if (arr[i] < 0) {
                int start = i;

                while (i < n && arr[i] < 0) {
                    i++;
                }
                int end = i - 1;

                processNegativeSequence(arr, start, end);

            } else {
                i++;
            }
        }

        System.out.println("\nПеретворений масив:");
        System.out.println(Arrays.toString(arr));
    }

    private static void processNegativeSequence(int[] arr, int start, int end) {

        int minIndex = start;
        int maxIndex = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[minIndex]) minIndex = i;
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}