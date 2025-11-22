package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5, -2, 10, 4, 7, 12, -1};

        while (true) {
            System.out.print("Введіть число A: ");
            int A = sc.nextInt();

            int count = 0;
            for (int x : arr) {
                if (x > A) count++;
            }

            System.out.println("Кількість елементів масиву більших за A = " + count);
        }
    }
}