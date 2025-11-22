package Task3;

import java.util.Random;

public class Task3 {

    public static void fillMatrix(int[][] matrix) {
        Random rnd = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rnd.nextInt(41) - 20;  
            }
        }
    }

    public static double diagonalAverage(int[][] matrix) {
        int n = matrix.length;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        return sum / n;
    }

    public static void main(String[] args) {

        int n = 5;
        int[][] matrix = new int[n][n];

        fillMatrix(matrix);

        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int x : row) System.out.printf("%4d", x);
            System.out.println();
        }

        double avg = diagonalAverage(matrix);
        System.out.println("Середнє діагоналі = " + avg);

        int count = 0;
        for (int x : matrix[0]) {
            if (x < avg) count++;
        }

        System.out.println("Кількість елементів 1-го рядка, менших за середнє: " + count);
    }
}