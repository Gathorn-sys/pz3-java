package Task1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = {5, 7, 5, 2, 9, 2, 7, 1};

        Arrays.sort(arr); 
        int count = 1;    

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        System.out.println("Кількість різних чисел = " + count);
    }
}