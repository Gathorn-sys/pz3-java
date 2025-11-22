package Task1;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        double[] arr = {0.0, -2.5, 3.1, -1.0, 0.0, 7.4, -0.5};

        int zeroCount = 0;
        for (double x : arr) {
            if (x == 0) zeroCount++;
        }
        System.out.println("Кількість нулів: " + zeroCount);

        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        double sumAfter = 0;
        for (int i = minIndex + 1; i < arr.length; i++) {
            sumAfter += arr[i];
        }
        System.out.println("Сума після мінімального: " + sumAfter);

        Double[] arrObj = new Double[arr.length];
        for (int i = 0; i < arr.length; i++) arrObj[i] = arr[i];

        Arrays.sort(arrObj, (a, b) -> Double.compare(Math.abs(a), Math.abs(b)));

        System.out.println("Відсортований масив: " + Arrays.toString(arrObj));
    }
}