package Task1;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        double[] arr = {0.0, -2.5, 3.1, 1.0, -1.2, 0.0, 7.4};

        double maxAbs = arr[0];
        for (double x : arr) {
            if (Math.abs(x) > Math.abs(maxAbs)) {
                maxAbs = x;
            }
        }
        System.out.println("Максимальний за модулем елемент: " + maxAbs);

        int firstPos = -1, secondPos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (firstPos == -1) firstPos = i;
                else { secondPos = i; break; }
            }
        }

        double sumBetween = 0;
        if (secondPos != -1) {
            for (int i = firstPos + 1; i < secondPos; i++) {
                sumBetween += arr[i];
            }
        }

        System.out.println("Сума між першим і другим додатними: " + sumBetween);

        double[] result = new double[arr.length];
        int idx = 0;

        for (double x : arr) {
            if (x != 0) result[idx++] = x;
        }

        System.out.println("Перетворений масив: " + Arrays.toString(result));
    }
}