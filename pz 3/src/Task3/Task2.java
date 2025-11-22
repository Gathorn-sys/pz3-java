package Task3;

public class Task2 {
    public static void main(String[] args) {

        int[][] matrix = {
                { 1,  2,  3 },
                { 4,  5,  6 },
                { 7,  8,  9 }
        };

        int n = matrix.length;
        int product = 1;

        for (int i = 0; i < n; i++) {
            product *= matrix[i][i];
        }

        System.out.println("Добуток головної діагоналі = " + product);
    }
}