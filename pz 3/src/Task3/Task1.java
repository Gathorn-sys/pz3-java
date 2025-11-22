package Task3;

public class Task1 {
    public static void main(String[] args) {

        int[][] matrix = {
                { 5, -1,  3 },
                { 7,  4, -2 },
                {-3,  8,  1 }
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int col = 0; col < cols; col++) {
            System.out.print("Стовпець " + col + ": ");

            boolean found = false;
            for (int row = 0; row < rows; row++) {
                if (matrix[row][col] < 0) {
                    System.out.print(row + " ");
                    found = true;
                }
            }

            if (!found) System.out.print("немає від’ємних елементів");
            System.out.println();
        }
    }
}