package Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = {3, 0, -5, 8, 2, 0, -1, 4};

        int prod = 1;
        for (int i = 0; i < arr.length; i += 2) {
            prod *= arr[i];
        }
        System.out.println("Добуток елементів на парних номерах: " + prod);

        int firstZero = -1, lastZero = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (firstZero == -1) firstZero = i;
                lastZero = i;
            }
        }

        int sum = 0;
        if (firstZero != -1 && lastZero > firstZero) {
            for (int i = firstZero + 1; i < lastZero; i++) {
                sum += arr[i];
            }
        }

        System.out.println("Сума між першим та останнім нулем: " + sum);

        ArrayList<Integer> plus = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();
        ArrayList<Integer> minus = new ArrayList<>();

        for (int x : arr) {
            if (x > 0) plus.add(x);
            else if (x == 0) zero.add(x);
            else minus.add(x);
        }

        int[] result = new int[arr.length];
        int index = 0;

        for (int x : plus) result[index++] = x;
        for (int x : zero) result[index++] = x;
        for (int x : minus) result[index++] = x;

        System.out.println("Перетворений масив: " + Arrays.toString(result));
    }
}