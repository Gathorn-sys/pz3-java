package Task1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        double[] arr = {0.5, -2.5, 3.1, 1.0, -1.2, 7.4, -0.8, 2.0};

        double sumOdd = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sumOdd += arr[i];
        }
        System.out.println("Сума елементів на непарних номерах: " + sumOdd);

        int firstNeg = -1, lastNeg = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (firstNeg == -1) firstNeg = i;
                lastNeg = i;
            }
        }

        double sumBetween = 0;
        if (firstNeg != -1 && lastNeg > firstNeg) {
            for (int i = firstNeg + 1; i < lastNeg; i++) {
                sumBetween += arr[i];
            }
        }

        System.out.println("Сума елементів між першим і останнім від’ємними: " + sumBetween);

        double[] compressed = new double[arr.length];
        int idx = 0;

        for (double x : arr) {
            if (Math.abs(x) > 1) {   
                compressed[idx++] = x;
            }
        }

        System.out.println("Стиснутий масив: " + Arrays.toString(compressed));
    }
}